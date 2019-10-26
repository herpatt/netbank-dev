package com.dhanjyothi.security.dao;

import com.dhanjyothi.model.User;

public interface UserDao {

	public User findByUserName(String userName);

	void delete(User user);

	User save(User user);

	User update(User user);

}