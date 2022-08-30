package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
	public static void main(String[] args) {
		
		//Enable using xml file
//		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		Address add1=(Address)ac.getBean("address");
//		System.out.println(add1);
//		Employee emp1=(Employee)ac.getBean("employee");
//		System.out.println(emp1);
//		add1.setCity("mumbai");
//		add1.setState("Mh");
//		emp1.setAdd(add1);
//		emp1.setId(2);
//		emp1.setName("nikhil");
//		emp1.setSalary(5000);
//		System.out.println(emp1);
//		System.out.println(add1);
		//enable using configuration class
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Address add1 = (Address)ac.getBean("address");
		System.out.println(add1);
		Employee emp1 = (Employee)ac.getBean("employee");
		System.out.println(emp1);
		Employee emp2 = (Employee)ac.getBean("employee");
		System.out.println(emp2);
		
		Product p = (Product)ac.getBean("pp");
		p.productInfo();
	}
	}


