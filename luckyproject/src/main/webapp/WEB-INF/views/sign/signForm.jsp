<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<form action="/index.lu" method="post">
	<label id="emp_code"></label>
	사원번호 : <input type="text" id="emp_code" name="emp_code">
	<label id="emp_password"></label>
	비밀번호 : <input type="password" id="emp_password" name="emp_password">
	<input type="submit" value="sign">
	</form>
</body>
</html>