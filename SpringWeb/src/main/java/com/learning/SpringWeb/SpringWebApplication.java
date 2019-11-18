package com.learning.SpringWeb;

import org.apache.log4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringWebApplication {
	private static Logger log = Logger.getLogger(SpringWebApplication.class);
	public static void main(String[] args) {
		log.setLevel(Level.INFO);
		ApplicationContext applicationContext= SpringApplication.run(SpringWebApplication.class, args);
		for (String string : applicationContext.getBeanDefinitionNames()) {
			log.info("Hi I am in SpringWebApplication"+string);
		}
	}

}
