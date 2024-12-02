package fatec183.projetobase.interfaces;

import org.springframework.web.servlet.ModelAndView;

public interface IController <T,K>{
    public ModelAndView listarTodos();

    public ModelAndView inserir(T objeto);

    public ModelAndView inserir();

    public ModelAndView editar(K chave);

    public ModelAndView editar( T objeto, K chave);

    public ModelAndView excluir(K chave);

    public ModelAndView excluir( T objeto, K chave);


}
