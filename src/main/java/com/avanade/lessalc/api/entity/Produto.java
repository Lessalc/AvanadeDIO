package com.avanade.lessalc.api.entity;


//import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

//@Entity
@Data
@AllArgsConstructor
public class Produto {

    private Integer codigo;

    private String descricao;

    private Date validade;

    private String ean;

    private boolean inativo;
}
