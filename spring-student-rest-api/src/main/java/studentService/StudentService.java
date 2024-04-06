package studentService;

import java.util.List;

import edu.wccnet.lebaker.studentApp.entity.Student;

public interface StudentService {

	List<Student> getStudents();


	void deleteStudent(int studentId);


	void saveStudent(Student student);


	Student getStudent(int studentId);





}
