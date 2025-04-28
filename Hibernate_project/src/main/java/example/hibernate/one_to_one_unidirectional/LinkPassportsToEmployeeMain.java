package example.hibernate.one_to_one_unidirectional;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LinkPassportsToEmployeeMain {
public static void main(String[] args) {
	try(
			SessionFactory factory=HibernateUtils.getSessionFactory();
			Session session =factory.openSession())
	{
		//finding the Passports Which Are To Be Linked.
		Passport p1=session.find(Passport.class, "P001");
		Passport p2=session.find(Passport.class, "P002");
		//finding the Employees For Which Passports are to be Linked
        Employee e1=session.find(Employee.class,111);
        Employee e2=session.find(Employee.class,112);
		Transaction tx=session.beginTransaction();
		e1.setPassportDetails(p1);
		e2.setPassportDetails(p2);
		tx.commit();
		System.out.println("Passports Have Been Linked To Employee SuccessFully");
	
		
	}
	catch(Exception e)
	{
		
	}
	
}
}
