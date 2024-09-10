package br.fatec.projeto1.controladores;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.fatec.projeto1.interfaces.IControladores;
import br.fatec.projeto1.modelo.Funcionario;

@Controller
@RequestMapping("/funcionarios")
public class FuncionariosController implements IControladores<Funcionario, String> {

  private List<Funcionario> meusFuncionarios;

  public FuncionariosController() {
    meusFuncionarios = new ArrayList<>();
  }

  @GetMapping("/todos")
  @Override
  public ModelAndView listar() {
    // List<Funcionario> meusFuncionarios = new ArrayList<>();
    ModelAndView mv = new ModelAndView("funcionarios/todos.html");
    mv.addObject("funcionarios", meusFuncionarios);
    return mv;
  }

  @GetMapping("/novo")
  @Override
  public ModelAndView novo() {
    ModelAndView mv = new ModelAndView("funcionarios/criar.html");
    mv.addObject("funcionario", new Funcionario());
    return mv;
  }

  @PostMapping("/novo")
  @Override
  public ModelAndView novo(Funcionario objeto) {
    meusFuncionarios.add(objeto);
    return new ModelAndView("redirect:todos");
  }

  @GetMapping("/editar/{cpf}")
  @Override
  public ModelAndView editar(@PathVariable("cpf") String id) {
    ModelAndView mv = new ModelAndView("funcionarios/editar.html");
    if (id == null) {
      mv = new ModelAndView("/404.html");
    }
    boolean achou = false;
    for (Funcionario funcionario : meusFuncionarios) {
      if (funcionario.getCpf().equals(id)) {
        mv.addObject("funcionario", funcionario);
        achou = true;
        break;
      }
    }
    if (!achou) {
      mv = new ModelAndView("/404.html");
    }
    return mv;
  }

  @PostMapping("/editar/{id}")
  @Override
  public ModelAndView editar(String id, Funcionario objeto) {
    ModelAndView mv = new ModelAndView("redirect:../todos");
    boolean achou = false;
    for (Funcionario funcionario : meusFuncionarios) {
      if (funcionario.getCpf().equals(id)) {
        meusFuncionarios.remove(funcionario);
        achou = true;
        break;
      }
    }
    if (achou) {
      meusFuncionarios.add(objeto);
    } else {
      mv = new ModelAndView("/404.html");
    }
    return mv;
  }

  @Override
  public ModelAndView excluir(String id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'excluir'");
  }

  @Override
  public ModelAndView excluir(String id, Funcionario objeto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'excluir'");
  }

  @GetMapping("/detalhar/{id}")
  @Override
  public ModelAndView detalhar(@PathVariable("id") String id) {
    ModelAndView mv = new ModelAndView("funcionarios/detalhar.html");
    if (id == null) {
      mv = new ModelAndView("/404.html");
    }
    boolean achou = false;
    for (Funcionario funcionario : meusFuncionarios) {
      if (funcionario.getCpf().equals(id)) {
        mv.addObject("funcionario", funcionario);
        achou = true;
        break;
      }
    }
    if (!achou) {
      mv = new ModelAndView("/404.html");
    }
    return mv;
  }

}
