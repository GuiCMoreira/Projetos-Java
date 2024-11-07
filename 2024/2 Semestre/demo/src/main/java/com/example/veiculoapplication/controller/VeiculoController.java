package com.example.veiculoapplication.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class VeiculoController {

  @GetMapping("/")

  public String index() {

    return "index"; // Carrega o template "index.html"

  }

}
