<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="Evan Rispoli" />
<title>Home</title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="./css/bootstrap.min.css" rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>

</head>

<body>
	<!-- Responsive navbar-->
	<c:import url="/WEB-INF/jsp/Menu.jsp" />
	<!-- Page content-->
	<div class="container">

		<div class="text-center mt-5">
			<c:if test="${not empty user}">
				<h2>Sistema Financeiro</h2>
				<h5>Seja Bem-vindo, ${user.nome}</h5>

				<p class="lead">Desenvolvimento JAVA Web - Springboot</p>
				<p>Assessment</p>
			</c:if>
			<c:if test="${empty user}">
				<h1>Sistema de orçamento financeiro</h1>
				<p class="lead">Desenvolvimento JAVA Web - Springboot</p>
				<p>Projeto realizado como requisito avaliativo - 
				Assessment da disciplina Desenvolvimento Web Java EE ;
				</p>
			</c:if>
		</div>
	</div>
	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
</body>
<c:import url="/WEB-INF/jsp/footer.jsp" />
</html>

