package com.abdul;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@SpringBootApplication
public class PayroleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayroleApplication.class, args);

	}
	@Bean
	CommandLineRunner initData(EmployeeRespository respository,ManageRepository manageRepository){
		return args ->{
		    Manager manager=manageRepository.save(new Manager("abdulqader"));
		    Manager manager2=manageRepository.save(new Manager("saleh"));

			respository.save(new Employee("abdul","mohammed","programmer", manager));
			respository.save(new Employee("anwar","mohammed","manager",manager));
			respository.save(new Employee("chocho","chichi","headMaster",manager2));

		};
	}

}
