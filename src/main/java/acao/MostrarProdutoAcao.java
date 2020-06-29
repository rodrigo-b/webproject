package acao;

import banco.BancoDeDados;
import dominio.Produto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MostrarProdutoAcao {

    public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String paramId = request.getParameter("id");
        Long id = Long.valueOf(paramId);

        BancoDeDados banco = new BancoDeDados();

        Produto produto = banco.buscaProdutoPorId(id);

        request.setAttribute("produto", produto);

        RequestDispatcher rd = request.getRequestDispatcher("/formAlteraProduto.jsp");

        rd.forward(request,response);
    }
}
