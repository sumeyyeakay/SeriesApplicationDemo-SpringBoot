package com.sumeyyeakay.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Actors {
    @Id
    @GeneratedValue
    private int idActors;

    @Column(nullable = false)
    private String actorName;

    @Column(nullable = false)
    private String actorRole;




}
