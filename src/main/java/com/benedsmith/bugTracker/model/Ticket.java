package com.benedsmith.bugTracker.model;

import com.benedsmith.bugTracker.model.enums.TicketPriority;
import com.benedsmith.bugTracker.model.enums.TicketState;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
public class Ticket {

    @Id
    private String id;
    @NonNull
    private String boardid;
    private String title;
    @NonNull
    private TicketState state;
    private String description;
    private TicketPriority priority;
    private LocalDateTime createddate;
    private LocalDateTime modifieddate;

}

