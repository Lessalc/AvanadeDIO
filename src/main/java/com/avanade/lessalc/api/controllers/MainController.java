package com.avanade.lessalc.api.controllers;

import com.avanade.lessalc.api.entity.Loja;
import com.avanade.lessalc.api.services.EstoqueService;
import com.avanade.lessalc.api.services.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    private EstoqueService estoqueService;
    @Autowired
    private LojaService lojaService;

    @RequestMapping("/")
    public ModelAndView MainPage(){
        ModelAndView mv = new ModelAndView("index");
        Iterable<Loja> lojas = lojaService.findAll();
        mv.addObject("lojas", lojas);
        return mv;
    }




}
