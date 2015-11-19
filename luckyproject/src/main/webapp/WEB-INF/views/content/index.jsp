<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script>
$.ajax({
  url : '데이타 조회할 url',
  type : 'POST', // get, post,
  data : $('#'+getFormId).serialize(), // form을 통채로 넘길때, {'name':'홍길동', 'age':'20'} 
  dataType: 'json', //text, json, html, xml, script
  async : false, // true 비동기화, false 동기화방식
  success : function(data){
   //data에 object 형식으로 데이타가 담겨있다.
  },
  errer : function(jqXHR, textStatus, errorThrown) {
   alert(textStatus);
  },
  statusCode : {
   400: function(){
    alert("Popup 화면 생성에 실패하였습니다.");  
   },
   404: function(){
    alert("Profile정보가 존재하지 않습니다.");   
   },
   501: function(){
    alert("Profile정보 조회중 서버 오류가 발생하였습니다.");    
   }
    
  }
 }); 
</script>
</head>
<body>
${loginEmp.emp_code }
${loginEmp.emp_password }
</body>
</html>