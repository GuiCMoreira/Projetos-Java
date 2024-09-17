package br.fatec.projeto1.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.fatec.projeto1.interfaces.IControladores;
import br.fatec.projeto1.modelos.Funcionario;
import br.fatec.projeto1.repositorios.FuncionarioRepositorio;
import br.fatec.projeto1.servicos.FuncionarioServico;

@Controller
@RequestMapping("/funcionarios")
public class FuncionariosController
        implements IControladores<Funcionario, String> {

    private FuncionarioServico funcserv;

    public FuncionariosController(FuncionarioServico funcserv) {
        this.funcserv = funcserv;
    }

    @GetMapping("/todos")
    @Override
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("funcionarios/todos.html");
        mv.addObject("funcionarios", funcserv.listar());
        return mv;
    }

    @GetMapping("/novo")
    @Override
    public ModelAndView novo() {
        ModelAndView mv = new ModelAndView("funcionarios/criar.html");
        mv.addObject("funcionario", funcserv.novo());
        return mv;
    }

    @PostMapping("/novo")
    @Override
    public ModelAndView novo(Funcionario objeto) {
        objeto = funcserv.inserir(objeto);
        return new ModelAndView("redirect:todos");
    }

    // localhost:8080/funcionarios/editar/8888
    @GetMapping("/editar/{cpf}")
    @Override
    public ModelAndView editar(@PathVariable("cpf") String id) {
        ModelAndView mv = new ModelAndView("funcionarios/editar.html");
        if (id == null) {
            mv = new ModelAndView("/404.html");
            return mv;
        }
        Funcionario funcionario = funcserv.localiza(id);
        if (funcionario == null) {
            mv = new ModelAndView("/404.html");
            mv.setStatus(HttpStatus.NOT_FOUND);
        } else {
            mv.addObject("funcionario", funcionario);
        }
        return mv;
    }

    @PostMapping("/editar/{id}")
    @Override
    public ModelAndView editar(String id, Funcionario objeto) {
        ModelAndView mv = new ModelAndView("redirect:../todos");
        if (funcserv.alterar(id, objeto) == null) {
            mv = new ModelAndView("/404.html");
        }
        return mv;
    }

    @GetMapping("/excluir/{cpf}")
    @Override
    public ModelAndView excluir(@PathVariable("cpf") String id) {
        ModelAndView mv = new ModelAndView("funcionarios/excluir.html");
        if (id.isBlank()) {
            mv = new ModelAndView("/404.html");
            return mv;
        }

        Funcionario funcionario = funcserv.localiza(id);

        if (funcionario == null) {
            mv = new ModelAndView("/404.html");
            mv.setStatus(HttpStatus.NOT_FOUND);
        } else {
            mv.addObject("funcionario", funcionario);
        }
        return mv;
    }

    @PostMapping("/excluir/{id}")
    @Override
    public ModelAndView excluir(String id, Funcionario objeto) {
        ModelAndView mv = new ModelAndView("redirect:../todos");
        if (funcserv.excluir(id) == false) {
            mv = new ModelAndView("/404.html");
        }
        return mv;
    }

    @GetMapping("/detalhar/{id}")
    @Override
    public ModelAndView detalhar(@PathVariable("id") String id) {
        ModelAndView mv = new ModelAndView("funcionarios/detalhar.html");
        if (id.isBlank()) {
            mv = new ModelAndView("/404.html");
            return mv;
        }

        Funcionario funcionario = funcserv.localiza(id);
        if (funcionario != null) {
            mv.addObject("funcionario", funcionario);
        } else {
            mv = new ModelAndView("/404.html");
            mv.setStatus(HttpStatus.NOT_FOUND);
        }
        return mv;
    }

}
