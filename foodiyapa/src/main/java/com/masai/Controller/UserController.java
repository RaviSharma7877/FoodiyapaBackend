package com.masai.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Service.UserService;
import com.masai.models.Users;

@RestController
public class UserController {

	
	private UserService cusS;

	public UserController(UserService cusS) {
		super();
		this.cusS = cusS;
	}
	
	@PostMapping("/users")
	public ResponseEntity<Users> addUser(@RequestBody Users user) {
		return new ResponseEntity<Users>(cusS.addUser(user),HttpStatus.CREATED);
	}
	
	@GetMapping("/signIn")
	public ResponseEntity<String> login(Authentication auth){
		System.out.println(auth);
		System.out.println("inside signIn");
		Users user= cusS.login(auth.getName());
		return new ResponseEntity<>(user.getUsername()+" Logged In Successfully", HttpStatus.ACCEPTED);
	}
}
