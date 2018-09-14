package com.example.studentInfo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.example.studentInfo.entities.StudentInformation;
//import com.example.studentInfo.repositories.StudentInformationRepos;

@Controller
public class StudentsController {

	@Autowired
	//private StudentInformationRepos sRepos;

	//StudentInformation sInfo = new StudentInformation();

	@RequestMapping("/login.oop")
	public String showLoginForm() {
		return "login/login";
	}

	@RequestMapping(value = "successLogin")
	public String logStudentIn() {

		return "success";
	}
}
