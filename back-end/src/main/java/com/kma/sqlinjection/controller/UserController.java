package com.kma.sqlinjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kma.sqlinjection.service.UserService;

@RestController
@RequestMapping(value = "api/user")
@CrossOrigin
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping(value = "/get-user")
	ResponseEntity<?> getUser(@RequestParam String username) {
		return ResponseEntity.ok(userService.getUsers(username));
	}

	@DeleteMapping(value="/delete")
	ResponseEntity<?> deleteUser(@RequestParam String id) {
		userService.deleteUser(id);
		return ResponseEntity.ok(null);
	}
}
