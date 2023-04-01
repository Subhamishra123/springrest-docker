package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
	
	@GetMapping("/{name}")
	public ResponseEntity<String> greetMsg(@PathVariable("name") String name)
	{
		return new ResponseEntity<String>("Hello "+name,HttpStatus.ACCEPTED);
		
	}

}
