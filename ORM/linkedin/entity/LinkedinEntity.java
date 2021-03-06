package com.wolken.linkedin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name="linkedinentity")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries({
	@NamedQuery(name="getByEmail", query="from LinkedinEntity where email= :email"),
	@NamedQuery(name="updatePassword",query="update LinkedinEntity set password=:newPassword where email=: email")
}
)


public class LinkedinEntity {
	@Id
	private String email;
	private String password; 
}
