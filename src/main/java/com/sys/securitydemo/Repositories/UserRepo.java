package com.sys.securitydemo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sys.securitydemo.Models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	
	public User findByUsername(String username);

}
