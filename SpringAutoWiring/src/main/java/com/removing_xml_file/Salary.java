package com.removing_xml_file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Salary {


	private int salary;
	
	
	private int bonous;

	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salary(int salary, int bonous) {
		super();
		this.salary = salary;
		this.bonous = bonous;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonous() {
		return bonous;
	}

	public void setBonous(int bonous) {
		this.bonous = bonous;
	}

	@Override
	public String toString() {
		return "Salary [salary=" + salary + ", bonous=" + bonous + "]";
	}
	
	
}
