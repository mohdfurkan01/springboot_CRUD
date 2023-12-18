package com.example.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.entities.Course;
import com.example.springrest.services.CourseService;
 
@RestController
public class MyController<Mycourse> {
	
	@Autowired
	private CourseService courseService;
	
	//for testing purpose
	@GetMapping("/home")
	public String home()
	{
		return "this is home page";
	}
	
	//get the all courses courses
	//@RequestMapping(path="/courses",method=RequestMethod.GET)
	//OR
	@GetMapping("/courses")
	public List <Course> getCourses()
	{
		return this.courseService.getCourse();
		
	}
	   

	//get courses by ID
	//@GetMapping("/courses/{courseId}")  //not working
	
	
	
	
	@GetMapping("/v1/e/{courseId}")
	public Course gettingCourse(@PathVariable String courseId) {
		
		return  this.courseService.gettingCourse(Long.parseLong(courseId));
		
	}
	
	//add course
	@PostMapping("/addcourse")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
	}
	
	
	//update courses using put method
	@PutMapping("/updatecourses")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.courseService.updateCourse(course);
	}
	                                       
	
	//delete the course
	@DeleteMapping("/deletecourse/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
		try {
			this.courseService.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
}


