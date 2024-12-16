package com.govind.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long employeeId;
	@Column
	private String employeeName;
	@Column
	private String employeeAddress;
	@Column
	private String employeeCode;

	public Long getEmployeeId() {
		return employeeId;
	}
	
	
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	@Override
	public String toString() {
		return "Department [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", employeeCode=" + employeeCode + "]";
	}
	public Department(Long employeeId, String employeeName, String employeeAddress, String employeeCode) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeCode = employeeCode;
	}
	public Department() {

	}
	
	
	
}
