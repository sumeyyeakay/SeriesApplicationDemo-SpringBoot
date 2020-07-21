package com.sumeyyeakay.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class UsersDTO {
    private UUID id;
    private String name;
    private String surname;
    private String emailAddress;
    private String password;



    private RoleDTO roleFk;
    private Boolean isActive;
}
