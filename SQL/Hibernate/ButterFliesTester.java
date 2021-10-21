package com.wolken.springexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wolken.butterflies.entity.ButterDetails;
public class ButterfliesTester 
{
public static void main(String[] args )
    {
 Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
    	ButterDetails details = (ButterDetails)session.get(ButterDetails.class, 1);
    	System.out.println(details);
    	session.close();
    	factory.close();
    }
}
