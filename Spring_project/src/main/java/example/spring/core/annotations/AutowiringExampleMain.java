package example.spring.core.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiringExampleMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig4.class);
		Object carObj=ctx.getBean("carBean");
		System.out.println(carObj);
	}

}
