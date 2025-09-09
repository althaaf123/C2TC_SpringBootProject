package com.tnsiff.samplespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext var = new ClassPathXmlApplicationContext("applicationcontext.xml");

   
        Customer s1 = var.getBean("customer1", Customer.class);

     
        s1.order();

       
    }
}
