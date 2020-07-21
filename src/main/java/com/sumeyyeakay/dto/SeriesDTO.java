package com.sumeyyeakay.dto;

import com.sumeyyeakay.model.Actors;
import lombok.Data;

import java.util.List;

@Data
public class SeriesDTO {

    private int seriesId;
    private String seriesName;
    private String seriesDescription;
    private byte[] seriesBanner;
    private String seriesLanguage;
    private List<Actors> seriesActors;
    private int seriesYear;

    private String actors;

}
