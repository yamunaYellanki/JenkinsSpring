


package com.verizon.jhd.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.verizon.jhd.model.composition1.HallTicket;
import com.verizon.jhd.model.composition1.Identification;
import com.verizon.jhd.util.JPAUtil;

public class HallTicketApp
{	
	public static void main(String[] args)
	{		// TODO Auto-generated method stub				
			
			HallTicket ht1=new HallTicket("1","abc","ssc",new Identification());
			Identification id1 = new Identification("abc1","abcf1");
			
			EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();		
			
			EntityTransaction txn=em.getTransaction();		
			txn.begin();		
			em.persist(ht1);		
			em.persist(id1);		
		
			txn.commit();		
			JPAUtil.shutdown();		
	}
}
