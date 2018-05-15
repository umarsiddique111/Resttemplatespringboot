package com.examplespringboot.springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.model.PersonDTO;



@RestController
public class PersonRestController {
	
	@RequestMapping(value = "/regestion", method =  RequestMethod.POST,produces = "application/json", consumes = "application/json")
    @ResponseBody
    public PersonDTO paeronadd()  {
 
        PersonDTO personDto = new PersonDTO();
        personDto.setId(12);
        personDto.setFirstName("salman");
        personDto.setSecondName("ali");
        personDto.setProfession("enger");
        personDto.setSalary(12000);
 
        return personDto;
    }
	
    

}


