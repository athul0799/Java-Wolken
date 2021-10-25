package com.wolken.linkedin.service;
import com.wolken.linkedin.dto.LoginDTO;
import com.wolken.linkedin.dto.UserDTO;

public interface RegistrationService {
String validateAndSave(UserDTO dto);
  String validateAndLogin(LoginDTO ldto);
  String validateAndUpdatePassword(String email)
}
