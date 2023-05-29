package com.benedsmith.bugTracker.service;

import com.benedsmith.bugTracker.model.Board;
import com.benedsmith.bugTracker.model.data.BoardDTO;
import com.benedsmith.bugTracker.model.request.BoardRequest;

import java.util.List;

public interface BoardService {

    BoardDTO getBoard(String id);

    List<Board> getAllBoards();

    BoardDTO createBoard(BoardRequest boardRequest);
}
