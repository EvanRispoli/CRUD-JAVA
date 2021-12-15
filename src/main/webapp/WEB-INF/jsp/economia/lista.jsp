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

	<!-- Responsive navbar-->
	<!-- Responsive navbar-->
	<c:import url="/WEB-INF/jsp/Menu.jsp" />
	<!-- Page content-->
	<div class="container">

		<a href="/economia">Nova economia</a>

		<hr>
		<c:if test="${not empty msg}">
			<div class="alert alert-danger">
				<h5>Falha ao excluir: ${msg}</h5>
			</div>
		</c:if>


		<c:if test="${not empty nome}">
			<div class="alert alert-success">
				<strong>Yess!</strong> ${nome} cadastrado(a) com sucesso!
			</div>

		</c:if>

		<c:if test="${not empty listaEconomias}">

			<h4>Listagem de economias (${listaEconomias.size()}):</h4>


			<table class="table table-striped">
				<thead>

					<tr>
						<th>#</th>
						<th>Nome</th>
						<th>Descrição</th>
						<th>Objetivo</th>
						<th>Categoria</th>
						<th>Recorrência</th>
						<th>Valor</th>
						<th>Vencimento</th>
						<th>Tipo</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="e" items="${listaEconomias }">
						<tr>
							<th>${e.id}</th>
							<th>${e.nome}</th>
							<th>${e.comentario}</th>
							<th>${e.objetivo}</th>
							<th>${e.categoria}</th>
							<th>${e.recorrencia}</th>
							<th>${e.valor}</th>
							<th>${e.dataVencimento}</th>
							<th>${e.tipo}</th>
							<th><a href="/economia/${e.id}/excluir">Excluir</a></th>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		<c:if test="${empty listaEconomias}">
			<h5>Não existem economias cadastradas!</h5>
		</c:if>
	</div>
	</form>
	<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>

</html>