<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Title</title>
    </head>
    <body>
        <form action="/webproject/entrada?acao=novoProduto" method="post">
            Nome: <input type="text" name="nomeDoProduto" >
            <br/>
            <br/>
            Data: <input type="text" name="dataCadastro" />
            <br/>
            <br/>
            <input type="submit">
        </form>
    </body>
</html>