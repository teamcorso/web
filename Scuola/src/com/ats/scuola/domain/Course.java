package com.ats.scuola.domain;

public class Course {
	private int id; 
	private String name;
	private String description;
	private double cost;
	private int duration;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Course(int id, String name, String description, double cost,
			int duration) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.cost = cost;
		this.duration = duration;
	}
	
	
	

}
