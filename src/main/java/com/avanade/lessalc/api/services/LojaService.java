package com.avanade.lessalc.api.services;


import com.avanade.lessalc.api.entity.Loja;
import com.avanade.lessalc.api.repository.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LojaService {

    @Autowired
    private LojaRepository lojaRepository;

    public List<Loja> findAll(){
        return lojaRepository.findAll();
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


    private List<Loja> geraLista(){
        List<Loja> listaLoja = new ArrayList<Loja>();
        Loja l1 = geraItem(1);
        Loja l2 = geraItem(2);
        listaLoja.add(l1);
        listaLoja.add(l2);
        return listaLoja;
    }

    public Loja geraItem(int id){
        return new Loja(id, "nome" + id , false);
    }

}
