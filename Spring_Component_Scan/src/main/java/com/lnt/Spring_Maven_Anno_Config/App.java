package com.lnt.Spring_Maven_Anno_Config;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        Vehicle obj = (Vehicle)context.getBean("car");
        System.out.println(obj);
        obj.drive();
    }
}

