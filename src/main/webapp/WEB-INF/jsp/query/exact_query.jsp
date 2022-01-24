<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>精确查询</title>
</head>
<body>
<!-- 	<select>
		<option value="good_id">商品ID</option>
		<option value="type">商品类别</option>
		<option value="name">商品名</option>
	</select> -->
	<input type="text" id="good_id" placeholder="商品编号">
	<button id="query" onclick="query()">查 询</button>
	<a href="/GundamManager/QueryMenuViewServlet">返回查询菜单</a>
<script>
	function query() {
		var good_id = $('#good_id').val();
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
				if (res == "fail") {
					alert("查无此条目！");
				} else {
					alert("类型");
					window.location.href = "/GundamManager/MenuViewServlet";
				}
			}
		})
	}
</script>
</body>
</html>