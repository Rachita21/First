package com.bean.rachita.messenger;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bean.rachita.messenger.service.StudentService;
import com.bean.rachita.messenger.student.Student;

@Path("students")
	public class StudentResource {
	
	StudentService studentservice= new StudentService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
		public List<Student> getStudents(){
			return studentservice.getAllStudents();
		}
	
	@GET
	@Path("/{standard}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudent(@PathParam("standard") int standard){
		
		return studentservice.getStudent(standard);
	}
	
			
	}


