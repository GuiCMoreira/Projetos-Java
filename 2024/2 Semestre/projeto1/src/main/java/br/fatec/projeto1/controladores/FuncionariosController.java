package br.fatec.projeto1.controladores;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.fatec.projeto1.interfaces.IControladores;
import br.fatec.projeto1.modelo.Funcionario;

@Controller
@RequestMapping("/funcionarios")
public class FuncionariosController implements IControladores<Funcionario, String> {

  @GetMapping("/todos")
  @Override
  public ModelAndView listar() {
    List<Funcionario> meusFuncionarios = new ArrayList<>();
    ModelAndView mv = new ModelAndView("funcionarios/todos.html");
    mv.addObject("funcionarios", meusFuncionarios);
    return mv;
  }

  @Override
  public ModelAndView novo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'novo'");
  }

  @Override
  public ModelAndView novo(Funcionario objeto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'novo'");
  }

  @Override
  public ModelAndView editar(String id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'editar'");
  }

  @Override
  public ModelAndView editar(String id, Funcionario objeto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'editar'");
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

  @Override
  public ModelAndView detalhar(String id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'detalhar'");
  }

}
