package com.dhanjyothi.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanjyothi.dao.LoginDao;
import com.dhanjyothi.model.User;
import com.dhanjyothi.service.LoginService;

@Transactional
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;

	public int validateUser(User user) {
		return loginDao.validateUser(user);

	}

}
