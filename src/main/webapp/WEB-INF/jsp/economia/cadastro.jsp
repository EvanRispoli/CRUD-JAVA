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
  <title>Cadastro de Economias</title>
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
    <form class="form-cadastro" action="/economia/incluir" method="post">
      <div class="text-center mb-4">
        <img class="mb-4" src="kakebo.png" alt="" width="80" height="80">
        <h1 class="h3 mb-3 font-weight-normal">Cadastro de Economias</h1>
        <p>Kakebo</p>
      </div>




      <div class="form-group ">
        <label for="nome" class="form-label">Nome:</label> <input type="text" class="form-control" id="nome"
          placeholder="Informe um nome" name="nome" required autofocus>
      </div>
      <div class="form-group ">
        <label for="descricao" class="form-label">Descri��o:</label> <input type="text" class="form-control"
          id="descricao" placeholder="Informa��es adicionais" name="comentario" required autofocus>
      </div>
      <div class="form-group ">
        <label for="objetivo" class="form-label">Objetivo:</label> <input type="text" class="form-control"
          id="objetivo" placeholder="Informe um objetivo" name="objetivo" required autofocus>
      </div>

      <div class="form-group">
        <label for="categoria" class="form-label">Categoria:</label>
        <select name="categoria" id="categoria" class="form-control">
          <option>Selecione</option>
          <option value="Moradia">Viagem</option>
          <option value="Supermercado">Carro Novo</option>
          <option value="Saude">Cursos</option>
          <option value="Educacao">Educa��o</option>
          <option value="Outros">Outros</option>
        </select>
      </div>

      <div class="form-group">
        <label for="recorrencia" class="form-label">Recorr�ncia:</label>
        <select name="recorrencia" id="recorrencia" class="form-control">
          <option>Selecione</option>
          <option value="Lan�amento �nico">Lan�amento �nico</option>
          <option value="Lan�amento Quinzenal">Lan�amento Quinzenal</option>
          <option value="Lan�amento Mensal">Lan�amento Mensal</option>
          <option value="Lan�amento Trimestral">Lan�amento Trimestral</option>
          <option value="Lan�amento Semestral">Lan�amento Semestral</option>
          <option value="Lan�amento Anual">Lan�amento Anual</option>
        </select>
      </div>
      
      
      <div class="form-group">
        <label for="tipo" class="form-label">Tipo:</label>
        <select name="tipo" id="recorrencia" class="form-control">
          <option>Selecione</option>
          <option value="Longo prazo">Longo prazo</option>
          <option value="Curto prazo">Curto prazo</option>
        </select>
      </div>

      <div class="form-group">
        <label for="valor" class="form-label">Valor (R$):</label> <input type="number" format="currency" step="0.01"
          class="form-control" id="valor" placeholder="Informe um valor" name="valor" required autofocus>
      </div>

      <div class="form-group">
        <label for="Data" class="form-label">Data:</label>
        <input type="date" id="dataVencimento" name="dataVencimento" class="form-control">
      </div>

      <div class="form-group form-label">
        <button class="btn btn-lg btn-secondary btn-block" type="submit">Cadastrar</button>
      </div>
      <p class="mt-5 mb-3 text-muted text-center">&copy; Evan Rispoli</p>
    </form>

  </div>
  </div>
<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>

</html>