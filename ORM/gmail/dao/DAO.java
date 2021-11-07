package com.wolken.gmail.entity;
import com.wolken.gmail.entity.UserEntity;

public interface DAO {
	
	public int save(UserEntity entity);
	public gmailEntity getByEmail(String email);
	public int updatePassword(UserEntity entity);

}
