package com.something.heyspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	
    	/*
    	 * BeanFactory (Base package)
    	 * ApplicationContext (Extends BeanFactory)(Inhanced)
    	 */
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle obj = (Vehicle) context.getBean("vehicle");
        obj.drive();
    }
}
