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
	content="TP1 da disciplina Desenvolvimento Web com Java EE ministrada pelo professo Elberth Moraes">
<meta name="author" content="Evan Rispoli">
<link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">
<link rel="canonical"
	href="https://getbootstrap.com/docs/4.0/examples/sign-in/">
<title>Cadastro de Pessoas</title>
<link href="./css/bootstrap.min.css" rel="stylesheet">
<link href="./css/styles.css" rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
<link href="./css/style.css" rel="stylesheet">

</head>

<body>

	<!-- Responsive navbar-->
	<c:import url="/WEB-INF/jsp/Menu.jsp" />
	<!-- Page content-->
	<div class="container">
		<form class="form-signin" action="/pessoa/incluir" method="post">
			<div class="text-center mb-4">
				<img class="mb-4" src="img/Infnet-Logo.png" alt="" width="80"
					height="80">
				<h1 class="h3 mb-3 font-weight-normal">Cadastro de Pessoas</h1>
				<p>Spring boot</p>
			</div>


			<div class="form-group ">
				<label for="nome">Nome:</label> <input type="text"
					class="form-control" id="nome" placeholder="Informe um nome"
					name="nome" required autofocus>
			</div>

			<div class="form-group">
				<label for="endereco">Endereço:</label> <input type="text"
					class="form-control" id="endereco"
					placeholder="Informe um endereço" name="endereco" required
					autofocus>
			</div>

			<div class="form-group">
				<label for="telefone">Telefone:</label> <input type="tel"
					class="form-control" id="telefone" placeholder="xx xxxx-xxxx"
					name="telefone" required autofocus
					pattern="[0-9]{2} [0-9]{4}-[0-9]{4}">
			</div>

			<div class="form-group">
				<label for="email">Email:</label> <input type="email"
					class="form-control" id="email" placeholder="Informe um email"
					name="email" required autofocus>
			</div>

			<button class="btn btn-lg btn-primary btn-block" type="submit">Cadastrar</button>
			<p class="mt-5 mb-3 text-muted text-center">&copy; Evan Rispoli</p>
		</form>
	</div>

</body>

</html>