<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<title>注册</title>
</head>
<body>
	<h2>欢迎来到高达模型再版查询系统</h2>
	<div>
		<input type="text" name="username" id="username" placeholder="用户名"> <br />
		<input type="password" name="password" id="password" placeholder="密码"> <br />
		<button id="register" onclick="register()">注 册</button>
	</div>
	<br />
	<a href="LoginViewServlet">登入账号</a>
<script>
    function register() {
        var username = $('#username').val(),
            password = $('#password').val();
        // alert(name + password + id + entity);
        $.ajax({
            type: 'post',
            url: '/GundamManager/RegisterServlet',
            data: {'username': username, 'password': password},
            dataType: 'text',
            success: function (res) {
                if (res === "success") {
                    alert("注册成功，即将跳转登录界面！");
                    window.location.href = "/GundamManager/LoginViewServlet";
                } else {
                    alert("注册失败，该用户名已被注册！");
                }
            }
        })
    }
</script>
</body>
</html>