package acao;

import banco.BancoDeDados;
import dominio.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListagemDeProdutosAcao {

    public void executa(HttpServletRequest requisicao, HttpServletResponse resp) throws ServletException, IOException {

        BancoDeDados bancoDeDados = new BancoDeDados();

        List<Produto> listaDeProdutos = bancoDeDados.getListaDeProdutos();

        String caminhoParaDispacharARequisicao = "listagemDeProduto.jsp";

        RequestDispatcher dispatcher = requisicao.getRequestDispatcher(caminhoParaDispacharARequisicao);

        requisicao.setAttribute("listaDeProdutos", listaDeProdutos);

        dispatcher.forward(requisicao,resp);
    }
}
