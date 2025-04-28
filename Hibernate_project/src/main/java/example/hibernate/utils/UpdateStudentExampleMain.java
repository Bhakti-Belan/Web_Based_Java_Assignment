package example.hibernate.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Student;

public class UpdateStudentExampleMain {
	public static void main(String[] args) {
		try(SessionFactory factory=HibernateUtils.getSessionFactory();
				Session session=factory.openSession()
					){
			Class <Student> entityType=Student.class;
			Object id=102;
			Student foundStudent=session.find(entityType, id);
			if(foundStudent!=null)
			{
				Transaction tx=session.beginTransaction();
				foundStudent.setBranch("Computer Science");
				foundStudent.setYear("SE");
				tx.commit();
				System.out.println("Record Updated SuccessFully!!");
			}
			else
				System.out.println("Student Does Not Exists!!!");
			}
}
}