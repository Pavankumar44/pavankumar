package com.example.demo.Restcontroller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
		
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable Long id) {
		Optional<User> user = userRepository.findById(id);
		return new ResponseEntity<>(user, HttpStatus.FOUND);
		
	}
	
	@GetMapping("/users/address/{address}")
	public List<User> getUserByAddress(@PathVariable String address) {
		List<User> users = userRepository.findByAddress(address);
		return users;
		
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable Long id) {
		
		userRepository.deleteById(id);
	}
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		
		User savedUser = userRepository.save(user);
		return savedUser;
	}
	
	
	

}
