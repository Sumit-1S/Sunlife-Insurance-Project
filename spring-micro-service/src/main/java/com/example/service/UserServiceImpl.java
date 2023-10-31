package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.UserDAO;
import com.DAO.UserService;
import com.model.User;
import com.model.Users;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;
	
	@Override
	public void addUser(User user) throws Exception {
		// TODO Auto-generated method stub
		if(user.getName().isEmpty())
			throw new Exception("no name found");
		userDAO.addUser(user);
	}

	@Override
	public Users getAllUser() {
		System.out.println(userDAO.getAllUser() + "service");
		return userDAO.getAllUser();
	}
	
}
