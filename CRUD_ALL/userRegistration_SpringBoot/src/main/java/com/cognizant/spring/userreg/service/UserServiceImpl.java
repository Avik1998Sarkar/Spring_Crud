package com.cognizant.spring.userreg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.spring.userreg.dao.UserDao;
import com.cognizant.spring.userreg.dto.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;

	@Override
	public String insert(User user) {
		return userdao.insert(user);
	}

	@Override
	public String update(User user) {
		return userdao.update(user);
	}

	@Override
	public String delete(int id) {
		return userdao.delete(id);
	}

	@Override
	public List<User> getAll() {
		return userdao.getAll();
	}

}
