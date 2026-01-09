package com.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args)
    {
        Laptop l1= new Laptop();
        l1.setBrand("HP");
        l1.setModel("Victus");
        l1.setRam(16);

        Alien A1= new Alien();
        A1.setAid(1);
        A1.setAname("Mayank");
        A1.setTech(".net");
        A1.setLaptop(l1);

        SessionFactory sf = new Configuration().addAnnotatedClass(com.spring.Alien.class).configure().buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();


        session.persist(A1);

        transaction.commit();

        Alien a2= session.find(Alien.class,1);
        System.out.println(a2);
        sf.close();
        session.close();
        //System.out.println(A1);
    }
}
