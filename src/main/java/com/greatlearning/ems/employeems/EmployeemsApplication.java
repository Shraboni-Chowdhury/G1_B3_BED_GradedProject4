package com.greatlearning.ems.employeems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.greatlearning.ems.employeems","com.greatlearning.ems.employeems.dao","com.greatlearning.ems.employeems.entity","com.greatlearning.ems.employeems.controller","com.greatlearning.ems.employeems.security","com.greatlearning.ems.employeems.service"})
public class EmployeemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemsApplication.class, args);
	}

}
