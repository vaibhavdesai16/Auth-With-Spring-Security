package com.sys.securitydemo.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.securitydemo.Models.User;
import com.sys.securitydemo.Repositories.UserRepo;

@Service
public class UserServiceImpl implements com.sys.securitydemo.Services.UserService{
	@Autowired
	UserRepo userRepo;

	@Override
	public void save(User user) {
		userRepo.save(user);
	}

	@Override
	public User findByUsername(String username) {
		
		return userRepo.findByUsername(username);
	}

}
