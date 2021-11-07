
package com.wolken.linkedin.service;

public interface RegistrationService {
	
	String validateAndSave(UserDTO dto);
	  String validateAndLogin(LoginDTO ldto);
	  String validateAndUpdatePassword(String email);

}
