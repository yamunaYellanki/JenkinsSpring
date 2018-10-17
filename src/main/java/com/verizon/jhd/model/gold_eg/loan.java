package com.verizon.jhd.model.gold_eg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity  
@Table(name = "loans")  
@Inheritance(strategy=InheritanceType.JOINED)
  
public abstract class loan {  
@Id  

@GeneratedValue(strategy=GenerationType.AUTO)   
@Column(name = "loanid")  
private String id;  
  
@Column(name = "amount")  
private String amount;

@Column(name = "termcount")  
private String termcount;




public loan() {
}

public loan(String id, String amount, String termcount) {
	this.id = id;
	this.amount = amount;
	this.termcount = termcount;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getAmount() {
	return amount;
}

public void setAmount(String amount) {
	this.amount = amount;
}

public String getTermcount() {
	return termcount;
}

public void setTermcount(String termcount) {
	this.termcount = termcount;
}  

}  

