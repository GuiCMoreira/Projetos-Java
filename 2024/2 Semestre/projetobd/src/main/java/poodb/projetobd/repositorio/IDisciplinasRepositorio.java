package poodb.projetobd.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import poodb.projetobd.modelos.Disciplina;
@Repository
public interface IDisciplinasRepositorio extends JpaRepository<Disciplina,String>{

    List<Disciplina> findByNome(String nome);

}
