package acao;

import banco.BancoDeDados;
import dominio.Produto;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoveProdutoAcao {

    public void executa (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Long id = Long.parseLong(req.getParameter("id"));

        BancoDeDados banco = new BancoDeDados();

        Produto produto = banco.buscaProdutoPorId(id);

        banco.deletarProduto(produto);

        resp.sendRedirect("entrada?acao=listagemDeProduto");

    }
}
