package spring.core.annotation;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationTrainingMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		JavaTrainer trainer = context.getBean(JavaTrainer.class);
		trainer.setName("Jack");
		trainer.setTopics(Arrays.asList("OOP", "Threading", "Collecton"));
		PgDac dac = context.getBean(PgDac.class);
		dac.conductCourse();
	}

}
