package Autowire_xml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class test {
public static void main(String[] args) {
	
	ApplicationContext context = 
			new ClassPathXmlApplicationContext("Autowire_xml/config2.xml");
	Employee e = context.getBean("e1",Employee.class);
	System.out.println(e);
	
}
}
