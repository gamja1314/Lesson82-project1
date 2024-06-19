package com.hkit.lessons.member;



import java.sql.Date;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	
	private final MemberRepository memberRepository;
	private final PasswordEncoder passwordEncoder;
	
	public Member create(String member_id, String email, String password, String phone, String member_name,
			String address, Date birth, String interest, String mbti, String gender) {
		
		Member member = new Member();
		
		member.setMember_id(member_id);
		member.setPassword(passwordEncoder.encode(password));
		member.setBirth(birth);
		member.setPhone(phone);
		member.setMember_name(member_name);
		member.setEmail(email);
		member.setGender(gender);
		member.setInterest(interest);
		member.setMbti(mbti);
		member.setAddress(address);
		
		this.memberRepository.save(member);
		
		return member;
	}
	
}

