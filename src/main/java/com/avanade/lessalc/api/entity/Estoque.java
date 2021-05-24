package com.avanade.lessalc.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;


@Entity
@IdClass(EstoqueId.class)
@Data
@AllArgsConstructor
public class Estoque {

    @Id
    @ManyToOne
    @JoinColumn(name="Codigo_Produto", nullable = false)
    private Produto codigoProduto;

    @Id
    @ManyToOne
    @JoinColumn(name="Codigo_Loja", nullable = false)
    private Loja codigoFilial;

    private Integer quantidade;
}
