package com.avanade.lessalc.api.services;

import com.avanade.lessalc.api.entity.Estoque;
import com.avanade.lessalc.api.entity.Loja;
import com.avanade.lessalc.api.entity.Produto;
import com.avanade.lessalc.api.repository.EstoqueRepository;
import com.avanade.lessalc.api.repository.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EstoqueService {

    @Autowired
    private LojaService lojaService;

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private EstoqueRepository estoqueRepository;



    public List<Estoque> findAll() {
        List<Estoque> listaEstoque = new ArrayList<Estoque>();
        // Primeiro item do Estoque
        Loja loja = lojaService.geraItem(1);
        Produto produto = produtoService.geraItem(1, "123456789");
        Estoque e1 = new Estoque(produto, loja, 10);
        // Segundo item do Estoque
        loja = lojaService.geraItem(1);
        produto = produtoService.geraItem(2, "987654321");
        Estoque e2 = new Estoque(produto, loja, 20);

        listaEstoque.add(e1);
        listaEstoque.add(e2);

        return listaEstoque;
    }
}
