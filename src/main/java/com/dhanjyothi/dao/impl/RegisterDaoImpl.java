package com.dhanjyothi.dao.impl;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.dhanjyothi.dao.RegisterDao;
import com.dhanjyothi.model.User;
import com.dhanjyothi.security.dao.UserDao;
import com.dhanjyothi.security.service.UserPrincipal;

@Repository
public class RegisterDaoImpl implements RegisterDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private UserDao userDao;

	public void saveRegister(User customer) {
		final User user = userDao.findByUserName(customer.getUserName());
		if (user == null) {
			customer.setPassword(passwordEncoder.encode(customer.getPassword()));
			customer.setUserRole("C");
			customer.setUserStatus("N");
			customer.setUserId(UUID.randomUUID().toString());

			Session session = sessionFactory.getCurrentSession();
			session.persist(customer);
		} else {
			throw new RuntimeException("User already exist !!");
		}
	}

	public List<User> getAllUsers() {
		Session session = sessionFactory.getCurrentSession();
		String hbl = "FROM User";
		List<User> li = (List<User>) session.createQuery(hbl).list();
		return li;
	}

	@Override
	public void activateUser(String userId) {
		Session session = sessionFactory.getCurrentSession();
		User user = (User) session.createQuery("from User where userId='" + userId + "' ").uniqueResult();
		user.setUserStatus("A");
		session.update(user);
	}
}