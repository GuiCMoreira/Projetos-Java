package br.fatec.projeto1.modelo;

public class pessoa {
  private String nome;
  private String cpf;
  private String nascimento;

  public pessoa() {
    nome = "";
    cpf = "";
    nascimento = "2001";
  }

  public pessoa(String nome, String cpf) {
    this();
    this.nome = nome;
    this.cpf = cpf;
  }

}
