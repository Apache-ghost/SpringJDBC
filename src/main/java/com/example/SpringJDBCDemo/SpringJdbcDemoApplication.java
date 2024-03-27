package com.example.SpringJDBCDemo;

import com.example.SpringJDBCDemo.model.Alien;
import com.example.SpringJDBCDemo.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args){
	ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);
		Alien alien=context.getBean(Alien.class);
		alien.setId(444);
		alien.setName("learn");
		alien.setTech("java");

		AlienRepo repo=context.getBean(AlienRepo.class);
		repo.save(alien);

		System.out.println(repo.findAll());
	}

}
