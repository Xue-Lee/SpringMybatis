package com.icss.controller;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icss.dao.StudentDao;
import com.icss.entity.Student;

@Controller
public class MyController {
	@RequestMapping("showStu")
	public String findStuAll(HttpServletRequest request) throws Exception{
		InputStream ins = Resources.getResourceAsStream("mybatis-cfg.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ins);
		SqlSession sqlSession = sf.openSession();
		StudentDao stuDao = sqlSession.getMapper(StudentDao.class);
		List<Student> slist = stuDao.findStuAll();
		request.setAttribute("stuList", slist);
		return "showStu";
	}
	
	@RequestMapping("showStuBySex")
	public String findStuBySex(String sex,HttpServletRequest request) throws Exception{
		System.out.println(sex+"---------------------------------");
		InputStream ins = Resources.getResourceAsStream("mybatis-cfg.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ins);
		SqlSession sqlSession = sf.openSession();
		StudentDao stuDao = sqlSession.getMapper(StudentDao.class);
		List<Student> slist = stuDao.findStuBySex(sex);
		request.setAttribute("stuList", slist);
		return "showStu";
	}
	@RequestMapping("showStuBySexGrade1")
	public String findStuBySexGrade1(Student stu,HttpServletRequest request) throws Exception{
//		System.out.println(sex+"---------------------------------");
		InputStream ins = Resources.getResourceAsStream("mybatis-cfg.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ins);
		SqlSession sqlSession = sf.openSession();
		StudentDao stuDao = sqlSession.getMapper(StudentDao.class);
		List<Student> slist = stuDao.showStuBySexGrade1(stu);
		request.setAttribute("stuList", slist);
		return "showStu";
	}
	@RequestMapping("showStuBySexGrade2")
	public String findStuBySexGrade2(Student stu,HttpServletRequest request) throws Exception{
//		System.out.println(sex+"---------------------------------");
		InputStream ins = Resources.getResourceAsStream("mybatis-cfg.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ins);
		SqlSession sqlSession = sf.openSession();
		StudentDao stuDao = sqlSession.getMapper(StudentDao.class);
		List<Student> slist = stuDao.showStuBySexGrade2(stu);
		request.setAttribute("stuList", slist);
		return "showStu";
	}
	@RequestMapping("addStudent")
	public String addStudent(Student stu,HttpServletRequest request) throws IOException {
		InputStream ins = Resources.getResourceAsStream("mybatis-cfg.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ins);
		SqlSession sqlSession = sf.openSession();
		StudentDao stuDao = sqlSession.getMapper(StudentDao.class);
		stuDao.addStudent(stu);
		sqlSession.commit();
		return "redirect:showStu.do";
	}
	
}
