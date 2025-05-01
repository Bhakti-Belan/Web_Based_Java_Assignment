package spring.core.entity;

public class PgDac implements Course
{
	private TrainingCenter center;

	@Override
	public String toString() {
		return "PgDac [center=" + center + "]";
	}

	public TrainingCenter getCenter() {
		return center;
	}

	public void setCenter(TrainingCenter center) {
		this.center = center;
	}

	public PgDac() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PgDac(TrainingCenter center) {
		super();
		this.center = center;
	}

	@Override
	public void conductCourse() {
	System.out.println("Course Name: PG-DAC");
	center.conductTraining();
	}

}
