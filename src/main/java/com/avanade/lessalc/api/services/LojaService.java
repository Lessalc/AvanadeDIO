package com.avanade.lessalc.api.services;


import com.avanade.lessalc.api.entity.Loja;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LojaService {

    public List<Loja> findAll(){
        List<Loja> listLoja = new ArrayList<>();
        Loja loja1 = new Loja(1L, "Loj_001", false);
        Loja loja2 = new Loja(2L, "Loj_002", true);
        Loja loja3 = new Loja(3L, "Loj_003", false);
        listLoja.add(loja1);
        listLoja.add(loja2);
        listLoja.add(loja3);
        return listLoja;
    }

    public void insert(Loja loja) {
        System.out.println("Loja Inserida: "+loja);
    }

    public void update(Loja loja) {
        System.out.println("Loja Atualizada: "+loja);
    }


    public void delete(Long id) {
        System.out.println("Loja deletada: ID: "+id);
    }
}
