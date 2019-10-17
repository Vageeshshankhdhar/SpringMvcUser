package com.tb.service;

import com.tb.model.Login;
import com.tb.model.User;

public interface UserService {
	void register(User user) ;
	User validateUser(Login login);
}
