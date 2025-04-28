package example.hibernate.one_to_many_unidirectional;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Student;

public class HibernateUtils {

	public static SessionFactory getSessionFactory()
	{
		Configuration conf=new Configuration();
		Properties hibernateProperties=new Properties();
		hibernateProperties.put("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
		hibernateProperties.put("hibernate.connection.url","jdbc:mysql://localhost:3306/associationMapping");
		hibernateProperties.put("hibernate.connection.username", "root");
		hibernateProperties.put("hibernate.connection.password","password" );
		hibernateProperties.put("hibernate.show_sql", "true");
		hibernateProperties.put("hibernate.hbm2ddl.auto","update" );
		conf.setProperties(hibernateProperties);
		;
		conf.addAnnotatedClass(CreditCard.class);
		conf.addAnnotatedClass(Customer.class);
		SessionFactory factory=conf.buildSessionFactory();
		return factory;
		
	}
	{
		
	}

}
