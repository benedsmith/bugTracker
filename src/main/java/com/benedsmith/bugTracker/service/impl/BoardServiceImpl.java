package com.benedsmith.bugTracker.service.impl;

import com.benedsmith.bugTracker.model.Board;
import com.benedsmith.bugTracker.model.data.BoardDTO;
import com.benedsmith.bugTracker.model.request.BoardRequest;
import com.benedsmith.bugTracker.service.BoardService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    public BoardDTO getBoard(String id) {
        return BoardDTO.builder().build();
    }

    @Override
    public List<Board> getAllBoards() {
        return null;
    }

    @Override
    public BoardDTO createBoard(BoardRequest boardRequest) {
        return null;
    }

}
