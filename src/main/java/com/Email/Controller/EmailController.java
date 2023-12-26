package com.Email.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Email.Entity.EmailDetails;
import com.Email.Service.EmailService;

@RestController
public class EmailController {
     
	@Autowired
	private EmailService emailService;
	
	
	@PostMapping("/addEmails")
	public EmailDetails addEmails( @RequestBody EmailDetails email) {
		return emailService.saveDetails(email);
		
	}
	
	@GetMapping("/getEmailByID/{id}")
	public EmailDetails fetchDetailsById( @PathVariable int userid) {
		return emailService.getEmailById(userid);
	}
}
