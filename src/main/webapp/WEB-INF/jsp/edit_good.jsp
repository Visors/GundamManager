<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>编辑商品</title>
</head>
<body>
	<input type="text" id="good_id" placeholder="商品编号"><br/>
	<input type="text" id="type" placeholder="类型"><br/>
	<input type="text" id="name" placeholder="商品名称"><br/>
	<input type="text" id="price" placeholder="价格"><br/>
	<input type="text" id="source" placeholder="出处"><br/>
	<input type="date" id="last_date">上次再版时间<br/>
	<input type="date" id="next_date">最新再版时间<br/>
	<button id="edit" onclick="edit()">编 辑</button>
	<a href="/GundamManager/MenuViewServlet">返回主菜单</a>
</body>
</html>