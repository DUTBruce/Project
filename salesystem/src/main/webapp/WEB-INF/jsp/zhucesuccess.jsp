<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
if ((String)request.getAttribute("message") == "success") { %>
    <script>
    alert("注册成功！");
   // window.navigate("tologin"); 
   location.href="tologin";
    </script>
<%}%>

</body>
</html>