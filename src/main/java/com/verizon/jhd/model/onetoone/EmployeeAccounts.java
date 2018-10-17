package com.verizon.jhd.model.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="EmployeeAccounts")
public class EmployeeAccounts {

	@Id
	private int empId;
	private String ename;
	private double basic;
	
	@OneToOne(mappedBy="accountHolder",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private BankAccount salaryAccount;
	
	public EmployeeAccounts()
	{}

	public EmployeeAccounts(int empId, String ename, double basic) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.basic = basic;
		//this.salaryAccount = salaryAccount;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public BankAccount getSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(BankAccount salaryAccount) {
		this.salaryAccount = salaryAccount;
	}
	
	
}
