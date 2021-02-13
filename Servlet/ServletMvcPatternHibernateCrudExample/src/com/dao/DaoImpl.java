package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.config.HibernateUtil;
import com.model.Client;

public class DaoImpl implements DaoI {
	
	SessionFactory sf=HibernateUtil.getSessionFactory();

	@Override
	public void insertData(Client client) {
		
		System.out.println("In dao Layer : " + client);
		Session session=sf.openSession();
		session.save(client);
		session.beginTransaction().commit();
		System.out.println("Data inserted");
		
	}

	@Override
	public List<Client> getAllData(String u, String p) {
		
		Session session=sf.openSession();
		List<Client> clist=null;
		if(u.equals("admin") && p.equals("admin")) {
			Query<Client> query=session.createQuery("from Client");
	       clist=query.getResultList();
			return clist;
		}
		else {
			Query<Client> query=session.createQuery("from Client where cuname=:un And cpass=:ps"); 
			query.setParameter("un", u);
			query.setParameter("ps", p);
			
			 clist=query.getResultList();
			return clist;
		}
	
	}

}
