package com.bean.rachita.messenger.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.bean.rachita.messenger.student.Student;

public class StudentService {
	private List<Student> students= new ArrayList<>(Arrays.asList(new Student(1,"Rachita",5),new Student(2,"Mansi",5),
			new Student(1,"Alfia",6),new Student(1,"Ruksar",6)));
	
	public List<Student> getAllStudents(){

		return students;

	}



	public List<Student> getStudent(int standard){

		 return students.stream().filter(c->c.getStandard()==(standard)).collect(Collectors.toList());

		 
	}

	
	
}
