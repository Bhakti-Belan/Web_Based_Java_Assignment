package example.hibernate.one_to_many_unidirectional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Credit_Card_Master")
public class CreditCard {
	@Id
	@Column(name="card_no",length=20)
private String cardNo;
	@Column(name="card_name",length=20)
private String nameOnCard;
	@Column(name="card_bank",length=20)
private String bankName;
	@Column(name="card_type",length=20)
private String type;
	@Column(name="credit_limit")
private int creditLimit;
public CreditCard(String cardNo, String nameOnCard, String bankName, String type, int creditLimit) {
	super();
	this.cardNo = cardNo;
	this.nameOnCard = nameOnCard;
	this.bankName = bankName;
	this.type = type;
	this.creditLimit = creditLimit;
}
public CreditCard() {
	super();
	// TODO Auto-generated constructor stub
}
public String getCardNo() {
	return cardNo;
}
public void setCardNo(String cardNo) {
	this.cardNo = cardNo;
}
public String getNameOnCard() {
	return nameOnCard;
}
public void setNameOnCard(String nameOnCard) {
	this.nameOnCard = nameOnCard;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getCreditLimit() {
	return creditLimit;
}
public void setCreditLimit(int creditLimit) {
	this.creditLimit = creditLimit;
}
@Override
public String toString() {
	return "CreditCard [cardNo=" + cardNo + ", nameOnCard=" + nameOnCard + ", bankName=" + bankName + ", type=" + type
			+ ", creditLimit=" + creditLimit + "]";
}

}
