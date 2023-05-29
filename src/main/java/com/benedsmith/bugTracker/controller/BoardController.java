package com.benedsmith.bugTracker.controller;

import com.benedsmith.bugTracker.model.Board;
import com.benedsmith.bugTracker.model.data.BoardDTO;
import com.benedsmith.bugTracker.model.request.BoardRequest;
import com.benedsmith.bugTracker.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BoardController {

    BoardService boardService;

    @GetMapping(value = "/board/{id}", produces = "application/json")
    public BoardDTO getBoard(@PathVariable String id) {
        return boardService.getBoard(id);
    }

    @GetMapping(value = "/board", produces = "application/json")
    public List<Board> getAllBoards() {
        return boardService.getAllBoards();
    }

    @PostMapping(value = "/board", produces = "application/json")
    public BoardDTO createBoard(@RequestBody BoardRequest boardRequest) {
        return boardService.createBoard(boardRequest);
    }

}
