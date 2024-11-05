package poodb.projetobd.repositorio;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import poodb.projetobd.modelos.Matricula;

public interface IMatriculasRepositorio extends JpaRepository<Matricula,Long> {

    List<Matricula> findByAlunoNome(String nome);

  

}
