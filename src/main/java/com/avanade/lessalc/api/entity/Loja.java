package com.avanade.lessalc.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="Loja")
@Data
@AllArgsConstructor
public class Loja {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;

    private String nome;

    private boolean inativo;
}
