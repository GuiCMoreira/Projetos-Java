package poodb.projetobd.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import poodb.projetobd.interfaces.IServicos;
import poodb.projetobd.modelos.Disciplina;
import poodb.projetobd.repositorio.IDisciplinasRepositorio;


public class DisciplinasServicos implements IServicos<Disciplina,String>{
    
    private IDisciplinasRepositorio rd;

    
    public DisciplinasServicos(IDisciplinasRepositorio rd) {
        this.rd = rd;
    }

    @Override
    public Disciplina novo(Disciplina disc) {
        return rd.saveAndFlush(disc);
    }

    @Override
    public Optional<Disciplina> busca(String chave) {
       return rd.findById(chave);
    }

    @Override
    public List<Disciplina> buscaPorNome(String nome) {
        return rd.findByNome(nome);
    }

    @Override
    public List<Disciplina> todos() {
        return rd.findAll();
    }

    @Override
    public Disciplina atualizar(Disciplina disc) {
        return rd.saveAndFlush(disc);
    }

    @Override
    public void excluir(Disciplina disc) {
        rd.delete(disc);
    }

    @Override
    public void excluirRa(String chave) {
        rd.deleteById(chave);
    }

}
