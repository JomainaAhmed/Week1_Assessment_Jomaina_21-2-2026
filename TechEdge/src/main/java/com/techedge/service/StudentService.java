package com.techedge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;   // ✅ CORRECT IMPORT

import com.techedge.dao.StudentDAO;
import com.techedge.entity.Student;

@Service
public class StudentService {
    
    @Autowired
    private StudentDAO studentDao;

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public void updateStudentEmail(int id, String newEmail) {
        studentDao.updateStudentEmail(id, newEmail);
    }

    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }
}