package com.dhanjyothi.service;

import java.util.List;

import com.dhanjyothi.model.User;

public interface RegisterService {

	public boolean saveRegister(User user);
	
	public boolean activateUser(String userId);

	public List<User> getAllUsers();
}
