<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人员列表</title>
</head>
<body>
	<table>
		<tr>
			<th>姓名</th>
			<th>性别</th>
			<th>年龄</th>
			<th>地址</th>
		</tr>
		<c:forEach items="${list.results}" var="person">
			<tr>
				<td>${person.name}</td>
				<td>${person.gender}</td>
				<td>${person.age}</td>
				<td>${person.addressId}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>