<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link href="bootstrap.min.css" rel="stylesheet">
  <link href="css/styles.css" rel="stylesheet">
  <link href="style.css" rel="stylesheet">

</head>

<div class="form-group">
    <label for="cep">CEP:</label>
    <input type="text" class="form-control"  name = "cep" id="cep" value = "${endereco.cep}">
</div>
<div class="form-group ">
  <label for="logradouro">Logradouro:</label> <input type="text" class="form-control" id="logradouro"
    placeholder="Informe um logradouro" name="logradouro" required autofocus value="${endereco.logradouro}">
</div>

<div class="form-group ">
  <label for="complemento">Complemento:</label> <input type="text" class="form-control" id="complemento"
    placeholder="Informe um complemento" name="complemento" autofocus value="${endereco.complemento}">
</div>

<div class="form-group ">
  <label for="bairro">Bairro:</label> <input type="text" class="form-control" id="bairro"
    placeholder="Informe um bairro" name="bairro" required autofocus value="${endereco.bairro}">
</div>

<div class="form-group ">
  <label for="localidade">Cidade:</label> <input type="text" class="form-control" id="localidade"
    placeholder="Informe a cidade" name="localidade" required autofocus value="${endereco.localidade}">
</div>

<div class="form-group ">
  <label for="uf">UF:</label> <input type="text" class="form-control" id="uf" placeholder="Informe um estado" name="uf"
    required autofocus value="${endereco.uf}">
</div>
