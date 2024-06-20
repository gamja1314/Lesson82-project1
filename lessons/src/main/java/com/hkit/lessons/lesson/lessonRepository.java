package com.hkit.lessons.lesson;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface lessonRepository extends JpaRepository<lesson, Long> {
	
}
