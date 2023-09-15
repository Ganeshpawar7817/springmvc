<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
div {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 80vh;
}

form {
	border: 2px solid black;
	padding: 50px;
	width: 50vw;
	align-self: center;
}

input {
	text-align: center;
}
</style>
</head>
<body>
	<div>
		<form action="processform3" method="post">
			Name <input type="text" name="name" placeholder="enter name"><br>
			<br> Email <input type="text" name="email"
				placeholder="enter email"><br>
			<br> password <input type="password" name="password"
				placeholder="enter password"><br>
			<br> Gender <input type="radio" name="gender" value="male">Male
			<input type="radio" name="gender" value="female">Female <input
				type="radio" name="gender" value="other">Other <br>
			<br> Age <input type="number" name="age" placeholder="enter age"><br>
			<br> <input type="submit" name="">
		</form>
	</div>

</body>
</html>