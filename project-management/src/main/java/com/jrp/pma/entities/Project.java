package com.jrp.pma.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long projectId;
	private String name;
	private String state; //notstarted, completed, inprogress
	private String description;
	
	@OneToMany(mappedBy="theProject")
	private List<Employee> employees;
	
	public Project() {}
	public Project(String name, String state, String description) {
		super();
		this.name = name;
		this.state = state;
		this.description = description;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}