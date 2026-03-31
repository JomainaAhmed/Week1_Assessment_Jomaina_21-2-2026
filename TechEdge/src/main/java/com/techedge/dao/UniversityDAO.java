package com.techedge.dao;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityTransaction;
//
import com.techedge.entity.Department;
//import com.techedge.entity.Student;
//import com.techedge.app.Driver;
//
//import java.util.List;
//
//public class UniversityDAO {
//
//    // Add Department
//    public void addDepartment(Department dept) {
//
//        EntityManager em = Driver.getEntityManager();
//        EntityTransaction tx = em.getTransaction();
//
//        tx.begin();
//
//        em.persist(dept);
//
//        tx.commit();
//        em.close();
//    }
//
//    // Add Student
//    public void addStudent(Student student) {
//
//        EntityManager em = Driver.getEntityManager();
//        EntityTransaction tx = em.getTransaction();
//
//        tx.begin();
//
//        em.persist(student);
//
//        tx.commit();
//        em.close();
//    }
//
//    // Assign Student to Department
//    public void assignStudentToDepartment(int deptId, Student student) {
//
//        EntityManager em = Driver.getEntityManager();
//        EntityTransaction tx = em.getTransaction();
//
//        tx.begin();
//
//        Department dept = em.find(Department.class, deptId);
//
//        // Maintain both sides
//        student.setDepartment(dept);
//        dept.getStudents().add(student);
//
//        em.persist(student);
//
//        tx.commit();
//        em.close();
//    }
//
//    // Get Department by ID
//    public Department getDepartmentById(int id) {
//
//        EntityManager em = Driver.getEntityManager();
//
//        Department dept = em.find(Department.class, id);
//
//        em.close();
//        return dept;
//    }
//
//    // View Students by Department
//    public List<Student> viewStudentsByDepartment(int deptId) {
//
//        EntityManager em = Driver.getEntityManager();
//
//        Department dept = em.find(Department.class, deptId);
//
//        List<Student> students = dept.getStudents();
//        students.size(); // Force Lazy loading
//
//        em.close();
//        return students;
//    }
//
//    // Update Student Email
//    public void updateStudent(int studentId, String newEmail) {
//
//        EntityManager em = Driver.getEntityManager();
//        EntityTransaction tx = em.getTransaction();
//
//        tx.begin();
//
//        Student student = em.find(Student.class, studentId);
//        student.setEmail(newEmail);
//
//        tx.commit();
//        em.close();
//    }
//
//    // Delete Student
//    public void deleteStudent(int studentId) {
//
//        EntityManager em = Driver.getEntityManager();
//        EntityTransaction tx = em.getTransaction();
//
//        tx.begin();
//
//        Student student = em.find(Student.class, studentId);
//
//        if (student != null) {
//            em.remove(student);
//        }
//
//        tx.commit();
//        em.close();
//    }
//
//    // Delete Department (Cascade deletes students)
//    public void deleteDepartment(int deptId) {
//
//        EntityManager em = Driver.getEntityManager();
//        EntityTransaction tx = em.getTransaction();
//
//        tx.begin();
//
//        Department dept = em.find(Department.class, deptId);
//
//        if (dept != null) {
//            em.remove(dept);
//        }
//
//        tx.commit();
//        em.close();
//    }
//}

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

//import com.lpu.entity.Department;
@Component
public class UniversityDAO {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

    public void addDepartment(Department department) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(department);
        em.getTransaction().commit();
        em.close();
    }
    public Department getDepartmentById(int deptId) {
        EntityManager em = emf.createEntityManager();
        Department department = em.find(Department.class, deptId);
        em.close();
        return department;
    }
    public void updateDepartmentName(int deptId, String newName) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Department department = em.find(Department.class, deptId);
        department.setName(newName);

        em.getTransaction().commit();
        em.close();
    }
    public void deleteDepartment(int deptId) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Department department = em.find(Department.class, deptId);
        em.remove(department);

        em.getTransaction().commit();
        em.close();
    }
}
