package com.service;

import com.model.User;

public interface ILoginService {

	public User userAccount(String userName, String password);
	
}
