package com.kma.sqlinjection.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.kma.sqlinjection.dao.UserDAO;
import com.kma.sqlinjection.entity.UserEntity;

@Repository
public class UserDAOImpl implements UserDAO {
	@PersistenceContext
	EntityManager em;

//	@Override
//	@Transactional
//	public List<UserEntity> getUsers(String fullName) {
//		String sql = "SELECT * FROM tbl_user WHERE full_name LIKE '%" + fullName + "%'";
//		Query query = em.createNativeQuery(sql);
//		List<UserEntity> listUser = query.getResultList();
//		return listUser;
//	}
//
//	@Override
//	@Transactional
//	public void deleteUser(String id) {
//		String sql = "DELETE FROM tbl_user WHERE id ='" + id + "'";
//		Query query = em.createNativeQuery(sql);
//		query.executeUpdate();
//	}

	@Override
	@Transactional
	public List<UserEntity> getUsers(String fullName) {
		String sql = "SELECT * FROM tbl_user WHERE full_name LIKE :fullName ";
		Query query = em.createNativeQuery(sql).setParameter("fullName", "%" + fullName + "%");
		List<UserEntity> listUser = query.getResultList();
		return listUser;
	}

	@Override
	@Transactional
	public void deleteUser(String id) {
		String sql = "DELETE FROM tbl_user WHERE id = :id";
		Query query = em.createNativeQuery(sql).setParameter("id", id);
		query.executeUpdate();
	}

}
