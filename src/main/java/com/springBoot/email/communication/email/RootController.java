package com.springBoot.email.communication.email;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
	@Autowired
	private SmtpMailSender mailSender;
	@RequestMapping("/sendmail/{email}")
	public String sendEmail(@PathVariable String email) throws MessagingException
	{
		
			
			mailSender.send(email, "TestMail", "Hai This is Magesh test mail");
		
		return "Mail Sent";
	}

}
