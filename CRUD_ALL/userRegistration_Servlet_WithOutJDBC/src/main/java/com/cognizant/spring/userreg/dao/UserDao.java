package com.cognizant.spring.userreg.dao;

import java.util.List;

import com.cognizant.spring.userreg.model.User;

public interface UserDao {
	String insert(User user);

	String update(User user);

	String delete(User user);

	List<User> getall();
}
