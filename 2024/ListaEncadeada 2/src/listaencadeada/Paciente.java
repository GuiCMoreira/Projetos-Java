/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaencadeada;

import java.util.Objects;

/**
 *
 * @author Luciano Pelissoli
 */
public class Paciente {
    private String nome;
    private int idade;

    public Paciente() {
        nome = "";
        this.setIdade(0);
    }

    public Paciente(String nome) {
        this();
        this.nome = nome;
    }

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0){
           this.idade = idade;
        }
        else{
            this.idade = 0;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + this.idade;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paciente other = (Paciente) obj;
        if (this.idade != other.idade) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }

    @Override
    public String toString() {
        return "Paciente{" + "nome=" + nome + ", idade=" + idade + '}';
    }
    
    
    
    
    
}
