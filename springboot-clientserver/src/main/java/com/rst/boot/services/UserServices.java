package com.rst.boot.services;

import java.util.List;
import java.util.Optional;

import com.rst.boot.model.UserModel;

public interface UserServices {
	
	List<UserModel> getAllUsers();

	String saveUser(UserModel userdata);
	
	String updateUser(UserModel userdata);
	
	Optional<UserModel> findUser(Integer id);
	

	
};
