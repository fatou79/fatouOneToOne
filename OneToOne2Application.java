package com.fatou.OneToOne2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatou.OneToOne2.repository.StudentRepository;

@SpringBootApplication
public class OneToOne2Application implements CommandLineRunner{
	private Logger diop  = LoggerFactory.getLogger(this.getClass()); 
	

	@Autowired
	StudentRepository sr;

	public static void main(String[] args) {
		SpringApplication.run(OneToOne2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		sr.saveWithPassport();
		
	}

}
