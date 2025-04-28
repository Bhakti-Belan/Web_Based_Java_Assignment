package example.hibernate.utils;

import java.util.List;
import java.util.function.Consumer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import example.hibernate.bean.Studentdata;
import example.hibernate.entity.Student;

public class ConstructorExpressionExampleMain {

	
		public static void main(String[] args) {
			try(SessionFactory factory=HibernateUtils.getSessionFactory();
				Session session=factory.openSession()
					)
			{
				//String hqlQuery="select studen_name,student_branch from student_details";
				String hqlQuery=
			"select new  example.hibernate.bean.Studentdata(s.name,s.branch,s.year) from Student s";
			//this is called as Constructor Expression
            Query<Studentdata> queryObject=session.createQuery(hqlQuery,Studentdata.class);
            List<Studentdata> allStud=queryObject.list();
            allStud.stream().forEach(std->System.out.println(std));
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}
