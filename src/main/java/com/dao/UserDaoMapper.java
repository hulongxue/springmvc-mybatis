package com.dao;

import org.apache.ibatis.annotations.Param;

import com.model.User;

/**
 * DAO接口,mybatis动态完成Impl
 */
public interface  UserDaoMapper {

	public User queyUserByNameAndPassword(@Param("userName")String userName, @Param("password")String password);
	
	public User addUser(User user);
 
	public String deleteUserById(String userId);

}
