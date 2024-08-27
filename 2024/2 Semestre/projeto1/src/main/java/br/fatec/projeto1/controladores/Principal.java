package br.fatec.projeto1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.fatec.projeto1.modelo.Pessoa;

@Controller
public class Principal {

  @GetMapping("/index")
  public ModelAndView index() {
    ModelAndView mv = new ModelAndView("index.html");
    return mv;
  }

  @GetMapping("Pessoa")
  public ModelAndView pessoa() throws Exception {
    Pessoa p = new Pessoa("João", "123.456.789-00");
    try {
      p.setNascimento(2001);
    } catch (Exception e) {
      p.setNascimento(0);
    }
    ModelAndView mv = new ModelAndView("pessoa.html");
    mv.addObject("pessoa", p);
    return mv;
  }

  @GetMapping("/save")
  public ModelAndView newPessoa() {
    ModelAndView mv = new ModelAndView("form.html");
    Pessoa pessoa = new Pessoa();
    mv.addObject("pessoa", pessoa);
    return mv;
  }

  @PostMapping("/save")
  public ModelAndView newPessoa(Pessoa pessoa) {
    ModelAndView mv = new ModelAndView("pessoa.html");
    mv.addObject("pessoa", pessoa);
    return mv;
  }

}
