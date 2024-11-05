package poodb.projetobd.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import poodb.projetobd.modelos.Professor;

public interface IProfessoresRepositorio extends JpaRepository<Professor,String> {

    List<Professor> findByNome(String nome);

}
