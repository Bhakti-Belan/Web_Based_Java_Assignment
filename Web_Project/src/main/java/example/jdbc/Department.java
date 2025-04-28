package example.jdbc;

public class Department {
	private int deptNo;
	private String name;
	private String loc;
	public int getDeptNo() {
		System.out.println("Inside Get Department Number");
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		System.out.println("Inside Set Department Number");
		this.deptNo = deptNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", name=" + name + ", loc=" + loc + "]";
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Department() {
		super();
		System.out.println("Inside Department()");
	}
	public Department(int deptNo, String name, String loc) {
		super();
		this.deptNo = deptNo;
		this.name = name;
		this.loc = loc;
	}

}
