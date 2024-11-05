package poodb.projetobd.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import poodb.projetobd.interfaces.IServicos;
import poodb.projetobd.modelos.Professor;
import poodb.projetobd.repositorio.IProfessoresRepositorio;


public class ProfessoresServicos implements IServicos<Professor,String>{

    private IProfessoresRepositorio rp;

    ProfessoresServicos(IProfessoresRepositorio rp){
        this.rp = rp;
    }

    @Override
    public Professor novo(Professor prof) {
        return rp.save(prof);
    }

    @Override
    public Optional<Professor> busca(String chave) {
        return rp.findById(chave);
    }

    @Override
    public List<Professor> buscaPorNome(String nome) {
        return rp.findByNome(nome);
    }

    @Override
    public List<Professor> todos() {
        return rp.findAll();
    }

    @Override
    public Professor atualizar(Professor prof) {
        return rp.saveAndFlush(prof);
    }

    @Override
    public void excluir(Professor prof) {
       rp.delete(prof);
    }

    @Override
    public void excluirRa(String chave) {
        rp.deleteById(chave);
    }
}
