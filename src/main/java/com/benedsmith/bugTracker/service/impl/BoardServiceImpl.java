package com.benedsmith.bugTracker.service.impl;

import com.benedsmith.bugTracker.model.Board;
import com.benedsmith.bugTracker.model.data.BoardDTO;
import com.benedsmith.bugTracker.model.request.BoardRequest;
import com.benedsmith.bugTracker.repository.BoardRepository;
import com.benedsmith.bugTracker.service.BoardService;
import com.benedsmith.bugTracker.service.TicketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class BoardServiceImpl implements BoardService {

    BoardRepository boardRepository;
    TicketService ticketService;

    public BoardDTO getBoard(String id) {
        Optional<Board> boardOptional = boardRepository.findById(id);

        if (boardOptional.isPresent()) {
            Board board = boardOptional.get();

            return BoardDTO.builder()
                    .id(board.getId())
                    .name(board.getName())
                    .tickets(ticketService.getTicketsOnBoard(board.getId()))
                    .build();

        } else {
            log.error("getBoard failed: No board exists for id: {}", id);
            return BoardDTO.builder().build();
        }
    }

    @Override
    public List<Board> getAllBoards() {
        // future work: make sort configurable
        return boardRepository.findAll();
    }

    @Override
    public BoardDTO createBoard(BoardRequest boardRequest) {
        Board board = Board.builder()
                .id(UUID.randomUUID().toString())
                .name(boardRequest.getName())
                .build();

        boardRepository.saveAndFlush(board);
        return getBoard(board.getId());
    }

}
