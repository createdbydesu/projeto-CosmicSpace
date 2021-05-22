package br.com.projetothymeleaf.loja.to;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class ProdutoTO{

    private Long id;

    @NotNull
    private String nome;

    private Date dataCriacao;

    @NotEmpty
    private String valor;

    /* Get e Set */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
