<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=basePath%>/static/js/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/jsonHandler.js"></script>
</head>
<body>
	<center>
		<form action="javascript:void(0)" id="form1">
			<table border="1px" width="300px">
				<tr>
					<td>用户名:</td>
					<td><input type="text" name="nick" placeholder="请输入用户名"></td>
				</tr>
				<tr>
					<td>密码:</td>
					<td><input type="password" name="password" placeholder="请输入密码"></td>
				</tr>
				<tr>
					<td>手机号:</td>
					<td><input type="text" name="phone" placeholder="请输入正确的手机号"></td>
				</tr>
				<tr>
					<td>邮箱:</td>
					<td><input type="email" name="email" placeholder="请输入正确的邮箱"></td>
				</tr>
				<tr>
					<td>年龄:</td>
					<td><input type="text" name="age" placeholder="请输入密码"></td>
				</tr>
				<tr>
					<td><input type="submit" value="登录" id="login"></td>
					<td><input type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
	</center>
	
	<script type="text/javascript">
		/*在登录按钮上添加一个单击事件*/
		$(function(){
			$("#login").click(function(){
				//json对象
				var json = $("#form1").serializeObject();
				//将json对象转成json字符串
				alert(JSON.stringify(json));
				
				$.ajax({
					url:"<%=basePath%>/managerLogin",
					type:"post",
					dataType:"json",
					data:json,
					success:function(result){
						alert("成功了");
					}
				});
			});
		});
	</script>
</body>
</html>