package br.fatec.projeto1.modelos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(includeFieldNames = true, callSuper = false)

public class Funcionario extends Pessoa {
    private String ctps;
    private double salarioMes;

    public Funcionario() {
        super();
        ctps = "";
        salarioMes = 0;
    }

    public Funcionario(String nome, int anoNascimento, String cpf, double salarioMes) {
        super(nome, anoNascimento, cpf);
        this.salarioMes = salarioMes;
    }

}
