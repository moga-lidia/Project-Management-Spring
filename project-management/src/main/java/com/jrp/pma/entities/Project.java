package com.jrp.pma.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_generator")
	@SequenceGenerator(name = "project_generator", sequenceName = "project_seq", allocationSize = 1)
	private long projectId;
	
	private String name;

	private String state; //notstarted, completed, inprogress
	private String description;
	
	@ManyToMany(cascade = {CascadeType.DETACH ,CascadeType.MERGE, CascadeType.REFRESH},
			   fetch = FetchType.LAZY)
	@JoinTable(name="project_employee",
				joinColumns=@JoinColumn(name="project_id"), 
				inverseJoinColumns= @JoinColumn(name="employee_id")
	)
	private List<Employee> employees;
	

	public Project(String name, String state, String description) {
		super();
		this.name = name;
		this.state = state;
		this.description = description;
	}
	
	
	
	public Project() {
		
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public void addEmployee(Employee emp) {
		if(employees==null) {
			employees = new ArrayList<>();
		}
		employees.add(emp);
	}
	
	
	
}
