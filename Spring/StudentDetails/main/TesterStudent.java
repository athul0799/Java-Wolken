package com.wolken.maven.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.wolken.maven.springcore.Student;

public class TesterStudent {

	public static void main( String[] args )
    {
       Resource resource = new ClassPathResource("config.xml");
       BeanFactory beanFactory = new XmlBeanFactory(resource);
       System.out.println("School shapes our lives");
       Student student = (Student) beanFactory.getBean("student1");
        
    }
}
