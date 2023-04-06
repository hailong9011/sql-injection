package com.kma.sqlinjection.dao;

import java.util.List;

import com.kma.sqlinjection.entity.UserEntity;

public interface UserDAO {
	public List<UserEntity> getUsers(String username);
	public void deleteUser(String id);
}