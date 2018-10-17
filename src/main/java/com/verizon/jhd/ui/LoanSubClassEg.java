
package com.verizon.jhd.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.verizon.jhd.model.gold_eg.GoldLoan;
import com.verizon.jhd.model.gold_eg.PersonalLoan;
import com.verizon.jhd.model.gold_eg.PropertyLoan;
import com.verizon.jhd.model.gold_eg.loan;
import com.verizon.jhd.util.JPAUtil;

public class LoanSubClassEg
{	
	public static void main(String[] args)
	{		// TODO Auto-generated method stub		
			//loan loan1=new loan("1","2","3");		
			PersonalLoan pl1=new PersonalLoan("564561","1","1",102);	
			GoldLoan gl1=new GoldLoan("5645561","1","1",102);	
			PropertyLoan ppl1=new PropertyLoan("5645261","1","1",102);	
			
			
			EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();		
			
			EntityTransaction txn=em.getTransaction();		
			txn.begin();		
			//em.persist(loan1);		
			em.persist(gl1);		
			em.persist(pl1);		
			em.persist(ppl1);	
			
			txn.commit();		
			JPAUtil.shutdown();		
	}
}
