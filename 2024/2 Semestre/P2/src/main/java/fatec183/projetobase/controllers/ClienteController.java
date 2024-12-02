package fatec183.projetobase.controllers;

import fatec183.projetobase.model.Cliente;
import fatec183.projetobase.servicos.ClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

  private final ClienteService clienteService;

  public ClienteController(ClienteService clienteService) {
    this.clienteService = clienteService;
  }

  @GetMapping
  public String listarClientes(Model model) {
    model.addAttribute("clientes", clienteService.listarTodos());
    return "clientes/lista";
  }

  @GetMapping("/novo")
  public String novoCliente(Model model) {
    model.addAttribute("cliente", new Cliente());
    return "clientes/formulario";
  }

  @PostMapping
  public String salvarCliente(@ModelAttribute Cliente cliente) {
    clienteService.salvar(cliente);
    return "redirect:/clientes";
  }
}
