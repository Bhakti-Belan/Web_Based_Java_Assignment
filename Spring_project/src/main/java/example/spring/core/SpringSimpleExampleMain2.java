package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExampleMain2 {

	public static void main(String[] args) {
		String fileName="spring-config.xml";
		ApplicationContext ctx;
		ctx=new ClassPathXmlApplicationContext(fileName);
		Object loadedObject=ctx.getBean("springBean");
		GreetingService gs=(GreetingService)loadedObject;
		System.out.println(gs.sayGreeting());
        
	}

}
