package edu.wccnet.lebaker.studentApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import edu.wccnet.lebaker.studentApp.dao.StudentDAO;
import edu.wccnet.lebaker.studentApp.entity.Student;
import studentService.StudentService;

@Controller
@RequestMapping("/student")
public class MainController {
	@Autowired
	private StudentDAO studentDAO;
	@GetMapping("/list")
	public String listStudents(Model model) {
		model.addAttribute("students",studentDAO.getStudents());
		return "list-students";
	}
	
	@PostMapping("/addStudent")
	public String addStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "add-student";
	}
	
	@PostMapping("/processStudent")
	public String processStudent(@ModelAttribute("student") Student theStudent) {
		System.out.println(theStudent);
		StudentService.saveStudent(theStudent);
		return "redirect:/student/list";
	}
	@GetMapping("/updateStudent")
	public String updateStudent(Model model, @RequestParam("studentId") int id) {
		Student student = StudentService.getStudent(id);
		model.addAttribute("student", student);
		return "add-student";
	}
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("studentId") int id) {
		Student student = StudentService.getStudent(id);
		studentService.deleteStudent(studentId);
		return "delete-student";
		
	}
}
