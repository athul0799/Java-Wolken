package com.wolken.facebook.entity;
import com.wolken.facebook.entity.UserEntity;

public interface DAO {
	
	public int save(UserEntity entity);
	public facebookEntity getByEmail(String email);
	public int updatePassword(UserEntity entity);

}
