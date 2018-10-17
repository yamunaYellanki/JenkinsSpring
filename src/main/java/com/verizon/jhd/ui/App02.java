package com.verizon.jhd.ui;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.verizon.jhd.model.Gender;
import com.verizon.jhd.model.Person;
import com.verizon.jhd.util.JPAUtil;

public class App02 {
	public static void main(String args[])
	{
		Person p = new Person("yamuna","bublee",Gender.Masculine,true,LocalDate.of(1997,04,27));
		
EntityManager em =  JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(p);
		txn.commit();
		}
}
