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

	
    private String memberId;

   
    private String password1 = "";
    

    private String password2 = "";
    
    private Date birth;
    
    private String phone;
    
    private String memberName;
    

    private String gender;

  
    private String email;
 
    private String address;
    

}
