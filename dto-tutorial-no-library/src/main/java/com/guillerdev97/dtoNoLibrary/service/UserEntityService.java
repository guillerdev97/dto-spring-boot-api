package com.guillerdev97.dtoNoLibrary.service;

import com.guillerdev97.dtoNoLibrary.dto.UserLocationDTO;

import java.util.List;

public interface UserEntityService {
    List<UserLocationDTO> getAllUsersLocation();
}
