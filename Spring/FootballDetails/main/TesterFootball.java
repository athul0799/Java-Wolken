package com.wolken.maven.springcore;



	import org.springframework.beans.factory.BeanFactory;
	import org.springframework.beans.factory.xml.XmlBeanFactory;
	import org.springframework.core.io.ClassPathResource;
	import org.springframework.core.io.Resource;

	import com.wolken.maven.springcore.Football;
	
	public class TesterFootball {

	    public static void main( String[] args )
	    {
	       Resource resource = new ClassPathResource("config.xml");
	       BeanFactory beanFactory = new XmlBeanFactory(resource);
	       System.out.println("Real Madrid is the best team");
	       Football foot = (Football) beanFactory.getBean("player1");
	        
	    }
	}
