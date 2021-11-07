package com.wolken.gmail.entity;
import com.wolken.gmail.entity.UserEntity;

public interface DAO {
	
	public int save(UserEntity entity);
	public LinkedinEntity getByEmail(String email);
	public int updatePassword(UserEntity entity);

}
