package com.guillerdev97.dto.repository;

import com.guillerdev97.dto.model.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationEntityRepository extends JpaRepository<LocationEntity, Long> {
}
