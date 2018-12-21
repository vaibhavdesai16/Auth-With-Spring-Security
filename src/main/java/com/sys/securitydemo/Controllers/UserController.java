package com.sys.securitydemo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sys.securitydemo.Models.User;
import com.sys.securitydemo.Services.UserService;
import com.sys.securitydemo.ServicesImpl.UserServiceImpl;

@RestController
@RequestMapping(value = "user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping(value = "/create", headers = "Accept=application/json")
	public String createUser(@RequestBody User user){
		System.out.println(user.getUsername() + " " + user.getPassword());
		userService.save(user);
		return "true";
	}
	

	@GetMapping(value = "/test")
	public String test(){
		System.out.println("testing ");
		return "test pass";
	}

}
