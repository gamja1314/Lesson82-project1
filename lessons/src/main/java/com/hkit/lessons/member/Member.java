package com.hkit.lessons.member;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long memberNum;
	
	@Column(unique = true)
	private String memberId;
	
	private String password;
	
	private Date birth;
	
	private String phone;
	
	private String memberName;
	
	private String email;
	
	private String gender;
	
	private String address;

	
	
}

