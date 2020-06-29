package acao;

import banco.BancoDeDados;
import dominio.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AlterarProdutoAcao {

    public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String paramId = request.getParameter("id");

        Long id = Long.parseLong(paramId);

        BancoDeDados banco = new BancoDeDados();

        Produto produto = banco.buscaProdutoPorId(id);

        produto.setNome(request.getParameter("nomeDoProduto"));

        String paramDataCadastro = request.getParameter("dataCadastro");

        Date dataCadastro  = null;

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataCadastro = sdf.parse(request.getParameter("dataCadastro"));
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        produto.setDataCadastro(dataCadastro);

        response.sendRedirect("entrada?acao=listagemDeProduto");

    }
}
