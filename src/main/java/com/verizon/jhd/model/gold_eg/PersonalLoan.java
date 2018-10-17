package com.verizon.jhd.model.gold_eg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity  
@Table(name="PersonalLoans") 


public class PersonalLoan extends loan {

	private double annualIncome;
	
	public PersonalLoan(String id, String amount, String termcount,double annualIncome) {
		super(id, amount, termcount);
		this.annualIncome=annualIncome;
		// TODO Auto-generated constructor stub
	}

	public PersonalLoan() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	
}