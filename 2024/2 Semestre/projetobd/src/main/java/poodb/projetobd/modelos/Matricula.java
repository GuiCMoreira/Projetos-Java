package poodb.projetobd.modelos;

import java.util.Calendar;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tblMatricula")
@Setter
@Getter
public class Matricula {

    
    

    public Matricula() {
        Calendar cal = Calendar.getInstance();
        situacao = Situacao.CURSANDO;
        ano = cal.get(Calendar.YEAR);
        semestre = (cal.get(Calendar.MONDAY) % 7) + 1;
        data = cal.getTime();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mat_id")
    private long id;

    @ManyToOne
    // usar o nome do atributo da tabela definido na classe
    @JoinColumn(name = "AluRa") 
    private Aluno aluno;

    @ManyToOne
    // usar o nome do atributo da tabela definido na classe
    @JoinColumn(name="dis_codigo") 
    private Disciplina disciplina;

    @Column(nullable = false,name="mat_ano")
    private int ano;

    @Column(nullable = false,name="mat_semestre")
    private int semestre;

    @Column(name="mat_notafinal",columnDefinition = "decimal(5,2)")
    private float notaFinal;

    @Column(nullable = true,name="mat_situacao")
    private Situacao situacao;

    @Column(name="mat_totalfaltas")
    private int totalFaltas;

    @Column(name="mat_dt_efetivada")
    private Date data;
}
