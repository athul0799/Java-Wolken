package com.wolken.linkedin.dto;
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
		private long Password;
		private String Designation;
		private String dob;
		
	}
