package com.guillerdev97.dto.service.impl;

import com.guillerdev97.dto.dto.UserLocationDTO;
import com.guillerdev97.dto.model.UserEntity;
import com.guillerdev97.dto.repository.UserEntityRepository;
import com.guillerdev97.dto.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserEntityServiceImpl implements UserEntityService {
    private UserEntityRepository userEntityRepository;

    @Autowired
    public UserEntityServiceImpl(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public List<UserLocationDTO> getAllUsersLocation() {
        return userEntityRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    private UserLocationDTO convertEntityToDto(UserEntity userEntity) {
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setUserId(userEntity.getId());
        userLocationDTO.setEmail(userEntity.getEmail());
        userLocationDTO.setPlace(userEntity.getLocation().getPlace());
        userLocationDTO.setLongitude(userEntity.getLocation().getLongitude());
        userLocationDTO.setLatitude(userEntity.getLocation().getLatitude());

        return userLocationDTO;
    }
}
