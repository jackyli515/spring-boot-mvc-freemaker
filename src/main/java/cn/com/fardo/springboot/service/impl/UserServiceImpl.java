/**
 * 
 */
package cn.com.fardo.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import cn.com.fardo.springboot.service.UserService;

/**
 * @author lmq
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	/* (non-Javadoc)
	 * @see cn.com.fardo.springboot.service.UserService#create(java.lang.String, java.lang.Integer)
	 */
	@Override
	public void create(String name, Integer age) {
		jdbcTemplate.update("insert into USER(name, age) values (?,?)",name,age);

	}

	/* (non-Javadoc)
	 * @see cn.com.fardo.springboot.service.UserService#deleteByName(java.lang.String)
	 */
	@Override
	public void deleteByName(String name) {
		jdbcTemplate.update("delete from USER where NAME=?", name);

	}

	/* (non-Javadoc)
	 * @see cn.com.fardo.springboot.service.UserService#getUsersCount()
	 */
	@Override
	public Integer getUsersCount() {
		int count = jdbcTemplate.queryForObject("select count(1) from user",Integer.class);
		return count;
	}

	/* (non-Javadoc)
	 * @see cn.com.fardo.springboot.service.UserService#deleteAllUsers()
	 */
	@Override
	public void deleteAllUsers() {
		jdbcTemplate.update("delete from USER");

	}

}
