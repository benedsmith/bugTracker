package com.benedsmith.bugTracker.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Board {

    @Id
    private String id;
    private String name;

}
