package example.hibernate.one_to_one_unidirectional;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Master")
public class Employee {
	@Id
	@Column(name="emp_no")
	private int empNo;
	@Column(name="emp_name",length=40)
	private String name;
	@Column(name="emp_sal")
	private int sal;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="passport_no")//this is foreign key column in Employee Master
	private Passport passportDetails;
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", sal=" + sal + ", passportDetails=" + passportDetails
				+ "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empNo, String name, int sal, Passport passportDetails) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.sal = sal;
		this.passportDetails = passportDetails;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Passport getPassportDetails() {
		return passportDetails;
	}
	public void setPassportDetails(Passport passportDetails) {
		this.passportDetails = passportDetails;
	}
	

}
