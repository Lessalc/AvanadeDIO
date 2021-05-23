package com.avanade.lessalc.api.services;

import com.avanade.lessalc.api.entity.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProdutoService {

    public List<Produto> findAll(){
        List<Produto> listaProduto = new ArrayList<>();
        Produto p1 = new Produto(1L, "Descricao 01", new Date(), "123456789", true);
        Produto p2 = new Produto(2L, "Descricao 02", new Date(), "987654321", true);
        listaProduto.add(p1);
        listaProduto.add(p2);
        return listaProduto;
    }

    public void inserir(Produto produto) {
        System.out.println("INSERIDO: "+produto);
    }

    public void alterar(Produto produto) {
        System.out.println("Alterado: "+produto);
    }

    public void excluir(Long id) {
        System.out.println("Excluido: "+id);
    }
}
