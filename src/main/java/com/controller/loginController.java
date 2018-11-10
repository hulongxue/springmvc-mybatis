package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.ILoginService;

@RestController
@RequestMapping("/login")
public class loginController {

	@Autowired
	private ILoginService implLoginService;

	// Ó³ÉäÒ»¸öaction
	@RequestMapping("/index")
	public User index(@RequestParam String userName, @RequestParam String password) {
		User user = implLoginService.userAccount(userName, password);
		return user;
	}
}
