package com.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDataFromDB {
    public static void main(String[] args) {

        Student s2= null;

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.spring.Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();


        s2= session.find(Student.class,4);


        session.close();
        sf.close();
        System.out.println(s2.getSname());

    }

}
