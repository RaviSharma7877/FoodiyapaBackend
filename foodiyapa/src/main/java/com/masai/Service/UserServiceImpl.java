package com.masai.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.masai.Repository.UserRepository;
import com.masai.models.Users;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository cRepo;
	
	@Autowired
	private PasswordEncoder passwE;
	
	
	public UserServiceImpl(UserRepository cRepo) {
		super();
		this.cRepo = cRepo;
	}

	@Override
	public Users addUser(Users user) {
		user.setPassword(passwE.encode(user.getPassword()));
		return cRepo.save(user);
	}
	
	@Override
	public Users login(String username) {
		return cRepo.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("username not found"));
	}


}
