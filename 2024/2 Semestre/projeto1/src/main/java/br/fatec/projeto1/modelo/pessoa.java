package br.fatec.projeto1.modelo;

import java.time.LocalDateTime;

public class pessoa {
  private String nome;
  private String cpf;
  private int nascimento;

  public pessoa() {
    nome = "";
    cpf = "";
    nascimento = 2001;
  }

  public pessoa(String nome, String cpf) {
    this();
    this.nome = nome;
    this.cpf = cpf;
  }

  public pessoa(String nome, String cpf, int nascimento) {
    this.nome = nome;
    this.cpf = cpf;
    this.nascimento = nascimento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public int getNascimento() {
    return nascimento;
  }

  public void setNascimento(int nascimento) throws Exception {
    int anoAtual = LocalDateTime.now().getYear();
    if (nascimento > anoAtual) {
      throw new Exception("Ano no futuro");
    }
    if (nascimento < 0) {
      throw new Exception("Ano negativo");
    } else {
      this.nascimento = nascimento;
    }

  }

}
