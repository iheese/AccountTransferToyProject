<%@ page language="java" contentType="text/html; charset=UTF-8" 
         isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ErrorPage</title>
</head>
<body>
<center>
<h3> 에러 발생!! 관리자가 필요합니다.</h3>

<hr>
<h3><a href="/index.jsp">초기 페이지로 돌아가기</a></h3>
<% 
	 System.out.println(exception.getClass().getName()); 
	 StackTraceElement[] elements = exception.getStackTrace(); 
     System.out.println( elements[0].toString()); 
%>
</center>
</body>
</html> 
