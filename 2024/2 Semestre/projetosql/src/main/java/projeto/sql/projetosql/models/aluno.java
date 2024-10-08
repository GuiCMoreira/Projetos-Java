package projeto.sql.projetosql.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tblAlunos")

public class Aluno {

  @Id
  @Column(name = "AluRa", length = 16, nullable = false)
  String ra;

  @Column(name = "AluNome", length = 100, nullable = false)
  String nome;

  @Column(name = "AluCpf", length = 14, unique = true, nullable = false)
  String cpf;

  @Column(name = "AluPeso", precision = 10, scale = 2)
  BigDecimal peso;

  @Column(name = "AluAltura", precision = 5, scale = 2)
  BigDecimal altura;

}
