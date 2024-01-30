package com.nginxspringboot;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public UserEntity save(String username) throws Exception {
		System.out.println("Request: POST /user");

		if (username.equals("")) {
			throw new Exception("Invalid username");
		}

		UserEntity userEntity = new UserEntity(username);

		return this.userRepository.save(userEntity);
	}

	public UserEntity get(String userId) throws Exception {
		System.out.println("Request: GET /user/" + userId);

		Optional<UserEntity> findUserEntity = this.userRepository.findById(UUID.fromString(userId));

		if (findUserEntity.isEmpty()) {
			throw new Exception("User not found");
		}

		return findUserEntity.get();
	}
	
	public void delete(String userId) throws Exception {
		System.out.println("Request: DELETE /user" + userId);

		Optional<UserEntity> findUserEntity = this.userRepository.findById(UUID.fromString(userId));

		if (findUserEntity.isEmpty()) {
			throw new Exception("User not found");
		}

		this.userRepository.deleteById(UUID.fromString(userId));
	}
}
