package com.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.transaction.internal.TransactionImpl;
import org.hibernate.query.Query;

import java.util.List;

public class HQLMain {
    public static void main(String[] args)
    {


        SessionFactory cfg = new Configuration()
                .addAnnotatedClass(com.spring.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = cfg.openSession();
//exmp-1
//        int ram =32;
//        Query query= session.createQuery("from Laptop where Ram=?1");
//        query.setParameter(1,ram);
//        List<Laptop> laptopList = query.getResultList();
//        System.out.println(laptopList);
//exmp-2
//        String brand ="Asus";
//        Query query= session.createQuery("select model from Laptop where Brand like ?1");
//        query.setParameter(1,brand);
//        List<String> laptopList = query.getResultList();
//        System.out.println(laptopList);
//exmp-3
        int ram =16;
        Query query= session.createQuery("select model,Brand from Laptop where Ram=?1");
        query.setParameter(1,ram);
        List<Object[]> laptops = query.getResultList();
        for(Object[] data : laptops)
            System.out.println("Brand: "+data[1]+"|| "+"Model: "+data[0]);



        session.close();
        cfg.close();

    }
}
