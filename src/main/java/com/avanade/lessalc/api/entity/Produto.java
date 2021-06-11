package com.avanade.lessalc.api.entity;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="PRODUTOS")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CODIGO")
    private Integer codigo;

    @Column(name="DESCRICAO ")
    private String descricao;

    @Column(name="DATA_VALIDADE")
    private LocalDate validade;

    @Column(name="EAN")
    private String ean;

    @Column(name="IND_INATIVO")
    private boolean inativo;

    public Produto(){}

    public Produto(Integer codigo, String descricao, LocalDate validade, String ean, Boolean inativo){
        super();
        this.codigo = codigo;
        this.descricao = descricao;
        this.validade = validade;
        this.ean = ean;
        this.inativo = inativo;
    }


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public boolean isInativo() {
        return inativo;
    }

    public void setInativo(boolean inativo) {
        this.inativo = inativo;
    }
}
