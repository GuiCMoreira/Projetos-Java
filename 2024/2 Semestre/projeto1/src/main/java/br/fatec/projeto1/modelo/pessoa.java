package br.fatec.projeto1.modelo;

public class Pessoa {
  private String nome;
  private String cpf;
  private int nascimento;

  public Pessoa() {
    nome = "";
    cpf = "";
    nascimento = 2000;
  }

  public Pessoa(String nome, String cpf) {
    this();
    this.nome = nome;
    this.cpf = cpf;
  }

  public Pessoa(String nome, String cpf, int nascimento) {
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
    int anoAtual = 2024;
    if (nascimento > anoAtual) {
      throw new Exception("Ano no futuro");
    }
    if (nascimento < 0) {
      throw new Exception("Ano negativo");
    } else {
      this.nascimento = nascimento;
    }

  }

  @Override
  public String toString() {
    return "pessoa [cpf=" + cpf + ", nascimento=" + nascimento + ", nome=" + nome + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Pessoa other = (Pessoa) obj;
    if (cpf == null) {
      if (other.cpf != null)
        return false;
    } else if (!cpf.equals(other.cpf))
      return false;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    return true;
  }

}
