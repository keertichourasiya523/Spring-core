package com.learner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class test {

	public static void main(String[] args) {

		ApplicationContext context= 
				new ClassPathXmlApplicationContext("com/learner/config3.xml");
		Learner l1 = context.getBean("bean1",Learner.class);
		
		Course c = context.getBean("B1",Course.class);
		
		System.out.println(l1);
		System.out.println(c);
		
	}

}
