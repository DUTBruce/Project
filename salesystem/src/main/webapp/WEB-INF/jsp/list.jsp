<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息</title>
<link rel="stylesheet" href="<%=basePath%>resources/css/table.css">
</head>
<body>
  <table>
 	 <tr>
            <td>编号</td>
            <td>学号</td>
            <td>姓名</td>
            <td>年龄</td>
        </tr>
		<c:forEach items="${goodslist}" var="goods">
		 <tr>
		     <td>${goods.goodsId}</td>
			<td>${goods.goodsName}</td>
			<td>${goods.goodsPrice}</td>
			<td>${goods.goodsAmount}</td>
			<td>${goods.supplyId}</td>
			<td>what fauck</td>
		</tr>
		</c:forEach>
</table>

  <table class="hovertable">	
	<tr>
	<th>Info Header 1</th><th>Info Header 2</th><th>Info Header 3</th>
	</tr>
	<tr οnmοuseοver="this.style.backgroundColor='#ffff66';" οnmοuseοut="this.style.backgroundColor='#d4e3e5';">
	<td>编号</td><td>商品名</td><td>价格</td><td>库存</td><td>供应商ID</td>
	</tr>
	<c:forEach items="${goodslist}" var="goods">
	<tr οnmοuseοver="this.style.backgroundColor='#ffff66';" οnmοuseοut="this.style.backgroundColor='#d4e3e5';">
	<td>${goods.goodsId}</td><td>${goods.goodsName}</td><td>${goods.goodsPrice}</td><td>${goods.goodsAmount}</td><td>${goods.supplyId}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>


