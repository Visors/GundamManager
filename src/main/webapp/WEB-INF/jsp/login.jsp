<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<title>登入</title>
</head>
<body>
	<h2>欢迎来到高达模型再版查询系统</h2>
	<div>
		<input type="text" name="username" id="username" placeholder="用户名">
		<br /> <input type="password" name="password" id="password"
			placeholder="密码"> <br />
		<button id="login" onclick="login()">登 入</button>
	</div>
	<br />
	<a href="RegisterViewServlet">注册帐号</a>
	<script>
		function login() {
			var username = $('#username').val(),
				password = $('#password').val();
			/* alert(username+", "+password); */
			$.ajax({
				type : 'post',
				url : '/GundamManager/CheckLoginServlet',
				data : {
					'username' : username,
					'password' : password
				},
				dataType : 'text',
				success : function(res) {
					if (res == "success") {
						alert("登入成功，页面即将跳转！");
						window.location.href = "/GundamManager/MenuViewServlet";
					} else {
						alert("登入失败，请核验账号！");
					}
				}
			})
		}
	</script>
</body>
</html>