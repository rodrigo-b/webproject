package servlets;

import acao.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/entrada")
public class ServletController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {

        String acao = requisicao.getParameter("acao");

        if(acao.equals("listagemDeProduto")){
            ListagemDeProdutosAcao listagemDeProdutosAcao = new ListagemDeProdutosAcao();
            listagemDeProdutosAcao.executa(requisicao,resposta);
        } else if(acao.equals("mostrarProduto")){
            MostrarProdutoAcao mostrarProdutoAcao = new MostrarProdutoAcao();
            mostrarProdutoAcao.executa(requisicao,resposta);
        } else if(acao.equals("removeProduto")){
            RemoveProdutoAcao  removeProdutoAcao = new RemoveProdutoAcao();
            removeProdutoAcao.executa(requisicao,resposta);
        } else if(acao.equals("alterarProduto")){
            AlterarProdutoAcao alterarProdutoAcao = new AlterarProdutoAcao();
            alterarProdutoAcao.executa(requisicao,resposta);
        } else if(acao.equals("novoProduto")){
             CadastroDeProdutoAcao cadastroDeProdutoAcao = new CadastroDeProdutoAcao();
             cadastroDeProdutoAcao.executa(requisicao,resposta);
        }

    }
}
