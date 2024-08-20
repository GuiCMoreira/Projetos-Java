package br.fatec.projeto1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.fatec.projeto1.modelo.pessoa;

@Controller
public class Principal {

  @GetMapping("/p2")
  public String teste() {
    return "pagina2.html";
  }

  @GetMapping("p3")
  public ModelAndView testeObjeto() {
    pessoa p = new pessoa("João", "123.456.789-00");
    ModelAndView mv = new ModelAndView("pagina2.html");
    mv.addObject("pessoa", p);
    return mv;
  }

}
