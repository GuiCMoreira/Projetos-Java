package listaencadeada;

public class Paciente {
  private String nome;
  private int idade;

  public Paciente() {
    nome = "";
    setIdade(0);
  }

  public Paciente(String nome, int idade) {
    this.nome = nome;
    setIdade(idade);
  }

  public Paciente(String nome) {
    this();
    this.nome = nome;
  }

  // construtor de igualdade
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + idade;
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
    Paciente other = (Paciente) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (idade != other.idade)
      return false;
    return true;
  }

  // getters e setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

}
