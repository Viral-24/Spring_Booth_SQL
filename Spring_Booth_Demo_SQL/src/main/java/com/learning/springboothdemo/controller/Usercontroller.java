package com.learning.springboothdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboothdemo.model.springbootdb;
import com.learning.springboothdemo.services.IDAO;
@RestController
public class Usercontroller {

	@Autowired
	IDAO idao;
	
	@GetMapping("/")
	public String greet() {
		return "Welcome to Spring Booth Demo SQL";
	}
	
	@PutMapping("/add")
	public ResponseEntity<String> putrecord(){
		springbootdb model=new springbootdb(2, "Parth", "parth@gmail.com", "Bandra");
		springbootdb data=idao.save(model);
		if(data!=null) {
			return new ResponseEntity<String>("Record Added", HttpStatus.GONE);
		}
		return new ResponseEntity<>(HttpStatus.CONFLICT);
	}
}
