package example.spring.core.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.core.GreetingService;

public class SimpleExampleMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=
			new AnnotationConfigApplicationContext(SpringConfig.class);//this eliminates need og register() & refresh()
		//ctx.register(SpringConfig.class);
		//ctx.refresh();
		Object obj=ctx.getBean("welcomeBean");
		GreetingService gs=(GreetingService)obj;
		System.out.println(gs.sayGreeting());
		
	}

}
