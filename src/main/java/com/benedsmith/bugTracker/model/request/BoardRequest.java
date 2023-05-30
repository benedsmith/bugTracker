package com.benedsmith.bugTracker.model.request;

import lombok.Data;

@Data
public class BoardRequest {
    String name;

    // space to add more board customization in here, such as:
    // allowed states, custom id, description, image...
}
