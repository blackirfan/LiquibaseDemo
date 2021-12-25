package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students/")
public class Controller {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("student")
    public String createStudent(@RequestBody Student studentBody) {
        Student studentDemo =new Student();
        studentDemo.setName(studentBody.getName());
        studentDemo.setDescription(studentBody.getDescription());
        studentRepository.save(studentDemo);
        String nameToReturn = studentRepository.findByName(studentBody.getName());
        return studentRepository.findByName(studentBody.getName()) + " Saved successfully";
    }

    @GetMapping("student")
    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }
}
