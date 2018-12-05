package com.tamc.oauth.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Entity - 会员
 * @author umeox
 */
@Entity
@Table(name = "ux_member")
@Data
public class Member implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String username;
	private String password;

	public Member(Member member){
		super();
		this.username = member.getUsername();
		this.password = member.getPassword();
	}
	
	public Member() {

	}


}
