package com.removing_xml_file;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.removing_xml_file")
public class config {

	@Bean
	public Salary sal() {
		Salary s=new Salary(100000,50000); 
		return s;
	}
	 
	@Bean
	public Employee emp()
	{
		Employee e= new Employee(101,"Keerti","Bhopal",sal());
		return e;
			
	}
	
}
