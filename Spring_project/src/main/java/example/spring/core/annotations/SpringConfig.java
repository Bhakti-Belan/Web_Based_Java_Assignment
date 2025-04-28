package example.spring.core.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import example.spring.core.GreetingService;
import example.spring.core.HelloService;
import example.spring.core.WelcomeService;

@Configuration //marks this class as a Configuration Unit==> spring-config.xml
public class SpringConfig {
	//this class acts as a configuration unit.
	@Bean//marks this method as bean declaration method.
	public GreetingService hello()
	{
		GreetingService gs=new HelloService();
		return gs;
	}
	//WelcomeService
	@Bean("welcomeBean")//Customizing The ID To WelcomeBean
	public GreetingService welcome()
	{
		GreetingService gs=new WelcomeService();
		return gs;
		
	}

}
