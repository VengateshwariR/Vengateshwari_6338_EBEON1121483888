package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Employee
{
	@Id
	private int employeeId;
	
	@Column
	private String employeeName;
	
	
	@ManyToMany(mappedBy="employee",cascade=CascadeType.ALL)
	List<Project> project;


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public List<Project> getProject() {
		return project;
	}


	public void setProject(List<Project> project) {
		this.project = project;
	}


	public Employee(int employeeId, String employeeName, List<Project> project) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.project = project;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", project=" + project + "]";
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
