package poodb.projetobd.modelos;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@MappedSuperclass
public class Pessoa {
    @Column(length = 14,unique = true , nullable = false)
    private String cpf;
    private String rg;

    private Date nascimento;
    @Column( length = 50)
    private String nome;
}
