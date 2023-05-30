package com.benedsmith.bugTracker.service;

import com.benedsmith.bugTracker.model.Ticket;
import com.benedsmith.bugTracker.model.data.BoardDTO;
import com.benedsmith.bugTracker.model.request.TicketRequest;

import java.util.List;

public interface TicketService {

    BoardDTO createTicket(String boardId, TicketRequest ticketRequest);
    List<Ticket> getTicketsOnBoard(String boardId);

}
