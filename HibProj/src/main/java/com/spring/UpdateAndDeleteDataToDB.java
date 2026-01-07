package com.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateAndDeleteDataToDB {
    public static void main(String[] args)
    {
        Student s1= new Student();
        Student s2 = null;
        s1.setRollNo(7);
        s1.setSname("Ankit");
        s1.setsAge(21);

        SessionFactory sf = new Configuration().addAnnotatedClass(com.spring.Student.class).configure().buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        s2= session.find(Student.class,7);
        session.remove(s2);


       // session.merge(s1);
        transaction.commit();
        sf.close();
        session.close();

        System.out.println(s2);
    }
}
