package com.wolken.hackerrank.entity;
import com.wolken.hackerrank.entity.UserEntity;

public interface DAO {
	
	public int save(UserEntity entity);
	public HackerrankEntity getByEmail(String email);
	public int updatePassword(UserEntity entity);

}
