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
  <title>Cadastro de Despesas</title>
  <link href="bootstrap.min.css" rel="stylesheet">
  <link href="style.css" rel="stylesheet">
  <link href="styles.css" rel="stylesheet">


  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>

  <!-- Responsive navbar-->
  <c:import url="/WEB-INF/jsp/Menu.jsp" />
  <!-- Page content-->
  <div class="container">
    <form class="form-cadastro" action="/despesa/incluir" method="post">
      <div class="text-center mb-4">
        <img class="mb-4" src="kakebo.png" alt="" width="80" height="80">
        <h1 class="h3 mb-3 font-weight-normal">Cadastro de Despesas</h1>
        <p>Kakebo</p>
      </div>




      <div class="form-group ">
        <label for="nome" class="form-label">Nome:</label> <input type="text" class="form-control" id="nome"
          placeholder="Informe um nome" name="nome" required autofocus>
      </div>
      <div class="form-group ">
        <label for="descricao" class="form-label">Descrição:</label> <input type="text" class="form-control"
          id="descricao" placeholder="Informações adicionais" name="descricao" required autofocus>
      </div>
      <div class="form-group ">
        <label for="beneficiario" class="form-label">Beneficiário:</label> <input type="text" class="form-control"
          id="beneficiario" placeholder="Informe um beneficiário" name="beneficiario" required autofocus>
      </div>

      <div class="form-group">
        <label for="categoria" class="form-label">Categoria:</label>
        <select name="categoria" id="categoria" class="form-control">
          <option>Selecione</option>
          <option value="Moradia">Moradia</option>
          <option value="Supermercado">Supermercado</option>
          <option value="Saude">Moradia</option>
          <option value="Educacao">Educação</option>
          <option value="Lazer">Lazer</option>
          <option value="Compras">Compras</option>
          <option value="Outros">Outros</option>
        </select>
      </div>

      <div class="form-group">
        <label for="opcaoRecorrencia" class="form-label">Recorrência:</label>
        <select name="opcaoRecorrencia" id="opcaoRecorrencia" class="form-control">
          <option>Selecione</option>
          <option value=0>Lançamento Único</option>
          <option value=1>Lançamento Quinzenal</option>
          <option value=2>Lançamento Mensal</option>
          <option value=3>Lançamento Trimestral</option>
          <option value=4>Lançamento Semestral</option>
          <option value=5>Lançamento Anual</option>
        </select>
      </div>

      <div class="form-group">
        <div class="form-check-inline">
          <input type="radio" class="btn-check" name="tipo" id="option1" autocomplete="off" checked>
          <label class="btn btn-outline-secondary form-label  btn-block-inline" for="option1">Necessário</label>

          <input type="radio" class="btn-check" name="tipo" id="option2" autocomplete="off">
          <label class="btn btn-outline-secondary form-label btn-block-inline" for="option2">Supérfluo</label>
        </div>
      </div>


      <div class="form-group">
        <label for="valor" class="form-label">Valor (R$):</label> <input type="number" format="currency" step="0.01"
          class="form-control" id="valor" placeholder="Informe um valor" name="valor" required autofocus>
      </div>

      <div class="form-group">
        <label for="Data" class="form-label">Data:</label>
        <input type="date" id="data" name="data" class="form-control">
      </div>

      <div class="form-group form-label">
        <button class="btn btn-lg btn-secondary btn-block" type="submit">Cadastrar</button>
      </div>
      <p class="mt-5 mb-3 text-muted text-center">&copy; Evan Rispoli</p>
    </form>

  </div>
  </div>

</body>

</html>