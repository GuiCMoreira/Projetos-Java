package poodb.projetobd.controladores;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.websocket.server.PathParam;
import poodb.projetobd.interfaces.IControladores;
import poodb.projetobd.modelos.Aluno;
import poodb.projetobd.modelos.Menu;
import poodb.projetobd.servicos.AlunosServicos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
@RequestMapping("/alunos")
public class AlunosController implements IControladores<Aluno,String>{

    private AlunosServicos as;
    

    
    public AlunosController(AlunosServicos as) {
        this.as = as;
    }

    @GetMapping("/novo")
    @Override
    public ModelAndView novo() {
        ModelAndView mv = new ModelAndView("alunos/novo.html");
        mv.addObject("aluno", new Aluno() );
        mv.addObject("Menu",Menu.values());
        return mv;
    }

    @PostMapping("/novo")
    @Override
    public ModelAndView novo(Aluno obj) {
        
      obj = as.novo(obj);
      ModelAndView mv = new ModelAndView("redirect:/");
      return mv;
    }

    @GetMapping
    @Override
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("alunos/index.html");
        mv.addObject("alunos", as.todos());
        mv.addObject("Menu",Menu.values());
        return mv;

    }

    @GetMapping("/editar/{chave}")
    @Override
    public ModelAndView editar( @PathVariable String chave) {
        ModelAndView mv = new ModelAndView("alunos/editar.html");
        mv.addObject("aluno", as.busca(chave));
        mv.addObject("Menu",Menu.values());
        return mv;
    }

    @PostMapping("/editar")
    @Override
    public ModelAndView editar(Aluno obj, String Ra) {
        ModelAndView mv  = new ModelAndView("redirect:/alunos");
        obj = as.atualizar(obj);
        return mv;
    }

    @GetMapping("/excluir/{chave}")
    @Override
    public ModelAndView excluir(@PathVariable String chave) {
        Optional<Aluno> aluno = as.busca(chave);
        ModelAndView mv;
        if (aluno.isPresent()){
           
            mv = new ModelAndView("alunos/excluir.html");
            mv.addObject("aluno", aluno);
            mv.addObject("Menu",Menu.values());
        }
        else{
            mv = new ModelAndView("redirect:/alunos");
        }
        return mv;
    }

    
    @PostMapping("/excluir")
    @Override
    public ModelAndView excluir(Aluno obj, String chave) {
        ModelAndView mv  = new ModelAndView("redirect:/alunos");
        as.excluir(obj);
        return mv;
    }

    @GetMapping("/detalhar/{id}")
    public ModelAndView detalhes(@PathVariable String id) {
        Optional<Aluno> aluno = as.busca(id);
        ModelAndView mv;
        if (aluno.isPresent()){
           
            mv = new ModelAndView("alunos/detalhes.html");
            mv.addObject("aluno", aluno);
            mv.addObject("Menu",Menu.values());
        }
        else{
            mv = new ModelAndView("redirect:/alunos");
        }
        return mv;
    }
    


}
