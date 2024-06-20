package com.hkit.lessons;

import java.time.LocalDateTime;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hkit.lessons.lesson.lesson;
import com.hkit.lessons.lesson.lessonRepository;
import com.hkit.lessons.member.Member;
import com.hkit.lessons.member.MemberRepository;

@SpringBootTest
class LessonsApplicationTests {

	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private lessonRepository lr;
	
	@Test
	void testCreate() {
		Member m1 = new Member();
		
		m1.setAddress("대구시 범어동");
		m1.setBirth(new Date(1995, 11, 5));
		m1.setEmail("abc@naver.com");
		m1.setGender("M");
		m1.setInterest("음악");
		m1.setMbti("INTP");
		m1.setMemberId("hkit");
		m1.setMemberName("홍길동");
		m1.setPassword("1234");
		m1.setPhone("010-1234-5678");
		
		this.memberRepository.save(m1);
	}
	

		//@Test
		void testLesson() {
			lesson l1 = new lesson();
			
			l1.setLname("강의 제목입니다.");
			l1.setPrice(39800);
			l1.setCreateDate(LocalDateTime.now());
			this.lr.save(l1);
		} 
	}

