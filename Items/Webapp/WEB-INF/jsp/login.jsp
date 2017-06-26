<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="/WEB-INF/jsp/template.jsp" />
<html>
<head>
<link href="login.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ITEMS | Expense Management System</title>
</head>
<body>
	<div class="login-container">
		<h1 class="welcome-text">
			Welcome to ITEMS ! <Span>
				<h5>Sign in to your account</h5>
			</Span>
			<div class="login-fields">
				<input class="rnd-textbox" type="text" id="login-email"
					placeholder="Username"> </input> 
					
			<input class="rnd-textbox"
					type="text" id="login-password" placeholder="Password" />
					<br/>
			<h6><input class="sub-text" type="checkbox" id="login-remember"> Remember me</h6>
			<input class="rnd-button" type="submit" id="login-submit" value="Log in" />
						
			<h6>Don't have an account ? <a href="register"> Register</a> now </h6>
			</div>
		</h1>
	</div>
</body>
</html>