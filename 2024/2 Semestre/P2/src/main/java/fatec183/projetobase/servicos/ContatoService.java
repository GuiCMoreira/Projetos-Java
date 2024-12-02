package fatec183.projetobase.servicos;

import fatec183.projetobase.model.Contato;
import fatec183.projetobase.repositories.ContatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

  private final ContatoRepository contatoRepository;

  public ContatoService(ContatoRepository contatoRepository) {
    this.contatoRepository = contatoRepository;
  }

  public List<Contato> listarTodos() {
    return contatoRepository.findAll();
  }

  public Contato salvar(Contato contato) {
    return contatoRepository.save(contato);
  }
}
