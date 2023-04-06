package com.kma.sqlinjection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kma.sqlinjection.dao.UserDAO;
import com.kma.sqlinjection.entity.UserEntity;

@Service
public class UserService {
	@Autowired
	UserDAO userDAO;

	public List<UserEntity> getUsers(String username) {
		return userDAO.getUsers(username);
	}

	public void deleteUser(String id) {
		userDAO.deleteUser(id);
	}
}