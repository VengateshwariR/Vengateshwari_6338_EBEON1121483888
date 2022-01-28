package com.entity;

import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class EmployeeEntity {
public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int employeeId;
	@Column
	private String employeeName;
	@Column
	private String employeeCity;
	
	
	public EmployeeEntity(int employeeid, String employeeName, String employeeCity) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeCity = employeeCity;
	}

	public int getEmployeeid() {
		return employeeId;
	}

    public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

    public String getEmployeeName() {
		return employeeName;
	}

    public void setEmployeeNmae(String employeeName) {
		this.employeeName = employeeName;
	}

    public String getEmployeeCity() {
		return employeeCity;
	}

    public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}


    @Override
	public String toString() {
		return "EmployeeEntity [employeeId=" + employeeId + ", employeeNmae=" + employeeName + ", employeeCity="
				+ employeeCity + "]";
	}

}
