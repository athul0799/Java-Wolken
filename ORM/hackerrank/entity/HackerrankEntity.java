package com.wolken.hackerrank.entity;

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
@Table(name="hackerrankinentity")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries({
	@NamedQuery(name="getByEmail", query="from HackerrankEntity where email= :email"),
	@NamedQuery(name="updatePassword",query="update HackerrankEntity set password=:newPassword where email=: email")
}
)


public class HackerrankEntity {
	@Id
	private String email;
	private String password; 
}
