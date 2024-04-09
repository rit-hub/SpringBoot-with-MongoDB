package com.rithub.mongo.service;

import com.rithub.mongo.model.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    List<Student> getAllStudent();
    Student findByStudentId(Integer id);
}
