package com.benedsmith.bugTracker.model.data;

import com.benedsmith.bugTracker.model.Ticket;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BoardDTO {
    String id;
    String name;
    List<Ticket> tickets;
}
