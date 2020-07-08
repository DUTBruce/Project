<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html lang="en" class="no-js">
<head>
<meta charset="utf-8">
<title>用户登录</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- CSS -->
<link rel="stylesheet" href="<%=basePath%>resources/css/reset.css">
<link rel="stylesheet" href="<%=basePath%>resources/css/supersized.css">
<link rel="stylesheet" href="<%=basePath%>resources/css/style.css">

</head>


<body>

	<div class="page-container">
		<h1>注册</h1>
		<form action="/salesystem/user/zhuce" method="post">
			<input type="text" id="userId" name="userId" class="userId"
				placeholder="请输入用户名" pattern="[0-9]{1,10}" required="required">
			<input type="password" id="password" name="password" class="password"
				pattern="[A-Za-z0-9]{2,12}" required="required" placeholder="请输入密码">
			<input type="password" id="password" name="password2" class="password"
				pattern="[A-Za-z0-9]{2,12}" required="required" placeholder="请再次输入密码">
			<button type="submit">注册</button>
			<div id="login-error" style="color: #F00">${requestScope.message}</div>
		</form>
	</div>

	<!-- Javascript -->
	<script src="<%=basePath%>resources/js/jquery-1.8.2.min.js"></script>
	<script src="<%=basePath%>resources/js/supersized.3.2.7.min.js"></script>
	<script src="<%=basePath%>resources/js/supersized-init.js"></script>
	<script src="<%=basePath%>resources/js/scripts.js"></script>

</body>

</html>


