package com.wolken.linkedin.entity;
import com.wolken.linkedin.entity.UserEntity;

public interface DAO {
	
	public int save(UserEntity entity);
	public LinkedinEntity getByEmail(String email);
	public int updatePassword(UserEntity entity);

}
