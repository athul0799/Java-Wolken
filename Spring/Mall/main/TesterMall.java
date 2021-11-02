package com.wolken.maven.springcore;


	
	import org.springframework.beans.factory.BeanFactory;
	import org.springframework.beans.factory.xml.XmlBeanFactory;
	import org.springframework.core.io.ClassPathResource;
	import org.springframework.core.io.Resource;

	import com.wolken.maven.springcore.Mall;
	public class TesterMall {
		
		public static void main( String[] args )
	    {
	       Resource resource = new ClassPathResource("config.xml");
	       BeanFactory beanFactory = new XmlBeanFactory(resource);
	       System.out.println("Movies can be watched and Shopping can be done in the mall");
	       Mall mall = (Mall) beanFactory.getBean("mall1");
	        
	    }


}
