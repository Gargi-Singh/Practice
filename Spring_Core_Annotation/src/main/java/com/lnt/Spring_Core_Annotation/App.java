package com.lnt.Spring_Core_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        //Samsung s7 = factory.getBean(Samsung.class);
        Samsung s7 = (Samsung)factory.getBean("mySamsung");
        System.out.println(s7);
    }
}
