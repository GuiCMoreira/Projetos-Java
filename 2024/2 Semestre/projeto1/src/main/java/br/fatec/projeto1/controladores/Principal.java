package br.fatec.projeto1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Principal {

  @GetMapping("/p2")
  public String teste() {
    return "pagina2.html";
  }
}
