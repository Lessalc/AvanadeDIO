package com.avanade.lessalc.api.repository;

import com.avanade.lessalc.api.entity.Loja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LojaRepository extends JpaRepository<Loja, Integer> {

    public Loja findByCodigo(Integer codigo);

}
