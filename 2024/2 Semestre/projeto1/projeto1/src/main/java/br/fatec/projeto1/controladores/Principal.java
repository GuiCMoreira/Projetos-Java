package br.fatec.projeto1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.fatec.projeto1.modelos.Pessoa;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Principal {
    @GetMapping("/p2")
    public ModelAndView teste() {
        Pessoa p = new Pessoa();
        ModelAndView mv = new ModelAndView("pagina2.html");
        mv.addObject("pessoa", p);
        return mv;
    }

    @GetMapping("/p3")
    public ModelAndView testeObjeto() throws Exception {

        Pessoa p = new Pessoa("João", "123.456.789-10");
        try {
            p.setAnoNascimento(2025);
        } catch (Exception e) {
            p.setAnoNascimento(0);
        }
        ModelAndView mv = new ModelAndView("pagina2.html");
        mv.addObject("pessoa", p);
        return mv;
    }

    @GetMapping("/salvar")
    public ModelAndView novaPessoa() {
        ModelAndView mv = new ModelAndView("pagina3.html");
        Pessoa p = new Pessoa();
        mv.addObject("pessoa", p);
        return mv;
    }

    @PostMapping("/salvar")
    public ModelAndView novaPessoa(Pessoa pessoa) {
        ModelAndView mv = new ModelAndView("pagina2.html");
        mv.addObject("pessoa", pessoa);
        return mv;
    }

}
