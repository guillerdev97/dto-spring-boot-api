package com.guillerdev97.dtoLibrary.service;

import com.guillerdev97.dtoLibrary.dto.UserLocationDTO;

import java.util.List;

public interface UserEntityService {
    List<UserLocationDTO> getAllUsersLocation();
}
