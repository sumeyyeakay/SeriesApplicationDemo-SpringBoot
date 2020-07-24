package com.sumeyyeakay.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class Series implements Serializable {
    private static final long serialVersionUID = 4868624973343083042L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seriesId;

    @Column(nullable = false)
    private String seriesName;

    @Column(nullable = false,  length = 500)
    private String seriesDescription;

    @Lob
    @Column(nullable = false)
    private byte[] seriesBanner;

    @Column(nullable = false)
    private String seriesLanguage;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(unique = true , nullable = false)
    private List<Actors> seriesActors;


    @Column(nullable = false)
    private int seriesYear;

    @Column(nullable = false)
    private String seriesTour;

    private String actors;



}
