package com.zensar.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

/**
 * @author Mansi Hiremath
 * @creation_date 1st Sept,2019 10:34 AM
 * @modiification_date 1st Sept,2019 10:34 AM
 * @version 1.0
 * @description It is main class
 *
 */
public class HibernateMain
{
    public static void main( String[] args )
    {
       Configuration c=new Configuration().configure();
       SessionFactory f=c.buildSessionFactory();
       Session s=f.openSession();
       Transaction t=s.beginTransaction();
       Product p=new Product();
       p.setProductId(1004);
       p.setName("fridge");
       p.setBrand("L.G");
       p.setPrice(20000);
       s.save(p);
       t.commit();
       s.close();
    }
}
