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
	<form action="updateGoods" method="post">
		<input type="hidden" name="tid" value="${goods.tid }">
		<input type="text" name="tname" value="${goods.tname }" placeholder="请输入商品名"><br><br>
		<select name="bid" >
			<option value="">请选择商品品牌</option>
			<c:forEach items="${list }" var="li">
				<option value="${li.bid }" ${li.flag==true?'selected':'' }>${li.bname }</option>
			</c:forEach>
		</select><br><br>
		<input type="text" name="tprice" value="${goods.tprice }"  placeholder="请输入价格"><br><br>
		<select name="stauts">
			<option value="">请选择商品上架状态</option>
			<option value="0" ${goods.stauts==0?'selected':'' }>上架</option>
			<option value="1" ${goods.stauts==1?'selected':'' }>下架</option>
		</select><br><br>
		<input type="submit" value="修改">
	</form>
</body>
</html>