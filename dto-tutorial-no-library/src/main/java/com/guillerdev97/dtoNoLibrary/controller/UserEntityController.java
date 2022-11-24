package com.guillerdev97.dtoNoLibrary.controller;

import com.guillerdev97.dtoNoLibrary.dto.UserLocationDTO;
import com.guillerdev97.dtoNoLibrary.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserEntityController {
    private UserEntityService userEntityService;

    @Autowired
    public UserEntityController(UserEntityService userEntityService) {
        this.userEntityService = userEntityService;
    }

    @GetMapping("/users/location")
    public ResponseEntity<List<UserLocationDTO>> getAllUsersLocation() {
        return ResponseEntity.ok().body(userEntityService.getAllUsersLocation());
    }
}
