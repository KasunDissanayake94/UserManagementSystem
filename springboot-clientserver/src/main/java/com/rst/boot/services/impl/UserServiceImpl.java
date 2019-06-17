package com.rst.boot.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rst.boot.model.UserModel;
import com.rst.boot.repositories.UserRepository;
import com.rst.boot.services.UserServices;


@Service
public class UserServiceImpl implements UserServices{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserModel> getAllUsers() {
		List<UserModel> allUsers = userRepository.findAll();
		return allUsers;
	}

	@Override
	public String saveUser(UserModel userdata) {
		// TODO Auto-generated method stub
		userRepository.save(userdata);
		return "Data SAVED";
	}

	@Override
	public String updateUser(UserModel newuserdata) {
		// TODO Auto-generated method stub
		String messageString = null;
		if(newuserdata.getID() != null) {
			userRepository.save(newuserdata);
			messageString = "Data Updated";
			return messageString;
		}else {
			messageString = "Failed to Update";
			return messageString;
		}
	
	}

	@Override
	public Optional<UserModel> findUser(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

}
