package com.hkit.lessons.member;



import java.sql.Date;
import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hkit.lessons.DataNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	
	private final MemberRepository memberRepository;
	private final PasswordEncoder passwordEncoder;
	
	public Member create(String memberId, String email, String password, String phone, String memberName,
			String address, Date birth, String interest, String mbti, String gender) {
		
		Member member = new Member();
		
		member.setMemberId(memberId);
		member.setPassword(passwordEncoder.encode(password));
		member.setBirth(birth);
		member.setPhone(phone);
		member.setMemberName(memberName);
		member.setEmail(email);
		member.setGender(gender);
		member.setInterest(interest);
		member.setMbti(mbti);
		member.setAddress(address);
		
		this.memberRepository.save(member);
		
		return member;
	} 
	
	public Member getMember(String MemberId) {
		Optional<Member> Member = this.memberRepository.findByMemberId(MemberId);
		if (Member.isPresent()) {
			return Member.get();
		}else {
			throw new DataNotFoundException("Member not found");
		}
	}
}

