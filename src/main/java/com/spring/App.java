package com.spring;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
        System.out.println( "Hello World!" );
        SessionFactory sf = new Configuration().configure("/config/hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Student> root = cq.from(Student.class);
        CriteriaQuery<Student> select = cq.select(root);
        select.where(cb.greaterThan(root.get("age"), 25));
        Query<Student> createQuery = session.createQuery(select);
        for(Student s : createQuery.getResultList()) {
        	System.out.println(s);
        }
        
        
//        Student s = new Student("Muktar",25,90);
//        Student s1 = new Student("Subhajit",20,80);
//        Student s2 = new Student("Suraj",28,95);
//        
//        session.save(s);
//        session.save(s1);
//        session.save(s2);
        
        tx.commit();
        sf.close();
        session.close();
        
        
    }
    
}
