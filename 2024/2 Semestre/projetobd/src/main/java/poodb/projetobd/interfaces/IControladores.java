package poodb.projetobd.interfaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public interface IControladores <T,K> {

    
    public ModelAndView novo();

    
    public ModelAndView novo(T obj);

    
    public ModelAndView listar ();

    
    public ModelAndView editar(K chave);

    
    public ModelAndView editar(T obj,K chave);


    public ModelAndView excluir(K chave);


    public ModelAndView excluir (T obj, K chave);
}
