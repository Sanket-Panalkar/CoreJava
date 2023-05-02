package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Person {

    @Value("sanket")
    private String name;
    
    @Value("Male")
    private String gender;
    
    @Value("Software Engineer")
    private String occupation;
    
    @Value("indian")
    private String nationality;
    
    @Value("mudhol")
    private String birthplace;
    
    @Value("BE")
    private String education;
    
    @Value("sanketp.xworkz@email.com")
    private String email;
    
    @Value("7337686718")
    private String phone;
    
    @Value("UnMarried")
    private String maritalStatus;
    
    @Value("BE ECE")
    private String educationLevel;

}
