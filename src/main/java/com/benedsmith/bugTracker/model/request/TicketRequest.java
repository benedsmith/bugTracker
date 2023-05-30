package com.benedsmith.bugTracker.model.request;

import com.benedsmith.bugTracker.model.enums.TicketPriority;
import com.benedsmith.bugTracker.model.enums.TicketState;
import lombok.Data;
import org.springframework.lang.NonNull;

@Data
public class TicketRequest {

    @NonNull
    private String title;
    @NonNull
    private String description;
    @NonNull
    private TicketState state;
    @NonNull
    private TicketPriority priority;

}
