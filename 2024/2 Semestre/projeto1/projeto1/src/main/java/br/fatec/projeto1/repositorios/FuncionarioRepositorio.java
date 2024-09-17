package br.fatec.projeto1.repositorios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.fatec.projeto1.modelos.Funcionario;

@Repository
public class FuncionarioRepositorio {
    private static List<Funcionario> meusFuncionarios;

    public FuncionarioRepositorio() {
        meusFuncionarios = new ArrayList<>();
    }

    public void adiciona(Funcionario objeto) {
        meusFuncionarios.add(objeto);
    }

    public List<Funcionario> todos() {
        return meusFuncionarios;
    }

    public Funcionario busca(String id) {
        for (Funcionario funcionario : meusFuncionarios) {
            if (funcionario.getCpf().equals(id)) {
                return funcionario;
            }
        }
        return null;
    }

    public boolean altera(String id, Funcionario objeto) {
        Funcionario localizado = busca(id);
        if (localizado != null) {
            remover(localizado.getCpf());
            adiciona(objeto);
            return true;
        }
        return false;
    }

    public boolean remover(String id) {
        Funcionario localizado = busca(id);
        if (localizado != null) {
            meusFuncionarios.remove(localizado);
            return true;
        }
        return false;
    }
}
