<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="ISO-8859-1">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description"
    content="Assessment da disciplina Desenvolvimento Web com Java EE ministrada pelo professo Elberth Moraes">
  <meta name="author" content="Evan Rispoli">
  <link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">
  <link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/sign-in/">
  <title>Cadastro de Usuários</title>
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
    <h1 class="h3 mb-3 font-weight-normal">Cadastro de Usuarios</h1>
  </div>


  <form action="/cep" method="post">
    <div class="row container-fluid mt-3">
      <div class="row">
        <div class="col-10 ">
        <input type="text" class="form-control" id="cep" value ="20010020" placeholder="Informe um CEP"
        name="cep" required autofocus>
        </div>
        <div class="col-2">
          <button class="btn btn-secondary " type="submit">Buscar</button>
        </div>
      </div>
  </form>

  <form class="form-cadastro" action="/usuario/incluir" method="post">
    <div class="form-group ">
      <label for="nome">Nome:</label> <input type="text" class="form-control" id="nome" placeholder="Informe um nome"
        name="nome" required autofocus value="Elberth">
    </div>

    <div class="form-group">
      <label for="email">Email:</label> <input type="email" class="form-control" id="email"
        placeholder="Informe um email" name="email" required autofocus value="elberth@moraes.com">
    </div>
    <div class="form-group">
      <label for="senha">Senha:</label> <input type="password" class="form-control" id="password"
        placeholder="Informe uma senha" name="senha" required autofocus value="123">
    </div>

      <c:import url="/WEB-INF/jsp/endereco.jsp" />

    <button class="btn btn-lg btn-secondary btn-block" type="submit">Cadastrar</button>
    <p class="mt-5 mb-3 text-muted text-center">&copy; Evan Rispoli</p>

  </form>

</div>
</div>
<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>

</html>