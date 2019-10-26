package com.dhanjyothi.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanjyothi.dao.RegisterDao;
import com.dhanjyothi.model.User;
import com.dhanjyothi.service.RegisterService;

@Transactional
@Service
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	private RegisterDao registerDao;


	public void saveRegister(User customer) {
		registerDao.saveRegister(customer);

	}

	public List<User> getAllUsers() {
		return registerDao.getAllUsers();
	}

}
