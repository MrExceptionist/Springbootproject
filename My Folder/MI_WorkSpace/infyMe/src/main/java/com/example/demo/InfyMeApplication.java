package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo"})
public class InfyMeApplication implements CommandLineRunner{
	
	@Autowired
	private TeamService teamService; 
	
	@Autowired
	ApplicationContext context;

	public static void main(String[] args) {
		System.out.println("hi");
		SpringApplication.run(InfyMeApplication.class, args);
		System.out.println("Hoka");
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Thready");
		TeamService objTeamService = (TeamService) context.getBean("teamService");
		objTeamService.insertCallDao();
		//teamService.insertCallDao();
		System.out.println("Records added successfully");
		
	}

}
