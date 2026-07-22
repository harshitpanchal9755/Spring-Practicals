package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.dao.UserDao;
import com.rays.dto.UserDto;

@Service
@Transactional
public class UserService {

	@Autowired
	UserDao dao;

	@Transactional(propagation = Propagation.REQUIRED)
	public void save(UserDto dto) {

		if (dto.getId() > 0) {
			dao.update(dto);
			return;
		}

		dao.add(dto);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(int id) {
		dao.Delete(id);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public UserDto findById(int id) {
		return dao.findByPk(id);
	}

}
