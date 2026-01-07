package com.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class InsertDataToDatabase {
    public static void main(String[] args) {

        Student s1= new Student();
        s1.setRollNo(6);
        s1.setSname("Shubh");
        s1.setsAge(24);

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.spring.Student.class);
//        cfg.configure();
//        SessionFactory sf = cfg.buildSessionFactory();
        SessionFactory sf =new Configuration()
                                .addAnnotatedClass(com.spring.Student.class)
                                .configure()
                                .buildSessionFactory();
        // written lines 18-21 in single line at line 22
        Session session = sf.openSession();
        Transaction transaction= session.beginTransaction(); // require if you manipulate something DB, at time of fetching you didn't require it

        session.persist(s1);

        transaction.commit();
        session.close();
        sf.close();

        System.out.println(s1);

    }
}