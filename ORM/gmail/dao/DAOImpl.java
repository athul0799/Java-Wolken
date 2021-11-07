package com.wolken.maven.gmail;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.wolken.hibernateUtils.util.HibernateUtils;
import com.wolken.gmail.entity.UserEntity;

public class DAOImpl {
	
	@Override
	public int save(UserEntity entity) {
		SessionFactory factory=null;
		Session s=null;
		try {
			factory = (SessionFactory) new ClassPathXmlApplicationContext(
                    "gmail.xml").getBean("factory");
			factory=HibernateUtils.getInstance();
			s=factory.openSession();
			Transaction t=s.beginTransaction();
			s.saveOrUpdate(entity);
			t.commit();
		}			
		finally {
			s.close();
		}
		return 0;
	}
	
	
	public LinkedinEntity getByEmail(String email) {
	Session session = null;
	SessionFactory factory;
	LinkedinEntity entity= null;
	try{
		factory = (SessionFactory) new ClassPathXmlApplicationContext(
                "gmail.xml").getBean("factory");
	factory = HibernateUtils.getInstance();
    	session = factory.openSession();
    	Query query = session.getNamedQuery("getByEmail");
    	query.setParameter("email", email);
    	entity = (LoginEntity) query.uniqueResult();
	}
	finally {
	  session.close();
	}
	return entity;
}
	
public int updatePassword(UserEntity entity) {
	SessionFactory factory=null;
	Session session=null;
	int r=0;
	try {
		factory = (SessionFactory) new ClassPathXmlApplicationContext(
                "gmail.xml").getBean("factory");
		factory=HibernateUtils.getInstance();
		session=factory.openSession();
		Transaction t=session.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<LinkedinEntity> query=session.createNamedQuery("updatePassword");
		query.setParameter("updatePassword", entity.getPassword());
		query.setParameter("email", entity.getEmail());
		rows=query.executeUpdate();
		t.commit();
	}
	
	finally {
		session.close();
	}
	return r;	
	
}


}
