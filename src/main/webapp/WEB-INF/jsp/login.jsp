<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description"
	content="Assessment da disciplina Desenvolvimento Web com Java EE ministrada pelo professo Elberth Moraes">
<meta name="author" content="Evan Rispoli">
<link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">
<link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/sign-in/">
<title>Login</title>
<link href="styles.css" rel="stylesheet">
<link href="style.css" rel="stylesheet">
<script	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>

</head>

<body>
	<c:import url="/WEB-INF/jsp/Menu.jsp" />
	<!-- Page content-->

	<div class="container">
		<form class="form-signin" action="/login" method="post">
			<div class="text-center mb-4">
				<img class="mb-4 logo" src="kakebo.png" alt="" width="80"
					height="80">
				<h6 class="h5 mb-12 font-weight-normal">Sistema de cadastro de
					despesas</h6>

				<c:if test="${not empty msg}">

					<div class="alert alert-warning">
						<strong>Oops!!</strong>
						<p>${msg}</p>
					</div>

				</c:if>


				<p>Desenvolvimento Web com Java EE</p>
			</div>

			<div class="form-label-group">
				<input type="email" id="inputEmail" name="email"
					value="rodrigo@magalhaes.com" class="form-control"
					placeholder="E-mail" required autofocus> <label
					for="inputEmail">Email </label>
			</div>

			<div class="form-label-group">
				<input type="password" id="inputPassword" name="senha"
					value="123" class="form-control"
					placeholder="Senha" required> <label
					for="inputPassword">Senha</label>
			</div>

			<button class="btn btn-lg btn-secondary btn-block" type="submit">Entrar</button>
			
		</form>
	</div>
	<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>

</html>