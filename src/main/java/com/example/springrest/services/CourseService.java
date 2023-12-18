package com.example.springrest.services;

import java.util.List;

import com.example.springrest.entities.Course;

public interface CourseService {
	
	public List <Course> getCourse();

	
	//public Course getCourse(long courseId);
	
	public Course gettingCourse(long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public Course deleteCourse(long parseLong);
}
