package com.avanade.lessalc.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="LOJAS")
public class Loja {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CODIGO")
    private Integer codigo;

    @Column(name="NOME")
    private String nome;

    @Column(name="IND_INATIVO")
    private boolean inativo;

    @OneToMany(mappedBy ="codigoFilial")
    private List<Estoque> estoque;

    public Loja(){}

    public Loja(int id, String nome, boolean inativo) {
            super( );
            this.codigo = codigo;
            this.nome = nome;
            this.inativo = inativo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isInativo() {
        return inativo;
    }

    public void setInativo(boolean inativo) {
        this.inativo = inativo;
    }

    public List<Estoque> getEstoque() {
        return estoque;
    }

    public void setEstoque(List<Estoque> estoque) {
        this.estoque = estoque;
    }
}
