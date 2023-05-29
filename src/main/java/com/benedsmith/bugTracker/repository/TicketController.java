package com.benedsmith.bugTracker.repository;

import com.benedsmith.bugTracker.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketController extends JpaRepository<Ticket, String> {

    @Override
    List<Ticket> findAllById(Iterable<String> strings);
}
