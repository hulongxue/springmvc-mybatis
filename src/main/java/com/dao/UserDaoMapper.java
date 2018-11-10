package com.dao;

import org.apache.ibatis.annotations.Param;

import com.model.User;

/**
 * DAO�ӿ�,mybatis��̬���Impl
 */
public interface  UserDaoMapper {

	public User queyUserByNameAndPassword(@Param("userName")String userName, @Param("password")String password);
	
	public User addUser(User user);
 
	public String deleteUserById(String userId);

}
