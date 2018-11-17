package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;
import com.service.ILoginService;

@Controller
@RequestMapping("/login")
public class loginController {

	@Autowired
	private ILoginService implLoginService;

	// Ó³ÉäÒ»¸öaction
	@RequestMapping("/index")
	public void index(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession,
			@RequestParam String userName, @RequestParam String password) throws IOException {
		User user = implLoginService.userAccount(userName, password);
		System.out.println("######index######");
		if (user != null) {
			httpSession.setAttribute("userName", userName);
		}
		response.sendRedirect(request.getContextPath() + "/homePage/index.html");
//		response.setStatus(302);
//	    response.setHeader("location",request.getContextPath() + "/homePage/index.html");
	}
}
