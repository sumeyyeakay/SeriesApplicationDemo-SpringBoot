package com.sumeyyeakay.dto;

import lombok.Data;

@Data
public class ActorsDTO {

    private int idActors;
    private String actorName;
    private String actorRole;

    private Boolean isActive;
}
