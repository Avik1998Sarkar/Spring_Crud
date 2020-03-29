package com.cognizant.spring.userreg.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cognizant.spring.userreg.model.User;

public class UserDaoImpl implements UserDao {
	private List<User> userList = new ArrayList<User>(
			Arrays.asList(new User(1, "Avik", "meetaviksarkar@gmail.com"), new User(2, "Piku", "piku@yahoo.com")));

	public String insert(User user) {
		for (User use : userList) {
			if (user.getId() == use.getId()) {
				return "FAILED";
			}
		}
		if (userList.add(user)) {
			return "SUCCESS";
		} else {
			return "FAILED";
		}
	}

	public String update(User user) {
		for (User use : userList) {
			if (user.getId() == use.getId()) {
				use.setName(user.getName());
				use.setEmail(user.getEmail());
				return "SUCCESS";
			}
		}
		return "FAILED";
	}

	public String delete(User user) {
		for (User use : userList) {
			if (user.getId() == use.getId()) {
				userList.remove(use);
				return "SUCCESS";
			}
		}
		return "FAILED";
	}

	public List<User> getall() {
		System.out.println(userList);
		return userList;
	}

}
