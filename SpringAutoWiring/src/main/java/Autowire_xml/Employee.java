package Autowire_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("address2")
	private Address address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee( Address address) {
		super();
		System.out.println("i am inside constructor");
		this.address = address;
	}
	
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		
		this.address = address;
	System.out.println("i am inside setter");	
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
}
