package com.cognizant.spring.userreg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.spring.userreg.dto.User;

@Repository
public interface UserDao {
	String insert(User user);

	String update(User user);

	String delete(int id);

	List<User> getAll();
}
