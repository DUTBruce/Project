<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="<%=basePath%>resources/css/table.css">
</head>
<body>
<table border="1">
        <tr>
            <td>号</td>
            <td>密码</td>
            <td>类型</td>
        </tr>
        <tr>
            <td>${user.userId}</td>
            <td>${user.password}</td>
            <td>${user.type}</td>
        </tr>
    </table>
    
    <table class="hovertable">	
	<tr>
	<th>Info Header 1</th><th>Info Header 2</th><th>Info Header 3</th>
	</tr>
	<tr οnmοuseοver="this.style.backgroundColor='#ffff66';" οnmοuseοut="this.style.backgroundColor='#d4e3e5';">
	<td>账号</td><td>密码</td><td>类型</td>
	</tr>
	<tr οnmοuseοver="this.style.backgroundColor='#ffff66';" οnmοuseοut="this.style.backgroundColor='#d4e3e5';">
	<td>${user.userId}</td><td>${user.password}</td><td>${user.type}</td>
	</tr>
	<tr οnmοuseοver="this.style.backgroundColor='#ffff66';" οnmοuseοut="this.style.backgroundColor='#d4e3e5';">
	<td>Item 3A</td><td>Item 3B</td><td>Item 3C</td>
	</tr>
	<tr οnmοuseοver="this.style.backgroundColor='#ffff66';" οnmοuseοut="this.style.backgroundColor='#d4e3e5';">
	<td>Item 4A</td><td>Item 4B</td><td>Item 4C</td>	
	</tr>
	<tr οnmοuseοver="this.style.backgroundColor='#ffff66';" οnmοuseοut="this.style.backgroundColor='#d4e3e5';">
	<td>Item 5A</td><td>Item 5B</td><td>Item 5C</td>
	</tr>
	</table>
</body>
</html>