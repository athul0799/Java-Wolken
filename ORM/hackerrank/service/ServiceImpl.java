package com.wolken.hackerrank.service;


import hackerrank.dao.DAOImpl;
import hackerrank.dao.DAO;
import hackerrank.dto.LoginDTO;
import hackerrank.dto.UserDTO;
import hackerrank.entity.LinkedinEntity;
import hackerrank.entity.UserEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;



	public class ServiceImpl implements RegistrationService {                                                  
		 
		public String validateAndSave(UserDTO dto) {
			
			DAO dao = (DAOImpl) new ClassPathXmlApplicationContext(
                    "hackerrank.xml").getBean("dao");
				UserEntity entity=new UserEntity();
		        if (dto !=null){
		        	if(dto.getId()>0) {
		        		if(!dto.getName().equals(null) && !dto.getName().equals("")) {
		        			if(!dto.getEmail().equals(null) && !dto.getEmail().equals("")) {
		        				if(dto.getContactNumber()>5999999999l && dto.getContactNumber()<9999999999l) {
		        					if(dto.getDob()!=null) {
		        						if(dto.getPassword().equals(dto.getCnfPassword())) {
		        							entity.setId(dto.getId());
		        				            entity.setName(dto.getUsername());
		        				            entity.setEmail(dto.getEmail());
		        				            Date date = new Date();
		        							try {
		        								date = new SimpleDateFormat("dd/MM/yyyy").parse(dto.getDob());
		        							} catch (ParseException e) {
		        								System.out.println(e.getMessage());
		        							}
		        							entity.setDob(date);
		        				            entity.setContactNumber(dto.getContactNumber());
		        				            entity.setPassword(dto.getPassword());
		        				            entity.setCnfPassword(dto.getCnfPassword());
		        				            System.out.println(entity);
		        						}
		        						else
		        							System.err.println("Password invalid");        					}
		        				}
		        				else
		        					System.out.println("DOB incorrect");
		        			}
		        			else
		        				System.out.println("contact number invalid");
		        		}
		        		else
		    				System.out.println("email invalid");
		        	}
		        	else
						System.out.println("name not valid");
		        }
		        RegistrationDAO dao=new RegistrationDAOImpl();
		        return dao.save(entity);
			}
			
			public String validateAndLogin(LoginDTO dto) {
				DAO dao = (DAOImpl) new ClassPathXmlApplicationContext(
		                "hackerrank.xml").getBean("dao");
				RegistrationDAO dao = new RegistrationDAOImpl();
				LoginEntity entity = dao.getByEmail(dto.getEmail());
				if(entity!=null) {
					if(entity.getEmail().equals(dto.getEmail())) {
						if(entity.getPassword().equals(dto.getPassword())) {
							System.out.println(entity);
							return "login successfull";
						}
						else {
							return "incorrect password";
						}
					}
					else {
						return "invalid email";
					}
				}
				else
					return "email or password invalid";
			}
		public String validateAndUpdatePassword(UserDTO dto) {
			DAO dao = (DAOImpl) new ClassPathXmlApplicationContext(
	                "hackerrank.xml").getBean("dao");
				RegistrationDAO dao = new RegistrationDAOImpl();
				UserEntity entity = new UserEntity();
				String out = "";
				if(dto!=null) {
					if(!dto.getEmail().equals(null) && !dto.getEmail().equals("")) {
						LoginEntity entityy = dao.getByEmail(dto.getEmail());
						if(entityy!=null) {
							entity.setId(entityy.getId());
							entity.setEmail(entityy.getEmail());
							entity.setContactNumber(entityy.getContactNumber());
							entity.Name(entityy.getName());
							entity.setDob(entityy.getDob());
							if(dto.getPassword().equals(dto.getCnfPassword())) {
								entity.setPassword(dto.getPassword());
								entity.setCnfPassword(dto.getCnfPassword());
								out = dao.updatePassword(entity);
								return out;
							}
							else
								return "password invalid"; }	
					}
					else 
						return "email invalid";
				}
				return "email id invalid";
			}
	}
