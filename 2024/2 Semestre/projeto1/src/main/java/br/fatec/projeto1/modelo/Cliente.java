package br.fatec.projeto1.modelo;

import java.util.Currency;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cliente extends Pessoa{
    private double credito;
    private Endereco correspondencia;
    
    public Cliente() throws Exception {
        super();
        setNascimento(1980);
        correspondencia = new Endereco();
    }

    public Cliente(String nome, int anoNascimento, String cpf, double credito) {
        //super(nome, anoNascimento, cpf);        
        this.credito = credito;
        correspondencia = new Endereco();

    }

    

    
    
}
