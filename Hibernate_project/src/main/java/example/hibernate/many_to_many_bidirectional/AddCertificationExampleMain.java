package example.hibernate.many_to_many_bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AddCertificationExampleMain {
	public static void main(String[] args) {
		try (
	            SessionFactory factory = HibernateUtils.getSessionFactory();
	            Session session = factory.openSession()
	        ) {
	           // Certification c1=new Certification("SM","Scrum Master",null);
	           // Certification c2=new Certification("MCD","Microsoft Certified Trainer",null);
	            Certification c3=new Certification("AA","AWS Administrator",null);

	            Transaction tx = session.beginTransaction();
	            //session.persist(c1);
	            session.persist(c3);
	            tx.commit();

	            System.out.println("Records Added");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	

	public AddCertificationExampleMain() {
		// TODO Auto-generated constructor stub
	}

}
