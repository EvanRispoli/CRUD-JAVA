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
		

	
		<hr>
			<c:if test="${not empty nome}">
				<div class="alert alert-success">
					<strong>Yess!</strong> ${nome} cadastrado(a) com sucesso!
				</div>

			</c:if>

			<c:if test="${not empty listaUsuarios}">

				<h4>Lista de Usuários (${listaUsuarios.size()}):</h4>


				<table class="table table-striped">
					<thead>

						<tr>

							<th>#</th>
							<th>Nome</th>
							<th>E-mail</th>
							<th>Cadastros</th>
							<c:if test="${user.admin}">
							    <th><th>
							</c:if>
							
						</tr>
					</thead>
					<tbody>
						<c:forEach var="u" items="${listaUsuarios }">
							<tr>
								<th>${u.id}</th>
								<th>${u.nome}</th>
								<th>${u.email}</th>
								<th>${u.clientes.size()}</th>
								<c:if test="${user.admin}">
                                    <th><a href="/usuario/${u.id}/excluir">Excluir</a></th>
                                </c:if>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:if>
			<c:if test="${empty listaUsuarios}">
				<h5>Não existem usuários cadastradas!</h5>
			</c:if>
		</div>
	</form>
	<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>

</html>