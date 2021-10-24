package com.wolken.linkedin.dao;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.wolken.hibernateUtils.util.HibernateUtils;
import com.wolken.hpSupport.entity.UserEntity;

	public class RegistrationDAOImpl implements RegistrationDAO {
        @Override
		public int save(UserEntity entity) {
			SessionFactory factory=null;
			Session s=null;
			try {
				factory=HibernateUtils.getInstance();
				s=factory.openSession();
				Transaction transaction=s.beginTransaction();
				s.saveOrUpdate(entity);
				transaction.commit();
			}			
			finally {
				s.close();
			}
			return 0;
		}
		}
