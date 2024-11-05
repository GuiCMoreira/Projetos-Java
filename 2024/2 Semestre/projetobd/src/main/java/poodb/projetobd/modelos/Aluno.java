package poodb.projetobd.modelos;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tblAlunos")
public class Aluno  extends Pessoa{
    @Id // define o atributo como chave primária da tabela
    @Column( name="AluRa", length=16, nullable = false)
    // @GeneratedValue(strategy =  ) não tem a opção de não gerar o ID
    String ra;

    // as linhas comentadas abaixo decorrem do uso da classe Pai (Pessoa)

 //   @Column(name = "AluNome", length = 50)
 //   String nome;

 //   @Column(name = "AluCpf",length = 14,unique = true , nullable = false)
 //   String cpf;

    @Column(name="AluPeso",precision = 10,scale =2)
    BigDecimal peso;
    
    @Column(name="AluAltura")
    double altura;

    // as linhas comentadas abaixo decorrem do uso da classe Pai (Pessoa)

  //  @Column(name="AluNascimento")
  //  Date nascimento;

    //usar o nome do atributo da classe para o mapeamento
    @OneToMany(mappedBy = "id",fetch = FetchType.EAGER)
    private Set<Matricula> matriculas = new HashSet<>();

}
