<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>		
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
<title>타일즈 셋팅</title>
</head>
<body>

<tiles:insertAttribute name="hearder"/>	
<br>
<tiles:insertAttribute name="left"/>
<br>
-----------------------------------------콘텐츠영역	
<br>
<tiles:insertAttribute name="content"/>	
<br>
-----------------------------------------콘텐츠영역 끝
<tiles:insertAttribute name="footder"/>	
	
</body>
</html>