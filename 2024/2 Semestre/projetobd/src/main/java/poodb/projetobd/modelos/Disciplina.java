package poodb.projetobd.modelos;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tblDisciplina")
@Getter
@Setter
public class Disciplina {

    @Id
    @Column(name="dis_codigo",nullable = false,length = 10)
    private String codigo;

    @Column(name="dis_nome",nullable = false,length = 30)
    private String nome;

    @Column(name="dis_cargahora")
    private int cargaHora;

    @ManyToOne
    // usar o nome do atributo da tabela definido na classe
    @JoinColumn(name = "pro_registro")
    private Professor professor;

    //usar o nome do atributo da classe para o mapeamento
    @OneToMany(mappedBy = "id")
    private Set<Matricula> matriculados = new HashSet<>();

}
