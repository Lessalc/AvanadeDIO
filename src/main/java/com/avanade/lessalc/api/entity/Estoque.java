package com.avanade.lessalc.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

//import javax.persistence.Entity;
//
//
//@Entity
@Data
@AllArgsConstructor
public class Estoque {

    private Produto produto;

    private Loja loja;

    private Long quantidade;
}
