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
		
		<a href="/solicitante">Nova despesa</a>
	
		<hr>
			<c:if test="${not empty nome}">
				<div class="alert alert-success">
					<strong>Yess!</strong> ${nome} cadastrado(a) com sucesso!
				</div>

			</c:if>

			<c:if test="${not empty listaDespesas}">

				<h4>Listagem de despesas (${listaDespesas.size()}):</h4>


				<table class="table table-striped">
					<thead>

						<tr>
							<th>#</th>
							<th>Nome</th>
							<th>Descri��o</th>
							<th>Benefici�rio</th>
							<th>Categoria</th>
							<th>Recorr�ncia</th>
							<th>Valor</th>
							<th>Tipo</th>
							<th>Vencimento</th>
							
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="d" items="${listaDespesas }">
							<tr>
								<th>${d.id}</th>
								<th>${d.nome}</th>
								<th>${d.comentario}</th>
								<th>${d.beneficiario}</th>
								<th>${d.categoria}</th>
								<th>${d.recorrencia}</th>
								<th>${d.valor}</th>
								<th>${d.tipo}</th>
								<th>${d.dataVencimento}</th>
								<th><a href="/despesa/${d.id}/excluir">Excluir</a></th>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:if>
			<c:if test="${empty listaDespesas}">
				<h5>N�o existem despesas cadastradas!</h5>
			</c:if>
		</div>
	</form>
</body>

</html>