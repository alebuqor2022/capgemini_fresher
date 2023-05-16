package com.capgemini.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.capgemini.curso.service.EmailSenderService;

@SpringBootApplication
public class SendEmailApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SendEmailApplication.class, args);
		
		ConfigurableApplicationContext appCtxt=	SpringApplication.run(SendEmailApplication.class, args);
	
		EmailSenderService emailSenderService=appCtxt.getBean(EmailSenderService.class);
		emailSenderService.sendEmail("uno@gmail.com", "dos@gmail.com", "mi demo", "es mi testeo");
	}

}
