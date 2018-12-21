package com.sys.securitydemo.Services;

import com.sys.securitydemo.Models.User;

public interface UserService {
	
	public void save(User user);
	
	User findByUsername(String username);

}
