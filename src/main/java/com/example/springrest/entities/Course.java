package com.example.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	private long id;
	private String title;
	private String descripion;
	public Course(long id, String title, String descripion) {
		super();
		this.id = id;
		this.title = title;
		this.descripion = descripion;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescripion() {
		return descripion;
	}
	public void setDescripion(String descripion) {
		this.descripion = descripion;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", descripion=" + descripion + "]";
	}
	

}
