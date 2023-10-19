package com.masai.Service;

import java.util.Optional;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.masai.Repository.UserRepository;
import com.masai.models.Users;



@Service
public class ManualUserDetailsService implements UserDetailsService {
	
	
//	@Autowired
	private UserRepository uRepo;
	
	

	public ManualUserDetailsService(UserRepository uRepo) {
        this.uRepo = uRepo;
    }



	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Users> optional = uRepo.findByUsername(username);
		if(!optional.isPresent())
			throw new BadCredentialsException("User not found with email "+username);
		
		Users customer = optional.get();
//		return new User(customer.getUsername(), customer.getPassword(), null);
		return new ManualUserDetails(customer);
	}

}
