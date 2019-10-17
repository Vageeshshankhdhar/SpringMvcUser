package com.tb.service;

import java.util.ArrayList;
import java.util.List;

import com.tb.model.Login;
import com.tb.model.User;

public class UserServiceImpl implements UserService {
	List<User> users = new ArrayList<User>();

	@Override
	public void register(User user) {
		users.add(user);
		
	}

	@Override
	public User validateUser(Login login) {
		User usrTOReturn =null;
		for (User user : users) {
			if (login.getUsername().equals(user.getUsername())&&login.getPassword().equals(user.getPassword())) {
				usrTOReturn = user;
			}
		}
		return usrTOReturn;
	}
	
}
