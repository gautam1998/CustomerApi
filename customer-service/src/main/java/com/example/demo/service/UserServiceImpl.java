package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserDao;

@Service
public class UserServiceImpl implements UserService {
	
	private UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
	this.userDao = userDao;
	}

	@Override
	public Iterable<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public Optional<User> findUserById(String customerId) {
		// TODO Auto-generated method stub
		return userDao.findById(customerId);
	}

	@Override
	public Optional<User> findUserByName(String name) {
		// TODO Auto-generated method stub
		return userDao.findByUserName(name);
	}

	

	
	
	
	
	
	
}
