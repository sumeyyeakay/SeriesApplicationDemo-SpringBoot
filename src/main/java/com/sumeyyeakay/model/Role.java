package com.sumeyyeakay.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Role
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Boolean isActive;



}
