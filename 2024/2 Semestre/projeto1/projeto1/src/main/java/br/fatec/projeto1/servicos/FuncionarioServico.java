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
    return new Funcionario();
  }

  public Funcionario localiza(String chave) {
    return repfunc.busca(chave);
  }

  public Funcionario inserir(Funcionario func) {
    repfunc.adiciona(func);
    return localiza(func.getCpf());
  }

  public Funcionario alterar(String chave, Funcionario func) {
    if (repfunc.altera(chave, func) == true) {
      return func;
    }
    return null;
  }

  public boolean excluir(String chave) {
    return repfunc.remover(chave);
  }
}
