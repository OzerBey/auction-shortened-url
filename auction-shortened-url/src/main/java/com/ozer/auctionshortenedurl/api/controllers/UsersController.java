package com.ozer.auctionshortenedurl.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ozer.auctionshortenedurl.business.abstracts.UserService;
import com.ozer.auctionshortenedurl.core.utilities.results.DataResult;
import com.ozer.auctionshortenedurl.core.utilities.results.Result;
import com.ozer.auctionshortenedurl.entities.concretes.User;

@RestController
@RequestMapping("/user")
public class UsersController {
	private UserService userService;

	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/list")
	public DataResult<List<User>> getAll() {
		return this.userService.getAll();
	}

	@PostMapping("/signup")
	public Result add(User user) {
		return userService.add(user);
	}

}
