package example.hibernate.many_to_many_bidirectional;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="Candidate_Master")
public class Candidate {//This Is The Owning Side
	@Id
	@Column(name="candidate_id")
private int candidateId;
	@Column(name="candidate_name" ,length=10)
private String name;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Candidate_Certification_Master",
	joinColumns= {@JoinColumn(name="cand_id")},//fk refering to pk of owning side table
	inverseJoinColumns={@JoinColumn(name="cert_id")}//fk refering to pk of inverse side table
			)
	
private Collection<Certification> certifications;
	@Override
public String toString() {
	return "Candidate [candidateId=" + candidateId + ", name=" + name + ", certifications=" + certifications + "]";
}
	public int getCandidateId() {
	return candidateId;
}
public void setCandidateId(int candidateId) {
	this.candidateId = candidateId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Collection<Certification> getCertifications() {
	return certifications;
}
public void setCertifications(Collection<Certification> certifications) {
	this.certifications = certifications;
	for(Certification cert:certifications)
	{
		cert.getCandidates().add(this);
	}
}
public void addCertification(Certification cert)
{
	certifications.add(cert);
	cert.getCandidates().add(this);
	
}
	public Candidate(int candidateId, String name, Collection<Certification> certifications) {
	super();
	this.candidateId = candidateId;
	this.name = name;
	this.certifications = certifications;
}
	public Candidate() {
		// TODO Auto-generated constructor stub
	}

}
