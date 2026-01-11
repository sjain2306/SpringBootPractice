package com.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Laptop l1= new Laptop();
        l1.setLid(1);
        l1.setBrand("HP");
        l1.setModel("Victus");
        l1.setRam(32);

        Laptop l2= new Laptop();
        l2.setLid(2);
        l2.setBrand("Acer");
        l2.setModel("Vivbook");
        l2 .setRam(8);

        Laptop l3= new Laptop();
        l3.setLid(3);
        l3.setBrand("Apple");
        l3.setModel("Macbook");
        l3 .setRam(16);

        Alien A1= new Alien();
        A1.setAid(101);
        A1.setAname("Mayank");
        A1.setTech(".net");

        Alien A2= new Alien();
        A2.setAid(102);
        A2.setAname("Siraj");
        A2.setTech("Java");

        Alien A3= new Alien();
        A3.setAid(103);
        A3.setAname("Shagun");
        A3.setTech("AI");



        A1.setLaptops(Arrays.asList(l1, l2));
        A2.setLaptops(Arrays.asList(l2,l3));
        A3.setLaptops(Arrays.asList(l3));

//        l1.setAliens(Arrays.asList(A1));
//        l2.setAliens(Arrays.asList(A1,A2));
//        l3.setAliens(Arrays.asList(A2,A3));





        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.spring.Alien.class)
                .addAnnotatedClass(com.spring.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(l3);


        session.persist(A1);
        session.persist(A2);
        session.persist(A3);

        transaction.commit();

        Alien a2= session.find(Alien.class,101);
        System.out.println(a2);
        sf.close();
        session.close();
        //System.out.println(A1);
    }
}
