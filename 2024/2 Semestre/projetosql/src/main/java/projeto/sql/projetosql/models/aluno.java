package projeto.sql.projetosql.models;

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

public class aluno {

  @Id
  @Column(name = "AluRa", length = 16, nullable = false)
  String ra;

  @Column(name = "AluNome")
  String nome;

}
