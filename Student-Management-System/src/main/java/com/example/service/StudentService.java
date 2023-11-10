package com.example.service;

import java.util.List;

import com.example.entity.Student;

public interface StudentService {

	public List<Student> getAllStudent();

	Student saveStudent(Student student);

	Student getStudentById(int id);

	Student updateStudent(Student student);

	void deleteStudentById(int id);

}
