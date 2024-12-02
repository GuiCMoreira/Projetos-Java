package fatec183.projetobase.model;

import jakarta.persistence.*;

@Entity
@Table(name = "GUI_contato")
public class Contato {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long numero;

  @Column(nullable = false, length = 30)
  private String tipo;

  @Column(nullable = false, length = 50)
  private String conteudo;

  @ManyToOne
  @JoinColumn(name = "cliente_id", nullable = false)
  private Cliente cliente;

  // Getters e Setters
  public Long getNumero() {
    return numero;
  }

  public void setNumero(Long numero) {
    this.numero = numero;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getConteudo() {
    return conteudo;
  }

  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }
}
