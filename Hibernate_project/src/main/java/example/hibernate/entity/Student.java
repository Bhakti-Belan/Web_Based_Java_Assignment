package example.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	@Id//marks field studentId as an Id
	@Column(name="student_id")
	private int studentId;
	@Column(name="student_name")
	private String name;
	@Column(name="student_branch")
	private String branch;
	@Column(name="student_year")
	private String year;

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", branch=" + branch + ", year=" + year + "]";
	}

	public Student(int studentId, String name, String branch, String year) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.branch = branch;
		this.year = year;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Student() {
		
	}

}
