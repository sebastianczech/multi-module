package com.sebastiaczech.webapp.controller;

import com.sebastiaczech.webapp.model.StudentModel;
import com.sebastiaczech.webapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public StudentModel addStudent() {
        StudentModel student = new StudentModel(
                "1", "John Doe", StudentModel.Gender.MALE, 1);
        return studentRepository.save(student);
    }

    @RequestMapping("/student/{id]")
    public StudentModel getStudent(@PathVariable("id") String id) {
        return studentRepository.findById(id).get();
    }

    @RequestMapping("/students")
    public List<StudentModel> getAll() {
        List<StudentModel> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

}
