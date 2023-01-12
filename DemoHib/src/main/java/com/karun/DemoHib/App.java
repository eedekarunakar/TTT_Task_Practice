package com.karun.DemoHib;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;
public class App 
{
    public static void main( String[] args )
    {
       Student s=new Student();
       s.setSno(1023);
       s.setSname("Karun");
       s.setSavg(96.34f);
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
        
        SessionFactory sf=con.buildSessionFactory();
        
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        
        session.save(s);
        
        tx.commit();
        
    }
}
