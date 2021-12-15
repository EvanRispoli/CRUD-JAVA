<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description"
	content="Assessment da disciplina Desenvolvimento Web com Java EE ministrada pelo professo Elberth Moraes">
<meta name="author" content="Evan Rispoli">
<link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">
<link rel="canonical"
	href="https://getbootstrap.com/docs/4.0/examples/sign-in/">
<title>Sistema financeiro</title>
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
	<c:import url="/WEB-INF/jsp/Menu.jsp" />

	<div class="container">
	
		<hr>
		<c:if test="${not empty msg}">
			<div class="alert alert-danger">
				<h5>Falha ao excluir: ${msg}</h5>
			</div>
		</c:if>

		<c:if test="${not empty categoria}">
			<div class="alert alert-success">
				<strong>Confirma��o!</strong> A categoria ${nome} foi cadastrada com
				sucesso!!!
			</div>
		</c:if>

		<c:if test="${not empty listaCategorias}">

			<h4>Listagem de categorias (${listaCategorias.size()}):</h4>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>#</th>
						<th>Categoria</th>
						<th>Descri��o</th>
						<th>Vencimento</th>
						<th>Nome</th>
						<th>Tipo</th>
						<th>Valor</th>
						<th>Usuario</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="c" items="${listaCategorias}">
						<tr>

							<td>${c.id}</td>
							<td>${c.categoria}</td>
							<td>${c.comentario}</td>
							<td>${c.dataVencimento}</td>
							<td>${c.nome}</td>
							<td>${c.tipo}</td>
							<td>${c.valor}</td>
							<td>${c.usuario.nome}</td>
							<td><a href="/categoria/${c.id}/excluir">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<c:if test="${empty listaCategorias}">
			<h4>N�o existem categorias cadastrados!</h4>
		</c:if>
	</div>
</body>
</html>