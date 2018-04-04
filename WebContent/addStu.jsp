<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>添加学生</h2>
<hr>
<form action="addStudent.do" method="post">
<table>
	<tr><td>学号</td><td><input type="text" name="stuId"/></td></tr>
	<tr><td>姓名</td><td><input type="text" name="stuName"/></td></tr>
	<tr><td>性别</td><td><input type="text" name="sex"/></td></tr>
	<tr><td>出生日期</td><td><input type="text" name="birthday"/></td></tr>
	<tr><td>电话</td><td><input type="text" name="tel"/></td></tr>
	<tr><td>班级</td><td><input type="text" name="dept"/></td></tr>
	<tr><td>学分</td><td><input type="text" name="grade"/></td></tr>
	<tr><td colspan="2"><input type="submit" value="保存"/></td></tr>
</table>
</form>


</body>
</html>