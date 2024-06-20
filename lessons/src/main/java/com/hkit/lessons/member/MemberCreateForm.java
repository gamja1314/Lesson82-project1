package com.hkit.lessons.member;

import java.sql.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberCreateForm {

	@Size(min = 3, max = 25)
    @NotEmpty(message = "사용자ID는 필수항목입니다.")
    private String memberId;

	@Size(min = 7, max = 25)
    @NotEmpty(message = "비밀번호는 필수항목입니다.")
    private String password1;

	@Size(min = 7, max = 25)
    @NotEmpty(message = "비밀번호 확인은 필수항목입니다.")
    private String password2;
    
    @NotEmpty(message = "생년월일은 필수항목입니다.")
    private Date birth;
    
    @NotEmpty(message = "전화번호는 필수항목입니다.")
    private String phone;
    
    @NotEmpty(message = "이름은 필수항목입니다.")
    private String memberName;
    
    @NotEmpty(message = "성별은 필수항목입니다.")
    private String gender;

    @NotEmpty(message = "이메일은 필수항목입니다.")
    @Email
    private String email;
      
    private String interest;
    
    private String mbti;
    
    @NotEmpty(message = "주소는 필수항목입니다.")
    private String address;
    

}
