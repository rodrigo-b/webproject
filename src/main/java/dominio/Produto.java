package dominio;

import java.util.Date;

public class Produto {

    private static Long idSimulado = 1L;

    private Long id;

    private String nome;

    private Date dataCadastro;

    public Produto(String nome) {
        this.nome = nome;
        this.id = idSimulado++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDataCadastro(Date dataCadastro){
        this.dataCadastro = dataCadastro;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public Long getId() {
        return id;
    }
}
