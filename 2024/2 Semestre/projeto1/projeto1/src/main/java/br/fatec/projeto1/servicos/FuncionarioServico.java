package br.fatec.projeto1.servicos;

import org.springframework.stereotype.Service;

import br.fatec.projeto1.modelos.Funcionario;
import br.fatec.projeto1.repositorios.FuncionarioRepositorio;
import java.util.List;

@Service
public class FuncionarioServico {
  private FuncionarioRepositorio repfunc;

  public FuncionarioServico(FuncionarioRepositorio repfunc) {
    if (repfunc == null) {
      this.repfunc = repfunc;
    }
  }

  public List<Funcionario> listar() {
    return repfunc.todos();
  }

  public Funcionario novo() {
    return null;
  }

  public Funcionario localiza(String chave) {
    return null;
  }

  public Funcionario inserir(Funcionario func) {
    return null;
  }

  public Funcionario alterar(String chave, Funcionario func) {
    return null;
  }

  public boolean excluir(String chave) {
    return false;
  }
}
