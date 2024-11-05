package poodb.projetobd.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import poodb.projetobd.interfaces.IControladores;
import poodb.projetobd.modelos.Menu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@Controller


public class PrincipalController {
    @GetMapping("/")    
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index.html");
        mv.addObject("Menu",Menu.values());
        return mv;
    }
    

}
