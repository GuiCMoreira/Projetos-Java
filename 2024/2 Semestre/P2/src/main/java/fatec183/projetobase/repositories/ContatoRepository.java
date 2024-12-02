package fatec183.projetobase.repositories;

import fatec183.projetobase.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
