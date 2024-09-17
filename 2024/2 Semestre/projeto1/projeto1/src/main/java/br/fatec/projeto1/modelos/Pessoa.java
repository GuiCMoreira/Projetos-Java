package br.fatec.projeto1.modelos;

import java.util.Calendar;

public class Pessoa {
    private String nome;
    private int anoNascimento;
    private String cpf;

    public Pessoa() {
        nome = "";
        anoNascimento = 1970;
        cpf = "";
    }

    public Pessoa(String nome, String cpf) {
        this();
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(String nome, int anoNascimento, String cpf) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento)
            throws Exception {
        Calendar hoje = Calendar.getInstance();
        var ano = hoje.get(Calendar.YEAR);
        if (anoNascimento < 0) {
            throw new Exception("erro: ano negativo");
        }
        if (anoNascimento <= ano) {
            this.anoNascimento = anoNascimento;
        } else {
            throw new Exception("erro: ano maior que " + ano);
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", anoNascimento=" + anoNascimento + ", cpf=" + cpf + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + anoNascimento;
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (anoNascimento != other.anoNascimento)
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }

}
