package com.avanade.lessalc.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;


@Entity
@IdClass(EstoqueId.class)
public class Estoque {

    @Id
    @ManyToOne
    @JoinColumn(name="CODIGO_PRODUTO", nullable = false)
    private Produto codigoProduto;

    @Id
    @ManyToOne
    @JoinColumn(name="CODIGO_FILIAL", nullable = false)
    private Loja codigoFilial;

    private Integer quantidade;

    public Estoque(){}

    public Estoque(Produto codigoProduto, Loja codigoFilial, Integer quantidade){
        super();
        this.codigoProduto = codigoProduto;
        this.codigoFilial = codigoFilial;
        this.quantidade = quantidade;
    }

    public Produto getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Produto codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Loja getCodigoFilial() {
        return codigoFilial;
    }

    public void setCodigoFilial(Loja codigoFilial) {
        this.codigoFilial = codigoFilial;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
