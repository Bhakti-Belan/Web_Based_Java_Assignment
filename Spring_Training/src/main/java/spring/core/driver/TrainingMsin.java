package spring.core.driver;

import java.util.Arrays;
import java.util.List;

import spring.core.entity.Course;
import spring.core.entity.JavaTrainer;
import spring.core.entity.METNashik;
import spring.core.entity.PgDac;
import spring.core.entity.Trainer;
import spring.core.entity.TrainingCenter;

public class TrainingMsin {

	public static void main(String[] args) {
		List<String> topics=Arrays.asList("OOP","Exception","Collection");
		Trainer trainer=new JavaTrainer("Vishal Sir",topics);
		TrainingCenter center =new METNashik();
		((METNashik)center).setTrainer(trainer);
		Course course=new PgDac(center);
		course.conductCourse();
		
		

	}

}
