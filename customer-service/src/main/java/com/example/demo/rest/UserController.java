package com.example.demo.rest;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.repo.UserDao;


@RestController
@RequestMapping("/api")
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	@GetMapping("/users")
	public ResponseEntity<Iterable<User>> getAllCustomer()
	{
		return new ResponseEntity<Iterable<User>>(userService.getAllUser(),HttpStatus.OK);
	}
	@GetMapping("/users/{Id}")
	public ResponseEntity<Optional<User>> findCustomerById(@PathVariable("Id") String userId)
	{
		return ResponseEntity.status(HttpStatus.FOUND).body(userService.findUserById(userId));
	}
	@GetMapping("/users/{name}")
	public ResponseEntity<Optional<User>> findCustomerByName(@PathVariable("name") String userId)
	{
		return ResponseEntity.status(HttpStatus.FOUND).body(userService.findUserByName(userId));
	}
	
	
	
	

}
