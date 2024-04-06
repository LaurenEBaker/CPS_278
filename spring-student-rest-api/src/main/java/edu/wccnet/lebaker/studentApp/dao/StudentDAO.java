package edu.wccnet.lebaker.studentApp.dao;

import java.util.List;

import edu.wccnet.lebaker.studentApp.entity.Student;

public interface StudentDAO {
	
	public List<Student> getStudents();

	void saveStudent(Student theStudent);


	void deleteStudent(int id);

	public Student getStudent(int id);

}
