package com.example.demo.controller;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailSendingController {
	@Autowired
	private JavaMailSender jms;

	@GetMapping(value = "/sendmail")
	public String sendmail() {

		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("amolraskar5685@gmail.com");
		msg.setSubject("this mail send");
		msg.setText("hello this mail create springBoot Application.... ");
		jms.send(msg);
		return "Mail Send Successfully";
	}

	@GetMapping(value = "/sendfile")
	public String sendfile() throws MessagingException {
		MimeMessage mimeMessage = jms.createMimeMessage();

		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

		helper.setTo("amolraskar5685@gmail.com");
		helper.setSubject("File Sending or Attachment Send");
		helper.setText("Check File ...!");

		ClassPathResource classPathResource = new ClassPathResource("npKey.txt");

		helper.addAttachment(classPathResource.getFilename(), classPathResource);
		
		
		jms.send(mimeMessage);
		return "mail Sending  With attchement";

	}
}
