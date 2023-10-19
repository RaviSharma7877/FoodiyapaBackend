package com.masai.Service;

import com.masai.models.Users;

public interface UserService {

	public Users addUser(Users customer);
	
	public Users login(String username);
}
