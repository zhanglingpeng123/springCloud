<html>
<head>
	<meta http-equiv=Content-Type content="text/html;charset=utf-8">
	<title>用户列表</title>
	<script src="/hello.js"></script>
</head>
<body>
	<table border="1">
		<th>
			<td>id</td>
			<td>用户名</td>
			<td>密码</td>
		</th>
		<#list userList as user>
		<tr>
			<td>${user.id}</td>
			<td>${user.username}</td>
			<td>${user.password}</td>
		</tr>
		</#list>
	</table>
	<button onclick="hello()">hello2</button>
</body>
</html>