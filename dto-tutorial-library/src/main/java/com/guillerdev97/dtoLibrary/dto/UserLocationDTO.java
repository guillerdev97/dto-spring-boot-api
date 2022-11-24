package com.guillerdev97.dtoLibrary.dto;

import lombok.Data;

@Data
public class UserLocationDTO {
    private Long userId;
    private String email;
    private String place;
    private double longitude;
    private double latitude;
}
