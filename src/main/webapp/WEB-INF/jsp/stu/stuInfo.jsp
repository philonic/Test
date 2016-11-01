<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../common/common.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Student Infomation</title>
</head>
<body>
<div align="center">
<h2>Student Infomation</h2>
<form:form modelAttribute="student"><br />
<table class="datagrid">
<tr><td>
头像:</td><td><form:input path="stuId"/><br /></td></tr>
<tr></tr>
<tr><td>
学号:</td><td><form:input path="stuNo"/><br /></td></tr>
<tr></tr>
<tr><td>
姓名:</td><td><form:input path="stuName"/><br /></td></tr>
<tr></tr>
<tr><td>
性别:</td><td><form:input path="stuSex"/><br /></td></tr>
<tr></tr>
<tr><td>
生日:</td><td><form:input path="stuBirth"/><br /></td></tr>
<%-- <form:input path="claz.lazName;"/> --%>
</table>

<input type="button" class="btn-success" value="click me！"/>
</form:form>

</div>
</body>
</html>