package com.verizon.jhd.model.gold_eg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="GoldLoans")  

public class GoldLoan extends loan{  
      
	private float GoldWeightInGrams;

	public float getGoldWeightInGrams() {
		return GoldWeightInGrams;
	}

	public void setGoldWeightInGrams(float goldWeightInGrams) {
		GoldWeightInGrams = goldWeightInGrams;
	}

	public GoldLoan() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public GoldLoan(String id, String amount, String termcount,float GoldWeightInGrams) {
		super(id, amount, termcount);
		this.GoldWeightInGrams=GoldWeightInGrams;
		// TODO Auto-generated constructor stub
	}

	
	
}  