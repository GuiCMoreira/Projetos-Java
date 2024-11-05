package poodb.projetobd.servicos;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import poodb.projetobd.interfaces.IServicos;
import poodb.projetobd.modelos.Matricula;
import poodb.projetobd.repositorio.IMatriculasRepositorio;

@Service
public class MatriculasServicos implements IServicos<Matricula,Long>{

    private IMatriculasRepositorio rm;

    

    public MatriculasServicos(IMatriculasRepositorio rm) {
        this.rm = rm;
    }

    @Override
    public Matricula novo(Matricula mat) {
        return rm.saveAndFlush(mat);
    }

    @Override
    public Optional<Matricula> busca(Long chave) {
        return rm.findById(chave);
    }

    @Override
    public List<Matricula> buscaPorNome(String nome) {
        return rm.findByAlunoNome(nome);
    }

    @Override
    public List<Matricula> todos() {
        return rm.findAll();
    }

    @Override
    public Matricula atualizar(Matricula mat) {
        return rm.saveAndFlush(mat);
    }

    @Override
    public void excluir(Matricula mat) {
        rm.delete(mat);
    }

    @Override
    public void excluirRa(Long chave) {
        rm.deleteById(chave);
    }

    

}
