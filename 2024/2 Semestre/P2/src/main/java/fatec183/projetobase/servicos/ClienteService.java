package fatec183.projetobase.servicos;

import fatec183.projetobase.model.Cliente;
import fatec183.projetobase.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

  private final ClienteRepository clienteRepository;

  public ClienteService(ClienteRepository clienteRepository) {
    this.clienteRepository = clienteRepository;
  }

  public List<Cliente> listarTodos() {
    return clienteRepository.findAll();
  }

  public Cliente salvar(Cliente cliente) {
    return clienteRepository.save(cliente);
  }
}
