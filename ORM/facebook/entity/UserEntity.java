package com.wolken.facebook.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Getter
@Setter
@Entity
@Table
@ToString
@NoArgsConstructor
@AllArgsConstructor	


public class UserEntity {
	@Id
	private String Id;
	private String Name;
	private String Email;
	private String Password;
	private String Designation;
	private Date dob;

}
