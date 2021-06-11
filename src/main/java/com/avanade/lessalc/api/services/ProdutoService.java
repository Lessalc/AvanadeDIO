package com.avanade.lessalc.api.services;

import com.avanade.lessalc.api.entity.Produto;
import com.avanade.lessalc.api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findAll(){
        return produtoRepository.findAll();
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

    private List<Produto> geraLista(){
        List<Produto> listaProduto = new ArrayList<Produto>();
        Produto p1 = geraItem(1, "123456789");
        Produto p2 = geraItem(2, "987654321");
        listaProduto.add(p1);
        listaProduto.add(p2);
        return listaProduto;
    }

    public Produto geraItem(int id, String ean){
        return new Produto(id, "Descricao "+id, LocalDate.now(), ean, false);

    }



}
