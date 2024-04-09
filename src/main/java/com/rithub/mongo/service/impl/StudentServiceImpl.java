package com.rithub.mongo.service.impl;

import com.rithub.mongo.model.Student;
import com.rithub.mongo.repository.StudentRepository;
import com.rithub.mongo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student findByStudentId(Integer id) {
        return studentRepository.findById(id).orElse(new Student());
    }
}
