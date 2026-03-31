package com.techedge.service;
//
//
//public class UniversityService {
//
//    private UniversityDAO dao;
//
//    public UniversityService(UniversityDAO dao) {
//        this.dao = dao;
//    }
//
//    public void addDepartment(Department dept) {
//        dao.addDepartment(dept);
//    }
//
//    public void assignStudentToDepartment(int deptId, Student student) {
//        dao.assignStudentToDepartment(deptId, student);
//    }
//
//    public List<Student> viewStudentsByDepartment(int deptId) {
//        return dao.viewStudentsByDepartment(deptId);
//    }
//
//    public void updateStudent(int id, String email) {
//        dao.updateStudent(id, email);
//    }
//
//    public void deleteStudent(int id) {
//        dao.deleteStudent(id);
//    }
//
//    public void deleteDepartment(int id) {
//        dao.deleteDepartment(id);
//    }
//
//    public Department getDepartmentById(int id) {
//        return dao.getDepartmentById(id);
//    }
//}

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techedge.dao.UniversityDAO;
import com.techedge.dao.StudentDAO;
import com.techedge.entity.Department;
import com.techedge.entity.Student;
@Component
public class UniversityService {
	@Autowired
	private UniversityDAO departmentDao;
	@Autowired
	private StudentDAO studentDao;
	
	public void addDepartment(Department department) {
        departmentDao.addDepartment(department);
    }

    public Department getDepartmentById(int id) {
        return departmentDao.getDepartmentById(id);
    }
    public void assignStudentToDepartment(int deptId, Student student) {

        Department department = departmentDao.getDepartmentById(deptId);
        student.setDepartment(department);

        studentDao.addStudent(student);
    }
    public void deleteDepartment(int id) {
    	departmentDao.deleteDepartment(id);
    }

}
