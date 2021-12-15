<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description"
    content="Assessment da disciplina Desenvolvimento Web com Java EE ministrada pelo professo Elberth Moraes">
  <meta name="author" content="Evan Rispoli">
  <link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">
  <link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/sign-in/">
  <title>Cadastro de Solicitantes</title>
  <link href="bootstrap.min.css" rel="stylesheet">
  <link href="styles.css" rel="stylesheet">
  <link href="style.css" rel="stylesheet">

</head>

<body>

  <!-- Responsive navbar-->
  <c:import url="/WEB-INF/jsp/Menu.jsp" />
  <!-- Page content-->
  <div class="container">

<div class="form-cadastro">
  <div class="text-center mb-4">
    <img class="mb-4" src="kakebo.png" alt="" width="80" height="80">
    <h1 class="h3 mb-3 font-weight-normal">Cadastro de Solicitantes</h1>
  </div>


    <form class="form-cadastro" action="/solicitante/incluir" method="post">
    <div class="form-group ">
      <label for="nome">Nome:</label> <input type="text" class="form-control" id="nome" placeholder="Informe um nome"
        name="nome" required autofocus value="Alberto Moraes">
    </div>

    <div class="form-group">
      <label for="email">Email:</label> <input type="email" class="form-control" id="email"
        placeholder="Informe um email" name="email" required autofocus value="alberto@moraes.com">
    </div>
    <div class="form-group">
      <label for="cpf">CPF:</label> <input type="text" class="form-control" id="cpf"
        placeholder="xxx.xxx.xxx-xx" value = "123.456.789-10" name="cpf"  pattern="[0-9]{3}\.[0-9]{3}\.[0-9]{3}\-[0-9]{2}" required autofocus>
    </div>

    <button class="btn btn-lg btn-secondary btn-block" type="submit">Cadastrar</button>
    

  </form>

</div>
</div>
<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>

</html>