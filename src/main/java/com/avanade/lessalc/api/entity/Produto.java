package com.avanade.lessalc.api.entity;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="Produtos")
@Data
@AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;

    private String descricao;

    private Date validade;

    private String ean;

    private boolean inativo;
}
