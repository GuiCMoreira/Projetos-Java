package br.fatec.projeto1.repositorios;

import org.springframework.stereotype.Repository;

import br.fatec.projeto1.modelo.Funcionario;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FuncionarioRepositorio {
  private List<Funcionario> meusFuncionarios;

  public FuncionarioRepositorio() {
    meusFuncionarios = new ArrayList<>();
  }

  public void adiciona(Funcionario objeto) {
    meusFuncionarios.add(objeto);
  }

  public List<Funcionario> todos() {
    return meusFuncionarios;
  }

  public Funcionario busca(String cpf) {
    for (Funcionario funcionario : meusFuncionarios) {
      if (funcionario.getCpf().equals(cpf)) {
        return funcionario;
      }
    }
    return null;
  }

  public boolean altera(String cpf, Funcionario objeto) {
    Funcionario localizado = busca(cpf);
    if (localizado != null) {
      remover(localizado.getCpf());
      adiciona(objeto);
      return true;
    }
    return false;
  }

  public boolean remover(String cpf) {
    Funcionario localizado = busca(cpf);
    if (localizado != null) {
      meusFuncionarios.remove(localizado);
      return true;
    }
    return false;
  }
}
