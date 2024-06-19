package com.hkit.lessons.lesson;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/lesson/create")
@RequiredArgsConstructor
public class lessonController {
	
	private final lessonService ls;
	
	
	@GetMapping("/lesson/create")
	public String showCreateForm(Model model) {
	        return "lesson/create";
	    }

	@PostMapping("/lesson/create")
	public String createLesson() {
	        return "redirect:/lesson/create";
	    }

}
	

