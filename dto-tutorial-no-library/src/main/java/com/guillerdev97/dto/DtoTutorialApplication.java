package com.guillerdev97.dto;

import com.guillerdev97.dto.model.LocationEntity;
import com.guillerdev97.dto.model.UserEntity;
import com.guillerdev97.dto.repository.LocationEntityRepository;
import com.guillerdev97.dto.repository.UserEntityRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DtoTutorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DtoTutorialApplication.class, args);
	}

	private UserEntityRepository userEntityRepository;

	private LocationEntityRepository locationEntityRepository;

	@Autowired
	public DtoTutorialApplication(UserEntityRepository userEntityRepository,
								  LocationEntityRepository locationEntityRepository) {
		this.userEntityRepository = userEntityRepository;
		this.locationEntityRepository = locationEntityRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		LocationEntity locationEntity = new LocationEntity();
		locationEntity.setPlace("Madrid");
		locationEntity.setDescription("Madrid is a great place to live");
		locationEntity.setLongitude(40.6);
		locationEntity.setLatitude(30.5);

		locationEntityRepository.save(locationEntity);

		UserEntity user1 = new UserEntity(
				null,
				"guiller@gmail.com",
				"Guillermo",
				"Fernández",
				"password",
				locationEntity
		);

		userEntityRepository.save(user1);

		UserEntity user2 = new UserEntity(
				null,
				"pablo@gmail.com",
				"Pablo",
				"García",
				"password",
				locationEntity
		);

		userEntityRepository.save(user2);
	}
}
