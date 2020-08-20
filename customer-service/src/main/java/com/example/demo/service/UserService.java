package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.User;

public interface UserService {
	public Iterable<User> getAllUser();
	public Optional<User> findUserById(String customerId);
	public Optional<User> findUserByName(String name);
}
