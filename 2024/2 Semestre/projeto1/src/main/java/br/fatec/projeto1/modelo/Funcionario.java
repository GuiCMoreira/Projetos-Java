package br.fatec.projeto1.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Funcionario extends Pessoa {
  private String ctps;
  private double salarioMes;

  public Funcionario() {
    super();
    ctps = "";
    salarioMes = 0;
  }

  public Funcionario(String nome, int nascimento, String cpf, double salarioMes) {
    super(nome, cpf, nascimento);
    this.salarioMes = salarioMes;
  }
}
