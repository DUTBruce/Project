<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>SpringMvc测试页</title>
</head>
<script type="text/javascript">
function querygoods()
{
 window.location.href="<%=request.getContextPath()%>/goods/list";
}
function querygoods2()
{
 window.location.href="<%=request.getContextPath()%>/goods/one?goodsId=1";
}
function Login()
{
 window.location.href="<%=request.getContextPath()%>/user/login";
}
</script>
<body>
<h3>index</h3><br>
<button onclick="querygoods()">查询所有商品</button>
<button onclick="querygoods2()">查询单个商品</button>
<button onclick="Login()">登录</button>
</body>
</html>