package com.avanade.lessalc.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

//import javax.persistence.Entity;
//
//@Entity
@Data
@AllArgsConstructor
public class Loja {

    private Long codigo;

    private String nome;

    private boolean inativo;
}
