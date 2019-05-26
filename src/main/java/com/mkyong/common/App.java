package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.model.Customer;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
//        Customer customer = new Customer(1, "mkyong",28);
        Customer customer = new Customer(2, "van",28);
        customerDAO.insert(customer);
    	
        Customer customer1 = customerDAO.findByCustomerId(1);
        if(customer1 == null) {
        	System.out.println("Not found!!!");
        }
        System.out.println(customer1);
        
    }
}
