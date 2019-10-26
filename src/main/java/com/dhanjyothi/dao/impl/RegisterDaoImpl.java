package com.dhanjyothi.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dhanjyothi.dao.RegisterDao;
import com.dhanjyothi.model.User;

@Repository
public class RegisterDaoImpl implements RegisterDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveRegister(User customer) {

		Session session = sessionFactory.getCurrentSession();
		session.persist(customer);
	}

	public List<User> getAllUsers() {
		
		Session session = sessionFactory.getCurrentSession();
		String hbl = "FROM User";
		List<User> li = (List)session.createQuery(hbl);
		return li;
	}

}
