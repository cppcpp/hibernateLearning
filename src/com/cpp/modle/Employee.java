package com.cpp.modle;
// Generated 2017-4-1 8:59:00 by Hibernate Tools 3.2.2.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Employee generated by hbm2java
 */
public class Employee implements java.io.Serializable {

	private int EId;
	private String EName;
	private String EPassword;
	private String EAddress;
	private Double ESalary;
	private Date EBirth;
	
	//ɾ��b_id������bankcards�Ķ���
	private Set bankcards = new HashSet(0);

	public Employee() {
	}

	public Employee(int EId, String EName) {
		this.EId = EId;
		this.EName = EName;
	}

	public Employee(int EId, String EName, String EPassword, String EAddress, Double ESalary, Date EBirth,
			Set bankcards) {
		this.EId = EId;
		this.EName = EName;
		this.EPassword = EPassword;
		this.EAddress = EAddress;
		this.ESalary = ESalary;
		this.EBirth = EBirth;
		this.bankcards = bankcards;
	}

	public int getEId() {
		return this.EId;
	}

	public void setEId(int EId) {
		this.EId = EId;
	}

	public String getEName() {
		return this.EName;
	}

	public void setEName(String EName) {
		this.EName = EName;
	}

	public String getEPassword() {
		return this.EPassword;
	}

	public void setEPassword(String EPassword) {
		this.EPassword = EPassword;
	}

	public String getEAddress() {
		return this.EAddress;
	}

	public void setEAddress(String EAddress) {
		this.EAddress = EAddress;
	}

	public Double getESalary() {
		return this.ESalary;
	}

	public void setESalary(Double ESalary) {
		this.ESalary = ESalary;
	}

	public Date getEBirth() {
		return this.EBirth;
	}

	public void setEBirth(Date EBirth) {
		this.EBirth = EBirth;
	}

	public Set getBankcards() {
		return this.bankcards;
	}

	public void setBankcards(Set bankcards) {
		this.bankcards = bankcards;
	}

}