package com.avanade.lessalc.api.controllers;

import com.avanade.lessalc.api.entity.Loja;
import com.avanade.lessalc.api.services.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/lojas")
public class LojaController {

    @Autowired
    private LojaService lojaService;

    @GetMapping
    public List<Loja> listar(){
        return lojaService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void inserir(@RequestBody Loja loja){
        lojaService.insert(loja);
    };

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void alterar(@RequestBody Loja loja){
        lojaService.update(loja);
    };

    @DeleteMapping
    @RequestMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void excluir(@PathVariable Long id){
        lojaService.delete(id);
    };


}
