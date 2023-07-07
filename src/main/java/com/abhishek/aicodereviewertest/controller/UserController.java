package com.abhishek.aicodereviewertest.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/users")
	public List getUsers() {
		return List.of("user1", "user2", "user3", "user4");
	}

}
