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

	@Override
	public boolean saveRegister(User customer) {
		try {
			registerDao.saveRegister(customer);
			return true;
		} catch(Exception e) {
			e.printStackTrace();	
		}
		return false;
	}
	
	@Override
	public boolean activateUser(String userId) {
		try {
			registerDao.activateUser(userId);
			return true;
		} catch(Exception e) {
			e.printStackTrace();	
		}
		return false;
	}	

	public List<User> getAllUsers() {
		return registerDao.getAllUsers();
	}

}
