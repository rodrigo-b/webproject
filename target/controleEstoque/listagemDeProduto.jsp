<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>

    Lista de produtos: <br />

     ${produto1.nome}

    <ul>
      <core:forEach items="${listaDeProdutos}" var="produto">
                <li>${produto.getNome()}  - <fmt:formatDate value="${produto.getDataCadastro() }" pattern="dd/MM/yyyy"/>
                    <a href="/webproject/editarProduto?id=${produto.getId()}">editar</a>
                    <a href="/webproject/removeProduto?id=${produto.getId()}" >remover</a>
                </li>
      </core:forEach>
    </ul>

</body>
</html>