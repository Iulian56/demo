package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student findById(Integer studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    public List<Student> allStudents(){
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public void deleteStudent(Integer studentId){
        studentRepository.deleteById(studentId);
    }

    public List<Student> findStudentByAge(Integer age){
       return studentRepository.findStudentsByAge(age);
    }

}
