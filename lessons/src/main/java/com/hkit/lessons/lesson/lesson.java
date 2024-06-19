package com.hkit.lessons.lesson;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@Table(name = "lesson")
public class lesson {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long lesson_num;
	
	@Column(nullable = false, length = 50)
    private String lname;
	
	@Column(name="price", nullable = false)
    private int price;
	
	private LocalDateTime createDate;
	
	private LocalDateTime modifyDate;
	

	
}