package com.guillerdev97.dtoLibrary.service.impl;

import com.guillerdev97.dtoLibrary.dto.UserLocationDTO;
import com.guillerdev97.dtoLibrary.model.UserEntity;
import com.guillerdev97.dtoLibrary.repository.UserEntityRepository;
import com.guillerdev97.dtoLibrary.service.UserEntityService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserEntityServiceImpl implements UserEntityService {
    private UserEntityRepository userEntityRepository;

    private ModelMapper modelMapper;

    @Autowired
    public UserEntityServiceImpl(UserEntityRepository userEntityRepository,
                                 ModelMapper modelMapper) {
        this.userEntityRepository = userEntityRepository;
        this.modelMapper = modelMapper;
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
        userLocationDTO = modelMapper.map(userEntity, UserLocationDTO.class);
        return userLocationDTO;
    }
}
