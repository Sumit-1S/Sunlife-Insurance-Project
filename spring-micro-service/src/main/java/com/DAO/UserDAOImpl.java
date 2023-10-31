package com.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.model.User;
import com.model.Users;

@Repository
public class UserDAOImpl implements UserDAO {

	private static Users userList = new Users();

	
	static {
		userList.getUsers().add(new User("sumit","a@gmail.com","GGN"));
		userList.getUsers().add(new User("anshu","b@gmail.com","HW"));
		userList.getUsers().add(new User("saumya","c@gmail.com","LKO"));
		System.out.println(userList);
	}
	
	@Override
	public Users getAllUser() {
		return userList;
	}

	@Override
	public void addUser(User u) {
		System.out.println(userList + "dao");
		userList.getUsers().add(u);
		// TODO Auto-generated method stub

	}

}
