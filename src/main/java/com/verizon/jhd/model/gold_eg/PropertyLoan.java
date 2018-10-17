package com.verizon.jhd.model.gold_eg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="GoldLoans")  

public class PropertyLoan extends loan{  
      
	private float PropertyMarketValue;

	public PropertyLoan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PropertyLoan(float propertyMarketValue) {
		PropertyMarketValue = propertyMarketValue;
	}

	public float getPropertyMarketValue() {
		return PropertyMarketValue;
	}

	public PropertyLoan(String id, String amount, String termcount,float PropertyMarketValue) {
		super(id, amount, termcount);
		this.PropertyMarketValue=PropertyMarketValue;
		// TODO Auto-generated constructor stub
	}

	
	
	
}  