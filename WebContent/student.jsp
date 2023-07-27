<%@page import="edu.global.ex.Student"%>
<%@page import="edu.global.ex.shape.Circle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student</title>
</head>
<body>
	<h1>Student.jsp</h1>
	<jsp:useBean id="student2" class="edu.global.ex.Student"></jsp:useBean>
	<jsp:setProperty property="name" name="student2" value="Park"/>
	<jsp:setProperty property="age" name="student2" value="21"/>
	<jsp:setProperty property="grade" name="student2" value="5"/>
	
	이름:<jsp:getProperty property="name" name="student2" /><br>
	나이:<jsp:getProperty property="age" name="student2" /><br>
	학년:<jsp:getProperty property="grade" name="student2" /><br>
	
<%
	Student student = new Student("Hong",29,6);
%>
	이름: <%= student.getName() %><br>
	나이: <%= student.getAge() %><br>
	학년: <%= student.getGrade() %>
	<br>
	
	<div>
	    <jsp:useBean id="circle" class="edu.global.ex.shape.Circle" />
	    <jsp:setProperty property="radius" name="circle" value="5" />
	    반지름: <jsp:getProperty property="radius" name="circle" /><br/>
	    면적: <jsp:getProperty property="area" name="circle" />
	</div>
	<br>
</body>
</html>