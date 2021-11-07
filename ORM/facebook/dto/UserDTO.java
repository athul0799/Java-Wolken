package com.wolken.facebook.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class UserDTO {
	@Getter
	@Setter
	@ToString

		private int Id;
		private String Name;
		private String email;
		private String Password;
		private String Designation;
		private String dob;
		

}
