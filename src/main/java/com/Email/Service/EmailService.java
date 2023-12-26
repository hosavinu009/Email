package com.Email.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.Email.Entity.EmailDetails;
import com.Email.Repository.EmailRepo;

@Service
public class EmailService {

	@Autowired
	private EmailRepo emailRepo;
	
	
	public EmailDetails saveDetails(EmailDetails emails) {
		return emailRepo.save(emails);
	}
	public EmailDetails getEmailById(int  userid) {
		return emailRepo.findById(userid).orElse(null);
		
	}

}

