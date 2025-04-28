package example.hibernate.one_to_many_unidirectional;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="Customer_Master")
public class Customer {
	@Id
	@Column(name="customer_id", length=10)
	private String customerId;
	@Column(name="customer_name", length=10)
     private String name;
	@Column(name="customer_email", length=10)
     private String emailAddress;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id")
     private Collection<CreditCard> creditcards;
	public Customer(String customerId, String name, String emailAddress, Collection<CreditCard> creditcards) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.emailAddress = emailAddress;
		this.creditcards = creditcards;
	}
	public Customer() {
		creditcards=new ArrayList();
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", emailAddress=" + emailAddress
				+ ", creditcards=" + creditcards + "]";
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Collection<CreditCard> getCreditcards() {
		return creditcards;
	}
	public void setCreditcards(Collection<CreditCard> creditcards) {
		this.creditcards = creditcards;
	}
	public void addCreditCard(CreditCard card)
	{
		creditcards.add(card);
	}

}
