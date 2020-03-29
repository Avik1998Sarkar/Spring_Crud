package com.cognizant.spring.userreg.service;

import java.util.List;

import com.cognizant.spring.userreg.dto.User;

public interface UserService {
	String insert(User user);

	String update(User user);

	String delete(int id);

	List<User> getAll();
}
