<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="/WEB-INF/jsp/template.jsp"/>
<html>
	<head>
		<link href="login.css" rel="stylesheet">
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
				<title>ITEMS | Expense Management System</title>
				<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
				<!-- <script src="js/register.js"></script> -->
				<script type="text/javascript">
					function validateEmail(emailField) {
						var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;

						if (reg.test(emailField.value) == false) {

							document.getElementById("email-msg").innerHTML = "&#9888; Please enter a valid Email Address";
						}

					}
				</script>
				<script type="text/javascript">
					function validateMobile(mobile) {
						var val = mobile.value
						if (/^\d{10}$/.test(val)) {
							// value is ok, use it
						} else {
							document.getElementById("mobile-msg").innerHtml = "&#9888; Please enter a valid mobile number";
						}
					}
				</script>
			</head>
			<body>
				<form name="register" action="account/create" method="post" id="reg-form" name="reg-form">
					<div class="login-container">
						<h1 class="welcome-text">
							Welcome to ITEMS !
							<Span>
								<h5>Create your own account</h5>
							</Span>
							<div class="login-fields">
								<input class="rnd-textbox" type="text" id="reg-email" placeholder="e-Mail" name="email" onblur="validateEmail(this)"/>
								<span class="reg-alerts" id="email-msg" required></span>
								<input class="rnd-textbox" type="text" id="reg-name" placeholder="Name" name="name"></input>
								<input class="rnd-textbox" type="text" id="reg-pwd" placeholder="Password" name="password" required></input>
								<input class="rnd-textbox" type="text" id="reg-cpwd" placeholder="Re-type password" name="confirmPassword" required></input>
								<input class="rnd-textbox" type="text" id="reg-mobile" placeholder="Mobile" name="mobile" onblur="validateMobile(this)" required>
									<span class="reg-alerts" id="mobile-msg" required></span>
								</input>
								<h6>
									<input class="sub-text" type="checkbox" id="reg-terms" name="terms&Conditions" required>
										I agree to ITEMS'
										<a href="#">
											terms & conditions.</a>
									</h6>
									<input class="rnd-button" type="submit" id="reg-submit" value="Create Account"/>
									<br/>
									<h6>
										<a href="login">
											Login to your account</a>
									</h6>
								</div>
							</h1>
						</div>
					</form>
				</body>
			</html>