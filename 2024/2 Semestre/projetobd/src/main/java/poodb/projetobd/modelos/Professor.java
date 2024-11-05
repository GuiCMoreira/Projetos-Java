package poodb.projetobd.modelos;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tblProfessores")
@Getter
@Setter
public class Professor extends Pessoa {
    @Id
    @Column(name = "pro_registro",length = 5,nullable = false)
    private String registro;
    @Column(name = "pro_ctps",length = 15,nullable = false)
    private String ctps;
    @Column(name = "pro_contrato",nullable = false)
    private Date contratacao;
    @Column(name = "pro_especialidade",length = 50,nullable = false)
    private String especilidade;
    @Column(name = "pro_titulacao",length = 25,nullable = false)
    private String titulacao;

    //usar o nome do atributo da classe para o mapeamento
    @OneToMany(mappedBy = "codigo",cascade = CascadeType.ALL)
    private Set<Disciplina> disciplinas = new HashSet<>();
}
