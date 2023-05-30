package com.benedsmith.bugTracker.controller;

import com.benedsmith.bugTracker.model.data.BoardDTO;
import com.benedsmith.bugTracker.model.request.TicketRequest;
import com.benedsmith.bugTracker.service.TicketService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping(value = "/board/{boardId}/ticket", produces = "application/json")
    public BoardDTO createTicket(@PathVariable String boardId,
                                 @RequestBody TicketRequest ticketRequest) {
        return ticketService.createTicket(boardId, ticketRequest);
    }

}
