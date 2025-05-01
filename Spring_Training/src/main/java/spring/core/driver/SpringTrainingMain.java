package spring.core.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.entity.PgDac;

public class SpringTrainingMain {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring-Config.xml");
PgDac dac=	(PgDac) context.getBean("dac");
dac.conductCourse();
}
}
