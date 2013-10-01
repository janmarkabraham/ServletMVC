
<html>
<head>
  <title>Login Page</title>
</head>
<body>
	<h1 align="center">Login Page</h1>
	<div align="center">
	
		<form action="/ControllerServlet" method="POST">
		Profession: <select name="prof">
		  <option value="doctor">M.D.</option>
		  <option value="nurse">R.N.</option>
		</select> <br />
		Username: <input type="text" name="username" /> <br />
		Password: <input type="password" name="password" /> <br />
		<input type="submit" value="Submit" />
		</form>
	</div>

</body>
</html>
