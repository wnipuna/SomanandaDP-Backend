package com.nipuna.spring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int indexNo;
	private String firstName;
	private String secondName;
	private String lastName;
	private String address;
	private String contactNo;
	private byte grade;
	private byte isCurrent;
	public int getIndexNo() {
		return indexNo;
	}
	public void setIndexNo(int indexNo) {
		this.indexNo = indexNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public byte getGrade() {
		return grade;
	}
	public void setGrade(byte grade) {
		this.grade = grade;
	}
	public byte getIsCurrent() {
		return isCurrent;
	}
	public void setIsCurrent(byte isCurrent) {
		this.isCurrent = isCurrent;
	}
	@Override
	public String toString() {
		return "Student [indexNo=" + indexNo + ", firstName=" + firstName + ", secondName=" + secondName + ", lastName="
				+ lastName + ", address=" + address + ", contactNo=" + contactNo + ", grade=" + grade + ", isCurrent="
				+ isCurrent + "]";
	}
}
