package com.avanade.lessalc.api.repository;

import com.avanade.lessalc.api.entity.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Integer> {

    public Estoque findByCodigoFilial(Integer codigoFilial);
    public Estoque findByCodigoProduto(Integer codigoProduto);
}
