package com.guillerdev97.dtoNoLibrary.repository;

import com.guillerdev97.dtoNoLibrary.model.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationEntityRepository extends JpaRepository<LocationEntity, Long> {
}
