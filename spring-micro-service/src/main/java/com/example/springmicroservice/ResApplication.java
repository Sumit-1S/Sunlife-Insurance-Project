package com.example.springmicroservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.DAO.UserService;
import com.model.User;
import com.model.Users;

@RestController
@RequestMapping("/home")
public class ResApplication {
	
	@Autowired
	UserService service;
	
	@PostMapping("/register")
	public String registerValidate(@RequestBody User user) throws Exception{
		service.addUser(user);
		return "Registered User";
	}
	
	@GetMapping("/getAllUser")
	public Users getAllUser(){
		System.out.println(service.getAllUser() + "cont");
		return service.getAllUser();
	}
	

}
