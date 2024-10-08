package projeto.sql.projetosql.servicos;

import java.util.List;
import java.util.Optional;

import projeto.sql.projetosql.models.Aluno;
import projeto.sql.projetosql.repositorio.IAlunosRepositorio;

public class AlunosServicos {

  private IAlunosRepositorio repositorio;

  public AlunosServicos(IAlunosRepositorio repositorio) {
    this.repositorio = repositorio;
  }

  public void novo(Aluno aluno) {
    repositorio.save(aluno);
  }

  public Optional<Aluno> busca(String ra) {
    return repositorio.findById(ra);
  }

  public List<Aluno> buscaPorNome(String nome) {
    return repositorio.findByNome(nome);
  }

  public List<Aluno> todos() {
    return repositorio.findAll();
  }

  public Aluno atualizar(Aluno aluno) {
    return repositorio.save(aluno);
  }

  public void excluir(Aluno aluno) {
    repositorio.delete(aluno);
  }

  public void excluirRa(String ra) {
    repositorio.deleteById(ra);
  }

}
