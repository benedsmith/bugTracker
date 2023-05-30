package com.benedsmith.bugTracker.service.impl;

import com.benedsmith.bugTracker.model.Ticket;
import com.benedsmith.bugTracker.model.data.BoardDTO;
import com.benedsmith.bugTracker.model.request.TicketRequest;
import com.benedsmith.bugTracker.repository.TicketRepository;
import com.benedsmith.bugTracker.service.TicketService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    TicketRepository ticketRepository;

    @Override
    public BoardDTO createTicket(String boardId, TicketRequest ticketRequest) {
        return null;
    }

    @Override
    public List<Ticket> getTicketsOnBoard(String boardId) {
        return ticketRepository.findByBoardid(boardId);
    }
}
