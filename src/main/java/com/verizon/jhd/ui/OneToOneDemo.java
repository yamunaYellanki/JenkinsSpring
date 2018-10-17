package com.verizon.jhd.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.verizon.jhd.model.onetoone.BankAccount;

import com.verizon.jhd.model.onetoone.EmployeeAccounts;
import com.verizon.jhd.util.JPAUtil;

public class OneToOneDemo {

	public static void main(String args[])
	{
		EmployeeAccounts emp=new EmployeeAccounts(101,"yamuna",2606777);
		BankAccount acc = new BankAccount("SB001","SBI","SB0089");
		emp.setSalaryAccount(acc);
		acc.setAccountHolder(emp);
		
		EntityManager em= JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn= em.getTransaction();
		txn.begin();
		em.persist(emp);
		txn.commit();
		
		JPAUtil.shutdown();
	}
}
