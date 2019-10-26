package com.dhanjyothi.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dhanjyothi.dao.LoginDao;
import com.dhanjyothi.model.User;

@Repository
public class LoginDaoImpl implements LoginDao {
	@Autowired
	private SessionFactory sessionFactory;

	public int validateUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		User us = session.get(User.class, user.getUserId());
		if (us != null) {
			if (user.getPassword() == us.getPassword()) {
				return 0;
			}
		}
		return 1;
	}
}