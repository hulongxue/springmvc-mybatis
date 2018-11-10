package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDaoMapper;
import com.model.User;

@Service
public class ImplLoginService implements ILoginService {

	@Autowired(required=false)
	private UserDaoMapper userDao;
	
	@Override
	public User userAccount(String userName, String password) {
		User user = userDao.queyUserByNameAndPassword(userName, password);
		return user;
	}

}
