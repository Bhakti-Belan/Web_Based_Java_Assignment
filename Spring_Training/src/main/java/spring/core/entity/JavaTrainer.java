package spring.core.entity;

import java.util.List;

public class JavaTrainer implements Trainer {
private String name;
private List<String> topics;
	
	@Override
	public void train() {
		
System.out.println(name+" is Giving Training for"+topics);
	}

	public JavaTrainer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public JavaTrainer(String name, List<String> topics) {
		super();
		this.name = name;
		this.topics = topics;
	}

	@Override
	public String toString() {
		return "JavaTrainer [name=" + name + ", topics=" + topics + "]";
	}

}
