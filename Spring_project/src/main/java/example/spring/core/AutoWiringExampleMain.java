package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config5.xml");
      Object carObj=ctx.getBean("carBean");
      System.out.println(carObj);
	}
}
