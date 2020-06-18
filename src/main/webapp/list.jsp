<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- css -->
<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet">
<!-- js -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>

<body>
	<form action="queryAll" method="post">
		<select name="bid" >
			<c:forEach items="${list }" var="li">
				<option value="${li.bid }">${li.bname }</option>
			</c:forEach>
		</select>
		<select name="stauts">
			<option value="0">上架</option>
			<option value="1">下架</option>
		</select>
		价格区间 <input type="text" name="startPrice">~ <input type="text" name="endPrice">
		<input type="submit" value="查询">
	</form>
	<a href="queryBrands"><input type="button" value="添加"></a>
	<table>
		<tr>
			<td>id</td>
			<td>商品名</td>
			<td>价格</td>
			<td>所属品牌</td>
			<td>上线时间</td>
			<td>是否下架</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${page.list }" var="g">
			<tr>
				<td>${g.tid }</td>
				<td>${g.tname }</td>
				<td>${g.tprice }</td>
				<td>${g.bname }</td>
				<td>${g.uptime }</td>
				<td>${g.isStauts }</td>
				<td><a href="queryGoodsById?tid=${g.tid }"><button>修改</button></a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="11">
				<a href="?pageNum=1"><input type="button" value="首页"></a>
				<a href="?pageNum=${page.pageNum-1<1?1:page.pageNum-1 }"><input type="button" value="上一页"></a>
				<a href="?pageNum=${page.pageNum+1>page.pages?page.pages:page.pageNum+1 }"><input type="button" value="下一页"></a>
				<a href="?pageNum=${page.pages }"><input type="button" value="尾页"></a>
			</td>
		</tr>
	</table>
</body>
</html>