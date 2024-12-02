package fatec183.projetobase.controllers;

import fatec183.projetobase.model.Contato;
import fatec183.projetobase.servicos.ContatoService;
import fatec183.projetobase.servicos.ClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contatos")
public class ContatoController {

  private final ContatoService contatoService;
  private final ClienteService clienteService;

  public ContatoController(ContatoService contatoService, ClienteService clienteService) {
    this.contatoService = contatoService;
    this.clienteService = clienteService;
  }

  @GetMapping
  public String listarContatos(Model model) {
    model.addAttribute("contatos", contatoService.listarTodos());
    return "contatos/lista";
  }

  @GetMapping("/novo")
  public String novoContato(Model model) {
    model.addAttribute("contato", new Contato());
    model.addAttribute("clientes", clienteService.listarTodos());
    return "contatos/formulario";
  }

  @PostMapping
  public String salvarContato(@ModelAttribute Contato contato) {
    contatoService.salvar(contato);
    return "redirect:/contatos";
  }
}
