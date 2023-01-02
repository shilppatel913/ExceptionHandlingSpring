package com.masai.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.masai.app.entity.Post;

@SpringBootApplication
public class ExceptionhandlingApplication {

	public static void main(String[] args) {
	SpringApplication.run(ExceptionhandlingApplication.class, args);
		System.out.println("Application has started running");
		
	
	}
	
	@Bean
	public LocalValidatorFactoryBean validator(MessageSource ms) {
		LocalValidatorFactoryBean lvfb=new LocalValidatorFactoryBean();
		lvfb.setValidationMessageSource(ms);
		return lvfb;
	}

}
