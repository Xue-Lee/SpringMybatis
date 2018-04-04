package com.icss.dao;

import java.util.List;

import com.icss.entity.Student;

public interface StudentDao {
	public List<Student> findStuAll();
	public List<Student> findStuBySex(String sex);
	public List<Student> showStuBySexGrade1(Student stu);
	public List<Student> showStuBySexGrade2(Student stu);
	public void addStudent(Student stu);
}
