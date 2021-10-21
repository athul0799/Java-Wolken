package com.wolken.market.dao;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.wolken.hibernateUtils.util.HibernateUtils;
import com.wolken.market.entity.MarketDetails;

public class MarketDetailsDAOImpl implements MarketDetailsDAO {
		public String save(MarketDetails details) {
		boolean res=false;
		SessionFactory factory=null;
		Session session=null;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(details);
			transaction.commit();
			if(res)
				return true;
			else
				return false;
		}
		finally {
			session.close();
		}
		
	}
	
	@Override
	public boolean update(MarketDetails details) {
		boolean res =false;
		SessionFactory factory=null;
		Session session=null;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.saveOrUpdate(details);
			transaction.commit();
			if(res)
				return true;
			else
				return false;
		}
		finally {
			session.close();
		}
		
	}
	public void getByid(int id) {
		SessionFactory factory=null;
		Session session=null;
		MarketDetails details=null;
		
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			System.out.println(id);
			details=session.get(MarketDetails.class, id);	
			System.out.println(details);
		}
		finally {
			session.close();
		}
	}

	@Override
	public boolean delete(MarketDetails details) {
		boolean res =false;
		SessionFactory factory=null;
		Session session=null;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.delete(details);
			transaction.commit();
			if(res)
				return false;
			else
				return true;
		}
		finally {
			session.close();
		}
		
	}

}
