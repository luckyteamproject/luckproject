<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script> 
</script>
</head>
<body>
<table>
<tr>
	<td>사원번호 : <a href="/empInfo.lu">${signEmp.emp_code }</a></td>
	<td>이름 : ${signEmp.emp_name }</td>
	<td>권한 : 
		<c:choose>
			<c:when test="${signEmp.emp_level==1}">
				총관리자
			</c:when>
			<c:when test="${signEmp.emp_level==2}">
				관리자
			</c:when>
			<c:when test="${signEmp.emp_level==3}">
				사원
			</c:when>
		</c:choose>
	</td>
</tr>
</table>
</body>
</html>