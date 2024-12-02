package fatec183.projetobase.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "GUI_cliente")
public class Cliente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long numero;

  @Column(nullable = false, length = 30)
  private String nome;

  @Column(nullable = false, length = 20)
  private String cpf;

  @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Contato> contatos;

  // Getters e Setters
  public Long getNumero() {
    return numero;
  }

  public void setNumero(Long numero) {
    this.numero = numero;
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

  public List<Contato> getContatos() {
    return contatos;
  }

  public void setContatos(List<Contato> contatos) {
    this.contatos = contatos;
  }

}
