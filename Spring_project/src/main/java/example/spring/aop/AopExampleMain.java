package example.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopExampleMain {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringAopConfig.class);
	Musician musicianObject=ctx.getBean(Musician.class);
	musicianObject.perform();
	System.out.println("----------------------------");
	Singer singerObj=ctx.getBean(Singer.class);
	singerObj.perform();
	System.out.println("-----------------------------");
	//Printing the name of the classes of the object to which references:Musician object and singer Object refer
System.out.println(musicianObject.getClass().getName());
System.out.println(singerObj.getClass().getName());
}
}
