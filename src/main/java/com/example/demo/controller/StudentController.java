package com.example.demo.controller;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.allStudents();
    }

    @GetMapping("/id/{id}")
    public Student getUserById(@PathVariable Integer id) {
        return studentService.findById(id);
    }

    @GetMapping("/all")
    public List<Student> getAllUsers() {
        return studentService.allStudents();
    }

    @GetMapping("/age/{age}")
    public List<Student> getStudentsByAge(@PathVariable Integer age){
        return studentService.findStudentByAge(age);
    }
    @PostMapping("/save")
    public Student saveStudent (@RequestBody Student student){return studentService.saveStudent(student);}

    @DeleteMapping("/delete/{id}")
    public void deleteStudent (@PathVariable Integer id){ studentService.deleteStudent(id);}
}
