package com.example.lab2_20182044.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class controlador {
    @RequestMapping(value = "/buscaminas" , method = RequestMethod.GET)
    public String paginaPrincipal(){
        return "configuracion";
    }
    @PostMapping("/jugar")
    public  String paginaJuego(){
        return "campoDeMinas";
    }
}
