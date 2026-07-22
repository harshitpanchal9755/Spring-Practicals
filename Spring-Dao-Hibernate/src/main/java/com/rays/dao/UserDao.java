package com.rays.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.hibernate.SessionFactory; /// sessionfactory ka object me import org.hibernate.sessionfactory ka package hota ha
import com.rays.dto.UserDto;

@Repository
public class UserDao {
	@Autowired
	SessionFactory sessionFactory;

	public int add(UserDto dto) {
		Session session = sessionFactory.getCurrentSession();
		session.save(dto);
		return dto.getId();
	}

	public void update(UserDto dto) {
		Session session = sessionFactory.getCurrentSession();
		session.update(dto);
	}

	public void Delete(int id) {
		Session session = sessionFactory.getCurrentSession();

		UserDto dto = findByPk(id);

		session.delete(dto);
	}

	public UserDto findByPk(int id) {

		Session session = sessionFactory.getCurrentSession();
		UserDto dto = session.get(UserDto.class, id);
		return dto;
	}

}
