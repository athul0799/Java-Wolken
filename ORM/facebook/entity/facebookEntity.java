package com.wolken.facebook.entity;

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
@Table(name="facebookentity")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries({
	@NamedQuery(name="getByEmail", query="from facebookEntity where email= :email"),
	@NamedQuery(name="updatePassword",query="update facebookEntity set password=:newPassword where email=: email")
}
)


public class facebookEntity {
	@Id
	private String email;
	private String password; 
}
