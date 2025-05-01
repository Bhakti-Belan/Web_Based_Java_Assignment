package spring.core.entity;

public class METNashik implements TrainingCenter {
private Trainer trainer;
	@Override
	public void conductTraining() {
		System.out.println("MET Nashik Started Training");
		trainer.train();

	}
	public METNashik(Trainer trainer) {
		super();
		this.trainer = trainer;
	}
	public METNashik() {
		super();
		
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "METNashik [trainer=" + trainer + "]";
	}
	

}
