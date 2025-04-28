package example.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RecordInsertionExampleMain {

	public static void main(String[] args) {
		SessionFactory factory=null;
		Session session=null;
		Configuration conf=new Configuration();
		conf=conf.configure();
		try
		{
		 factory= conf.buildSessionFactory();
		  session=factory.openSession();
		  Movie movie=new Movie(102,"Dhamaal","Comdey",2014);
		  Transaction tx=session.beginTransaction();
		  session.persist(movie);
		  tx.commit();
		  System.out.println("Record inserted successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}
	}
}
