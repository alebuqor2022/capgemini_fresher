package com.indra.SpringAOP;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		SpringApplication.run(SpringAopApplication.class, args);
	}

}
//https://www.youtube.com/watch?v=lTfK_hOBVJc
//https://www.youtube.com/watch?v=5qXknPo3ZPk