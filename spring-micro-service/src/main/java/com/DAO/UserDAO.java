package com.DAO;

import com.model.User;
import com.model.Users;

public interface UserDAO {
	public Users getAllUser();
	public void addUser(User u);
}
