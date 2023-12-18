package com.example.springrest.services;

//import org.hibernate.mapping.List;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springrest.dao.CourseDao;
import com.example.springrest.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	
	
	
	public CourseServiceImpl() {
		
	}

	
	
	//get all course
	@Override
	public List<Course> getCourse() {
		
		
		return courseDao.findAll();
	}
	

	
	
	
	

	
	//for getting course by id
	@Override
	public Course gettingCourse(long courseId) {
		
//		
		return courseDao.getReferenceById(courseId);
	}

	//for add course
	@Override
	public Course addCourse(Course course) {
		
		courseDao.save(course);
		return course;
	}

	//for update course
	@Override
	public Course updateCourse(Course course) {
		
		

		courseDao.save(course);
		return course;
	}

	
	//for delete course
	@Override
	public Course deleteCourse(long parseLong) {
	
		 
		
		Course entity = courseDao.getReferenceById(parseLong);
		courseDao.delete(entity);
		return null;
	}



	

}
