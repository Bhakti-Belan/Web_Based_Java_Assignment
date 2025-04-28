package example.spring.core;

public class Tyre {
	private String make;
	private String type;
	public Tyre()
	{
		make="MRF";
		type="With Tube";
	}
	@Override
	public String toString() {
		return "Tyre [make=" + make + ", type=" + type + "]";
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Tyre(String make, String type) {
		super();
		this.make = make;
		this.type = type;
	}

}
