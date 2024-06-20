package com.hkit.lessons.member;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
	
	private final MemberService ms;
	
	@GetMapping("/layout")
    public String layout() {
    	return "layout";
    }

	
	@GetMapping("/login")
    public String login() {
    	return "login_form";
    }
	
	@GetMapping("/signup")
    public String signup(MemberCreateForm memberCreateForm) {
        return "signup_form";
    }

    @PostMapping("/signup")
    public String signup(@Valid MemberCreateForm memberCreateForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "signup_form";
        }

        if (!memberCreateForm.getPassword1().equals(memberCreateForm.getPassword2())) {
            bindingResult.rejectValue("password2", "passwordInCorrect", 
                    "2개의 패스워드가 일치하지 않습니다.");
            return "signup_form";
        }
        
        try {
        	ms.create(memberCreateForm.getMember_id(), memberCreateForm.getEmail(),
        			memberCreateForm.getPassword1(), memberCreateForm.getPhone(),
        			memberCreateForm.getMember_name(),  memberCreateForm.getAddress(),
        			memberCreateForm.getBirth(), memberCreateForm.getInterest(), 
        			memberCreateForm.getMbti(), memberCreateForm.getGender());
        			
        			
        }catch(DataIntegrityViolationException e) {
            e.printStackTrace();
            bindingResult.reject("signupFailed", "이미 등록된 사용자입니다.");
            return "signup_form";
        }catch(Exception e) {
            e.printStackTrace();
            bindingResult.reject("signupFailed", e.getMessage());
            return "signup_form";
        }
        

      
        return "redirect:/member";
    }
}
