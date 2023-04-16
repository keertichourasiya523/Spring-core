package com.Day01Spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static  void main( String[] args )
    {

    ApplicationContext context= 
    		new ClassPathXmlApplicationContext("config2.xml");
    
    Learner l1 = context.getBean("learners",Learner.class);
    System.out.println(l1);
    }
}
