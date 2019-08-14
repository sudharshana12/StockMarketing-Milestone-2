<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>User Registeration Page</title>
<link rel="Stylesheet" href="/styles/login-style.css">
</head>
<body>

	<div class="regiterationbox">

		<h1 class="reg-heading">Registeration</h1>
		<form:form method="POST" action="registerUser" modelAttribute="user2">
			<p>Enter username</p>
			<form:input type="text" path="username" name="uname"
				placeholder="Enter username"  />
			<p>Enter Password</p>
			<form:input type="password" path="password" name="password"
				placeholder="Enter password" />

			<p>Enter EmailId</p>
			<form:input type="text" path="email" name="email"
				placeholder="Enter Email"/>
			<p>Enter Mobile Number</p>
			<form:input type="text" path="mobileNumber" name="mobile"
				placeholder="Enter mobile number"  />
			<input type="submit" name="sumbit" value="Register">
			<a href="#">Already have an account?SignIn Here!</a>
		</form:form>
	</div>

</body>
</html>