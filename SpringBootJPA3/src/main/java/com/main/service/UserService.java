package com.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.User;
import com.main.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAll() {
		ArrayList<User> arl = new ArrayList<User>();
		userRepository.findAll().forEach(arl::add);
		return arl;
	}

	public void add(User u) {
		userRepository.save(u);
	}
}
