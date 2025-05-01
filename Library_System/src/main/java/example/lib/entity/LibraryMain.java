package example.lib.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class LibraryMain {
	public static void main(String[] args) {
		
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
	Library lib=ctx.getBean(Library.class);
	lib.print();
	}
	
	

}
