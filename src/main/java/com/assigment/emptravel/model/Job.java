package com.assigment.emptravel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Job {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="job_id")
	int id;
	
	@NotEmpty(message = "*Please provide a title")
	String title;
	
	
	@NotEmpty(message = "*Please provide a title")
	String description;
	
	int minExp;
	
	int maxExp;
	
	
	@NotEmpty(message = "*Please provide a title")
	String designation;
	
	int duration;
	
	public Job() {
		super();
	}

	public Job(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMinExp() {
		return minExp;
	}

	public void setMinExp(int minExp) {
		this.minExp = minExp;
	}

	public int getMaxExp() {
		return maxExp;
	}

	public void setMaxExp(int maxExp) {
		this.maxExp = maxExp;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	
}
