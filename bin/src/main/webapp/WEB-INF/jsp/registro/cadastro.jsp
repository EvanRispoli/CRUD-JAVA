<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description"
    content="Assessment da disciplina Desenvolvimento Web com Java EE ministrada pelo professo Elberth Moraes">
  <meta name="author" content="Evan Rispoli">
  <link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">
  <link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/sign-in/">
  <title>Registros</title>
  <link href="bootstrap.min.css" rel="stylesheet">
  <link href="style.css" rel="stylesheet">
  <link href="styles.css" rel="stylesheet">


  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>

	<!-- Responsive navbar-->
	<c:import url="/WEB-INF/jsp/Menu.jsp" />
	<!-- Page content-->

	<c:set var="botao" value="" />
	<div class="container">
		<form class="form-cadastro" action="/registro/incluir" method="post">
			<div class="text-center mb-4">
				<img class="mb-4" src="kakebo.png" alt="" width="80" height="80">
				<h1 class="h3 mb-3 font-weight-normal">Registros</h1>
				<p>Kakebo</p>
			</div>

			<div class="form-group">
			<c:if test="${not empty produtos}">
		      <label>Categorias:</label>
		      <c:forEach var="c" items="${categorias}">
				<div class="form-check-inline">
				  <label class="form-check-label">
				    <input type="checkbox" name="categoriasIds" class="form-check-input" value="${c.id}"> ${c.nome}
				  </label>
				</div>
			  </c:forEach>
			</c:if>  			
			<c:if test="${empty registros}">
		      <label>Não existem categorias cadastrados!!!</label>	
		      <c:set var="botao" value="disabled"/>		
			</c:if>
			</div>
			
			<div class="form-group">
		    <c:if test="${not empty solicitantes}">
		      <label>Solicitante:</label>
				<select class="form-control" name="solicitante.id">
				  <c:forEach var="s" items="${solicitantes}">
					<option value="${s.id}">${s.nome}</option>
				  </c:forEach>
				</select>
			</c:if>
		    <c:if test="${empty solicitantes}">
		      <label>Não existem solicitantes cadastrados!!!</label>
		      <c:set var="botao" value="disabled"/>
		    </c:if>
			</div>

			<button ${botao} class="btn btn-primary" type="submit">Cadastrar</button>
		</form>

	</div>
	</div>
	<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>

</html>