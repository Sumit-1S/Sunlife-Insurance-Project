package com.DAO;

import java.util.List;

import com.model.User;
import com.model.Users;

public interface UserService {
	public void addUser(User user)throws Exception ;
	public Users getAllUser();
}
