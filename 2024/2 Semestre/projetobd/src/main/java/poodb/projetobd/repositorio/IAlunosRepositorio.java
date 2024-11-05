package poodb.projetobd.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import poodb.projetobd.modelos.Aluno;
@Repository
public interface IAlunosRepositorio extends JpaRepository< Aluno,String > {

    List<Aluno> findByNome(String nome);

}
