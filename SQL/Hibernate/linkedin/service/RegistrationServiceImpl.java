package com.wolken.linkedin.service;

	import com.wolken.linkedin.dao.RegistrationDAO;
	import com.wolken.linkedin.dao.RegistrationDAOImpl;
	import com.wolken.linkedin.dto.UserDTO;
	import com.wolken.linkedin.entity.UserEntity;

	public class RegistrationServiceImpl implements RegistrationService {
	RegistrationDAO dao=new RegistrationDAOImpl();
	@Override
	public String validateAndSave(UserDTO dto) {
		UserEntity entity=new UserEntity();
		entity.setName(dto.getName());
		entity.setId(dto.getId());
		entity.setEmail(dto.getEmail());
		entity.setPassword(dto.getPassword());
		entity.setDesignation(dto.getDesignation());
		
		int rows=dao.save(entity);
		System.out.println(rows);
		return null;
		}
	}
