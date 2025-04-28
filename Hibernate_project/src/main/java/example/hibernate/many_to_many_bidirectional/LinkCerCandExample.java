package example.hibernate.many_to_many_bidirectional;

import java.util.Arrays;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LinkCerCandExample {
public static void main(String[] args) {
	try (
            SessionFactory factory = HibernateUtils.getSessionFactory();
            Session session = factory.openSession()
        ) {
		Transaction tx = session.beginTransaction();
		//Finding The Certifications To be Linked
           Certification c1=session.find(Certification.class,"AA"); 
           Certification c2=session.find(Certification.class,"MCD"); 
           Certification c3=session.find(Certification.class,"SM"); 
           Candidate cn1=session.find(Candidate.class, 101);
           Candidate cn2=session.find(Candidate.class, 102);
           cn1.addCertification(c1);
           cn1.addCertification(c2);
           Collection<Certification> Allcertifications=
        		   Arrays.asList(c1,c2,c3);
           cn2.setCertifications(Allcertifications);
           
            
           
            tx.commit();

            System.out.println("Records Added");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public LinkCerCandExample() {
		// TODO Auto-generated constructor stub
	}

}
