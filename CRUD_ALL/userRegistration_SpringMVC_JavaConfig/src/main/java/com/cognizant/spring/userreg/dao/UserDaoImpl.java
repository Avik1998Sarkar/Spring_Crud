package com.cognizant.spring.userreg.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cognizant.spring.userreg.dto.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public String insert(User user) {
		String sql = "insert into user values(?, ?, ?)";
		int res = jdbcTemplate.update(sql, user.getId(), user.getName(), user.getEmail());
		if(res == 1){
			return "SUCCESS";
		}else {
			return "FAILED";
		}
	}

	@Override
	public String update(User user) {
		String sql = "update user set name = ?, email = ? where id = ?";
		int res = jdbcTemplate.update(sql, user.getName(), user.getEmail(),  user.getId());
		if(res == 1){
			return "SUCCESS";
		}else {
			return "FAILED";
		}
	}

	@Override
	public String delete(int id) {
		String sql = "delete from user where id = ?";
		int res = jdbcTemplate.update(sql, id);
		if(res == 1){
			return "SUCCESS";
		}else {
			return "FAILED";
		}
	}

	@Override
	public List<User> getAll() {
		String sql = "select * from user";
		RowMapper<User> rowMapper = new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setEmail(rs.getString(3));
				return user;
			}
			
		};
		List<User> list = jdbcTemplate.query(sql, rowMapper);
		return list;
	}

}
