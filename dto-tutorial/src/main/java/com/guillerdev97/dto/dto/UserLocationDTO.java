package com.guillerdev97.dto.dto;

import lombok.Data;

@Data
public class UserLocationDTO {
    private String userId;
    private String email;
    private String place;
    private double longitude;
    private double latitude;
}
