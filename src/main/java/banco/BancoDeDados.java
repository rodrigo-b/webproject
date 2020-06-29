package banco;

import dominio.Produto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BancoDeDados {

    public static List<Produto> listaDeProdutos = new ArrayList<>();


    static {
        Produto produto1 = new Produto("tenis");
        Produto produto2 = new Produto("camisa");
        Produto produto3 = new Produto("Calça");

        produto1.setDataCadastro(new Date());
        produto2.setDataCadastro(new Date());
        produto3.setDataCadastro(new Date());

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

    }


    public BancoDeDados() {

    }

    public List<Produto> getListaDeProdutos(){
        return BancoDeDados.listaDeProdutos;
    }

    public void insert(Produto produto){
        listaDeProdutos.add(produto);
    }

    public Produto buscaProdutoPorId(Long id) {

        for(int i = 0; i < listaDeProdutos.size(); i++){

            Produto produto = listaDeProdutos.get(i);

            if(produto.getId() == id){
                return produto;
            }
        }

        return null;
    }

    public void deletarProduto(Produto produto){

        if(listaDeProdutos.contains(produto)){
            listaDeProdutos.remove(produto);
        }

/*        for(int i = 0; i < listaDeProdutos.size(); i++){
            Produto p = listaDeProdutos.get(i);

            if(p.getId() == produto.getId()){
                listaDeProdutos.remove(i);
            }
        }*/

    }
}
