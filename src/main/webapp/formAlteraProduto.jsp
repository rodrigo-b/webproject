<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Title</title>
    </head>
    <body>
        <form action="/webproject/entrada?acao=alterarProduto" method="post">
            Nome: <input type="text" name="nomeDoProduto" value="${produto.nome}" >
            <br/>
            <br/>
            Data de Cadastro: <input type="text" name="dataCadastro" value="<fmt:formatDate value="${produto.dataCadastro}" pattern="dd/MM/yyyy"/>" />
            <br/>
            <br/>
            <input type="hidden" name="id" value="${produto.id}">

            <input type="submit">
        </form>
    </body>
</html>