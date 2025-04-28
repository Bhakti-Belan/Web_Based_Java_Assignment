import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Student;
import example.hibernate.utils.HibernateUtils;

public class ShowStudentExampleMain {

	public static void main(String[] args) {
		try(SessionFactory factory=HibernateUtils.getSessionFactory();
				Session session=factory.openSession()
					){
			Class <Student> entityType=Student.class;
			Object id=108;
			Student foundStudent=session.find(entityType, id);
			if(foundStudent!=null)
			{
			System.out.println("Found Student"+foundStudent);
			}
			else
				System.out.println("Student Does Not Exists!!!");
			}catch(Exception e)
			{
				e.printStackTrace();
			}

	}

}
