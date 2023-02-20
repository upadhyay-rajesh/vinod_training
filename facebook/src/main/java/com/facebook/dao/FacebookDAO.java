package com.facebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.facebook.entity.FacebookUser;

public class FacebookDAO implements FacebooDAOInterface {

	@Override
	public int createProfileDAO(FacebookUser fb) {
		int i=0;
		/*
		 * try { Class.forName("com.mysql.jdbc.Driver"); Connection
		 * con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vinoddatabase",
		 * "root","rajesh");
		 * 
		 * PreparedStatement
		 * ps=con.prepareStatement("insert into facebookuser values(?,?,?,?)");
		 * ps.setString(1, fb.getName()); ps.setString(2, fb.getPassword());
		 * ps.setString(3, fb.getEmail()); ps.setString(4, fb.getAddress());
		 * i=ps.executeUpdate(); } catch(Exception e) { e.printStackTrace(); }
		 */
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		
		EntityTransaction et=s.getTransaction();
		et.begin();
		
		s.save(fb);
		
		et.commit();
		i=1;
		
		return i;
	}

	@Override
	public int loginProfileDAO(FacebookUser fb) {
		int i=0;
		/*
		 * try { Class.forName("com.mysql.jdbc.Driver"); Connection
		 * con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vinoddatabase",
		 * "root","rajesh");
		 * 
		 * PreparedStatement ps=con.
		 * prepareStatement("select * from facebookuser where email=? and password=?");
		 * ps.setString(1, fb.getEmail()); ps.setString(2, fb.getPassword());
		 * 
		 * 
		 * ResultSet res=ps.executeQuery(); if(res.next()) { i=1; } } catch(Exception e)
		 * { e.printStackTrace(); }
		 */
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		
		Query q=s.createQuery("from com.facebook.entity.FacebookUser f where f.email=:em and f.password=:pw");		
		q.setParameter("em", fb.getEmail()); 
		q.setParameter("pw", fb.getPassword());
		List<FacebookUser> f=q.getResultList();
		if(f.size()>0) {
			i=1;
		}
		
		return i;
	}
	
	public int deleteProfileDAO(FacebookUser fb) {
		int i=0;
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		
		Query q=s.createQuery("delete from com.facebook.entity.FacebookUser f where f.email=:em ");		
		q.setParameter("em", fb.getEmail()); 
		
		i=q.executeUpdate();
		
		return i;
	}
	public int updateProfileDAO(FacebookUser fb) {
		int i=0;
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		
		Query q=s.createQuery("update com.facebook.entity.FacebookUser f  set f.password=:pw where f.email=:em ");		
		q.setParameter("em", fb.getEmail()); 
		q.setParameter("pw", fb.getPassword());
		
		i=q.executeUpdate();
		
		return i;
	}


}














