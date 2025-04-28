package example.hibernate.one_to_one_unidirectional;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AddEmployeeExampleMain {
public static void main(String[] args) {
	try(
			SessionFactory factory=HibernateUtils.getSessionFactory();
			Session session =factory.openSession())
	{
		Employee e1=new Employee(111,"Madhura S. Sharma",75000,null);
		Employee e2=new Employee(112,"Madhura Singh",85000,null);
		
		Transaction tx=session.beginTransaction();
		session.persist(e1);
		session.persist(e2);
		tx.commit();
		System.out.println("Employee Added SucessFully");
		
	}
	catch(Exception e)
	{
		
	}
	
}
}
