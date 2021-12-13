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
<title>Cadastro de Usu�rios</title>
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
	<form class="form-cadastro" action="/pessoa" method="post">
		<div class="text-center">
			<img class="text-center" src="https://www.pngfind.com/pngs/m/416-4168092_infnet-2016-05-31-instituto-infnet-hd-png.png" alt="" width="80"
				height="80">
			<h1 class="h3 font-weight-normal Text-left">Cadastro de Clientes</h1>
			<a href="/cliente">Novo Cadastro</a>
			
			

		</div>
		<div class = "form-cadastro">
			<hr>
			<c:if test="${not empty nome}">
				<div class="alert alert-success">
					<strong>Yess!</strong> ${nome} cadastrado(a) com sucesso!
				</div>

			</c:if>

			<c:if test="${not empty listaClientes}">

				<h4>Lista de Usu�rios (${listaClientes.size()}):</h4>


				<table class="table table-striped">
					<thead>

						<tr>

							<th>#</th>
							<th>Nome</th>
							<th>E-mail</th>
							<th>CPF</th>
							<th><th>
							
							
						</tr>
					</thead>
					<tbody>
						<c:forEach var="c" items="${listaClientes }">
							<tr>
								<th>${c.id}</th>
								<th>${c.nome}</th>
								<th>${c.email}</th>
								<th>${c.cpf}</th>
								<th>${c.usuario.nome}</th>
                                <th><a href="/cliente/${u.id}/excluir">Excluir</a></th>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:if>
			<c:if test="${empty listaClientes}">
				<h5>N�o existem clientes cadastrados!</h5>
			</c:if>
		</div>
	</form>
	<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>

</html>