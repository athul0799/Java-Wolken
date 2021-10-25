package com.wolken.linkedin.dao;
import com.wolken.linkedin.entity.UserEntity;

public interface RegistrationDAO {

public int save(UserEntity entity);
public LinkedinEntity getByEmail(String email);
public int updatePassword(UserEntity entity);
}
