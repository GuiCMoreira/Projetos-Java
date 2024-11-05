package poodb.projetobd.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import poodb.projetobd.interfaces.IServicos;
import poodb.projetobd.modelos.Aluno;
import poodb.projetobd.repositorio.IAlunosRepositorio;

@Service
public class AlunosServicos implements IServicos<Aluno,String> {

    private IAlunosRepositorio ar;
    private MatriculasServicos ms;

    public AlunosServicos(IAlunosRepositorio ar, MatriculasServicos ms) {
        this.ar = ar;
        this.ms= ms;
    }

    @Override
    public Aluno novo(Aluno al){
        
          return ar.save(al);
     
    }

    @Override
    public Optional<Aluno> busca(String chave){
        Optional<Aluno> al = ar.findById(chave);
      
        return al;
    }

    @Override
    public List<Aluno> buscaPorNome(String nome){
        return ar.findByNome(nome);
    }

    @Override
    public List<Aluno> todos(){
        return ar.findAll();
    }

    @Override
    public Aluno atualizar(Aluno al){
        return ar.save(al);
    }

    @Override
    public void excluir(Aluno al){
        ar.delete(al);
    }
    @Override
    public void excluirRa(String chave){
        ar.deleteById(chave);
    }
    

}
