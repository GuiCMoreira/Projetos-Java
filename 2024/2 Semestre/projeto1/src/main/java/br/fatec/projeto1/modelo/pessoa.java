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

  public pessoa(String nome, String cpf, String nascimento) {
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

  public String getNascimento() {
    return nascimento;
  }

  public void setNascimento(String nascimento) {
    this.nascimento = nascimento;
  }

}
