package com.nginxspringboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

class Request {
	public String username;
}

@RestController()
public class UserController {
	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/user")
	public ResponseEntity<Object> save(@RequestBody Request request) {
		try {
			UserEntity userEntity = this.userService.save(request.username);

			return ResponseEntity.status(201).body(userEntity);
		} catch (Exception exception) {
			return ResponseEntity.status(400).body(exception.getMessage());
		}
	}

	@GetMapping("/user/{userId}")
	public ResponseEntity<Object> save(@PathVariable String userId) {
		try {
			UserEntity userEntity = this.userService.get(userId);

			return ResponseEntity.status(200).body(userEntity);
		} catch (Exception exception) {
			return ResponseEntity.status(404).body(exception.getMessage());
		}
	}

	@DeleteMapping("/user/{userId}")
	public ResponseEntity<Object> delete(@PathVariable String userId) {
		try {
			this.userService.delete(userId);

			return ResponseEntity.status(200).body("");
		} catch (Exception exception) {
			return ResponseEntity.status(404).body(exception.getMessage());
		}
	}
}
