package com.rst.boot.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rst.boot.model.UserModel;
import com.rst.boot.services.UserServices;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class User {
	
	
	@Autowired
	private UserServices userservices;
	
	
	@GetMapping("/getUsers")
	public List<UserModel> getUsers() {
		return userservices.getAllUsers();
	}
	
	@PostMapping("/add")
	public String saveUser(@RequestBody UserModel userdata) {
		return userservices.saveUser(userdata);
	}
	
	@PutMapping("/update")
	public String updateUser(@RequestBody UserModel userdata) {
		return userservices.updateUser(userdata);
	}
	
	@GetMapping("/find/{id}")
	public Optional<UserModel> findUser(@PathVariable Integer id) {
		return userservices.findUser(id);
	}
	

}
