package projeto.sql.projetosql.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.sql.projetosql.models.Aluno;

public interface IAlunosRepositorio extends JpaRepository<Aluno, String> {

}
