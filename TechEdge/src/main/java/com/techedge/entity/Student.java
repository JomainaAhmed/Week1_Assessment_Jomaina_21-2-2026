package com.techedge.entity;
//
//import javax.persistence.*;
//
//@Entity
//public class Student {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    private String name;
//    private String email;
//
//    @ManyToOne
//    @JoinColumn(name = "dept_id")
//    private Department department;
//
//    public Student() {}
//
//    public Student(String name, String email) {
//        this.name = name;
//        this.email = email;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//    
//    public String setName(String name) {
//    	return this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }
//}

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String email;

	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}