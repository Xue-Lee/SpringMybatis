<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.box{
		width: 900px;
		margin: 10px auto;
	}
	.box td{
		height:30px;
		border-bottom:1px solid #ddd;
	}
	</style>
</head>
<body>
	<a href="addStu.jsp">添加学生</a>
	<table class="box">
		<tr><td>学生编号</td><td>姓名</td><td>性别</td><td>出生日期</td><td>学分</td></tr>
		<c:forEach items="${stuList }" var="stu">
		<tr>
			<td>${stu.stuId }</td>
			<td>${stu.stuName }</td>
			<td>${stu.sex }</td>
			<td>${stu.birthday }</td>
			<td>${stu.grade }</td>
			<td><a href="deleteStu.do?stuId=${stu.stuId }">删除</a></td>
		</tr>
		</c:forEach>
	</table>
	----<a href="showStuBySex.do?sex=男">男</a>----<a href="showStuBySex.do?sex=女">女</a>----
	----<a href="showStuBySexGrade1.do?grade=60">不及格</a>----<a href="showStuBySexGrade2.do?grade=60">及格</a>----
</body>
</html>