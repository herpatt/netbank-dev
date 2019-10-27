package com.dhanjyothi.security.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dhanjyothi.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}

	@Override
	public User findByUserName(String userName) {
		Session session = getSessionFactory().getCurrentSession();
		return (User) session.createQuery("from User where userName='" + userName + "' and userStatus='A'").uniqueResult();
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
	}

	@Override
	public User save(User user) {
		Session session = getSessionFactory().getCurrentSession();
		session.save(user);
		return user;
	}

	@Override
	public User update(User user) {
		Session session = getSessionFactory().getCurrentSession();
		session.update(user);
		return user;
	}
}