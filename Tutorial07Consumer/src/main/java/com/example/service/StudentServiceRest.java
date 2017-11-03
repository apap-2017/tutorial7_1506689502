package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dao.CourseDAOImpl;
import com.example.dao.StudentDAO;
import com.example.dao.CourseDAO;
import com.example.model.CourseModel;
import com.example.model.StudentModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Primary
public class StudentServiceRest implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	@Autowired
	private CourseDAO courseDAO;
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Override
	public StudentModel selectStudent(String npm) {
		log.info("REST - Select student with npm {}" , npm);
		return studentDAO.selectStudent(npm);
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		log.info("REST - Select all students");
		return studentDAO.selectAllStudents();
	}

	@Override
	public void addStudent(StudentModel student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(String npm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(StudentModel student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CourseModel> selectCourses(String idCourse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseModel viewCourse(String idCourse) {
		log.info("REST - View Course");
		return courseDAO.viewCourse(idCourse);
	}

	@Override
	public List<CourseModel> viewAllCourse() {
		log.info("REST - View All Course");
		return courseDAO.viewAllCourse();
	}

	
	
	
}
