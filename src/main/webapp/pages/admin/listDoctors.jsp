<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//Dth HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dth">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>遍历所有数据</title>
</head>
<body>
	<table border="1px" width="800px">
		<thead>
			<tr>
				<th>主键</th>
				<th>医生微信号</th>
				<th>医生姓名</th>
				<th>医生介绍</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ requestScope.doctorList}" var="map">
				<tr>
					<td>${pageScope.map.id}</td>
					<td>${pageScope.map.wechatId}</td>
					<td>${pageScope.map.doctorName}</td>
					<td>${pageScope.map.introduce}</td>
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
</body>
</html>