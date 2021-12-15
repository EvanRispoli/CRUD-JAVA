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
<c:import url="/WEB-INF/jsp/Menu.jsp"/>

<div class="container">

    <a href="/registro">Adicionar Registro</a>
    <hr>

    <c:if test="${not empty msg}">
        <div class="alert alert-danger">
            <h5> Falha no Cadastramento: ${msg}</h5>
        </div>
    </c:if>

    <c:if test="${not empty descricao}">
        <div class="alert alert-success">
            <h5>Registro "${descricao}" cadastrado com sucesso</h5>
        </div>
    </c:if>

    <c:if test="${not empty listaRegistros}">
        <h4>Listagem de Registros (${listaRegistros.size()}):</h4>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Id</th>
                <th>Descrição</th>
                <th>Planejado</th>
                <th>Data</th>
                <th>Solicitante</th>
                <th>Categorias</th>
                <th></th>


            </tr>
            </thead>
            <tbody>
            <c:forEach var="r" items="${listaRegistros}">
            id dataformatada solicitante descricao categorias  usuario
                <tr>
                    <td>${r.id}</td>
                    <td>${r.descricao}</td>
                    <td>${r.planejado}</td>
                    <td>${r.dataFormatada}</td>
                    <td>${r.solicitante.nome}</td>
                    <td>${r.categorias.size()}</td>

                    <td><a href="/registro/excluir/${r.id}">Excluir</a></td>

                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>
    <c:if test="${empty listaRegistros}">
        <h4>Nenhum  Registro Cadastrado</h4>
    </c:if>
</div>

</body>
</html>
