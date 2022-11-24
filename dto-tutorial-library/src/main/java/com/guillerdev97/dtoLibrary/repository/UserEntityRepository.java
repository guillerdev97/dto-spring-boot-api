package com.guillerdev97.dtoLibrary.repository;

import com.guillerdev97.dtoLibrary.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {
}
