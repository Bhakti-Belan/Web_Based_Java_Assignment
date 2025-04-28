package example.hibernate.many_to_many_bidirectional;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="Certification_master")
public class Certification {//This is Inverse Side
@Override
	public String toString() {
		return "Certification [cerificationCode=" + cerificationCode + ", title=" + title + ", candidates=" + candidates
				+ "]";
	}
@Id
@Column(name="certification_code", length=5)
private String cerificationCode;
@Column(name="certification_title", length=40)
private String title;
@ManyToMany(cascade=CascadeType.ALL,mappedBy="certifications")
private Collection<Candidate> candidates;
	public Collection<Candidate> getCandidates() {
	return candidates;
}
public void setCandidates(Collection<Candidate> candidates) {
	this.candidates = candidates;
}

	public Certification(String cerificationCode, String title, Collection<Candidate> candidates) {
	super();
	this.cerificationCode = cerificationCode;
	this.title = title;
	this.candidates = candidates;
}
	public Certification() {
		// TODO Auto-generated constructor stub
	}

}
