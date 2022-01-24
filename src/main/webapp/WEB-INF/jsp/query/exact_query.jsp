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
			url : '/GundamManager/ExactQueryServlet',
			data : {
				'good_id' : good_id
			},
			dataType : 'json',
			success : function(res) {
				if (res == "fail") {
					alert("查无此条目！");
				} else {
					alert("类型: "+res.type+'\n'+
							"商品名称: "+res.name+'\n'+
							"商品价格: "+res.price+'\n'+
							"出处: "+res.source+'\n'+
							"最新再版时间: "+res.next_date+'\n'+
							"上次再版时间: "+res.last_date);
					window.location.href = "/GundamManager/QueryMenuViewServlet";
				}
			}
		})
	}
</script>
</body>
</html>