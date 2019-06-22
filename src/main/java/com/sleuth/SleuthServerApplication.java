package com.sleuth;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SleuthServerApplication {

	private static final Logger log = Logger.getLogger(SleuthServerApplication.class.getName());
	
	public static void main(String[] args) {
		SpringApplication.run(SleuthServerApplication.class, args);
	}
	
	
	@RequestMapping("/home")
	public String gethome() {
		log.log(Level.INFO, "Start Home Service!");
		log.log(Level.INFO, "Processing Home Service!");
		log.log(Level.INFO, "End Home Service!");
		return "Home";
	}

}
