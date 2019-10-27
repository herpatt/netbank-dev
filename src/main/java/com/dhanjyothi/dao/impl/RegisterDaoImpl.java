package com.dhanjyothi.dao.impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.dhanjyothi.dao.RegisterDao;
import com.dhanjyothi.model.User;

@Repository
public class RegisterDaoImpl implements RegisterDao {

	@Autowired
	private SessionFactory sessionFactory;
	
    @Autowired
    private PasswordEncoder passwordEncoder;	

	public void saveRegister(User customer) {
		customer.setPassword(passwordEncoder.encode(customer.getPassword()));
		customer.setUserRole("C");
		customer.setUserStatus("A");
		customer.setUserId(UUID.randomUUID().toString());
		
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
