package example.hibernate.utils;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import example.hibernate.entity.Student;

public class SelectClauseExampleMain2 {

	
		public static void main(String[] args) {
			try(SessionFactory factory=HibernateUtils.getSessionFactory();
				Session session=factory.openSession()
					)
			{
				//String hqlQuery="from Student s where s.year='SE'";
				String hqlQuery="from Student s";
				Query<Student> queryObject=session.createQuery(hqlQuery,Student.class);
				List<Student> listOfStudents= queryObject.list();
				for(Student currentStudent:listOfStudents)
				{
					System.out.println(currentStudent.getName());
				}
			    
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}
