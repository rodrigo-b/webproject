package acao;

import banco.BancoDeDados;
import dominio.Produto;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CadastroDeProdutoAcao {

    public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        BancoDeDados banco = new BancoDeDados();

        String nomeProduto = request.getParameter("nomeDoProduto");

        Date dataCadastro  = null;

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataCadastro = sdf.parse(request.getParameter("dataCadastro"));
        } catch (ParseException e) {
            throw new ServletException(e);
        }


        System.out.println("nomeDoProdutoRecebido -> " + nomeProduto);

        Produto produto = new Produto(nomeProduto);
        produto.setDataCadastro(dataCadastro);

        System.out.println("Novo Produto criado");

        banco.insert(produto);


        //########################Servlet fez tudo que devia
        response.sendRedirect("entrada?acao=listagemDeProduto");

/*        String caminhoParaDispacharARequisicao = "listagemDeProduto";

        RequestDispatcher dispatcher = request.getRequestDispatcher(caminhoParaDispacharARequisicao);

        dispatcher.forward(request,response);*/

    }

}
