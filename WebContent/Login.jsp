<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="styling.css">
</head>
<body>
	<nav class="navbar navbar-expand-lg">
		<a class="navbar-brand" href="#">Cheap Thrills!</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">

			<form action="LoginServlet" id="loginForm" novalidate method="post"
				class="form-inline my-2 my-lg-0" style="margin-left: 5in;">
				<input class="form-control mr-sm-2" type="text" name="email1"
					placeholder="Enter Email" aria-label="Login"
					style="background-color: black"> <input
					class="form-control mr-sm-2" type="password" name="pass"
					placeholder="Enter Password" aria-label="Login1"
					style="background-color: black">
				<button class="btn btn-success my-2 my-sm-0" type="submit">
					<i class="fa fa-unlock-alt" aria-hidden="true"> LOGIN</i>
				</button>
			</form>

		</div>
	</nav>

	<div class="container">
	
		
		<c:if test="${lol eq 0}">
			<h1 style="color: white"> Login Unsuccessful</h1>
		</c:if>
			
		<div class="row">
			<div
				class="col-md-6 col-sm-8 col-xs-12 col-md-offset-3 col-sm-offset-2 offset-6"
				style="color: #f1f1f1">
				<div class="register-form">
					<form action="RegiterServlet" id="registerForm" novalidate
						method="post">
						<h2 class="text-center">Registration</h2>
						<p class="hint-text">Create your account. It's free and takes
							just a minute.</p>
						<div class="row">
							<div class="col-md-6 col-xs-12">
								<div class="form-group">
									<input type="text" name="first_name" class="form-control"
										placeholder="First Name" required="required">
								</div>
							</div>
							<div class="col-md-6 col-xs-12">
								<div class="form-group">
									<input type="text" name="last_name" class="form-control"
										placeholder="Last Name" required="required">
								</div>
							</div>
						</div>
						<div class="form-group">
							<input type="email" name="email" class="form-control"
								placeholder="Email" required="required">
						</div>
						<div class="form-group">
							<input type="password" name="password" class="form-control"
								placeholder="Password" required="required">
						</div>
						<div class="form-group">
							<input type="password" name="confirm_password"
								class="form-control" placeholder="Confirm Password"
								required="required">
						</div>
						<div class="form-group">
							<label class="checkbox-inline"> <input type="checkbox"
								required="required"> You agree to the <a href="#">Terms</a>
								& <a href="#">Conditions</a>.
							</label>

						</div>

						<div class="row">
							<div class="col-md-6 col-xs-12 offset-3">
								<div class="form-group">
									<input type="submit" value="Register"
										class="btn btn-primary btn-block btn-lg" tabindex="7">
								</div>
							</div>

						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div style="border-bottom: 2px solid white"></div>
	<br>


	<!-- Optional JavaScript -->


	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"
		integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
		crossorigin="anonymous"></script>

	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>

	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.1/dist/jquery.validate.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.1/dist/additional-methods.min.js"></script>
	<script type="text/javascript" src="validate.js"></script>
</body>
</html>