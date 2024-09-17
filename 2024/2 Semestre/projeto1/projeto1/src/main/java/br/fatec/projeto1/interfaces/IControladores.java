package br.fatec.projeto1.interfaces;

import org.springframework.web.servlet.ModelAndView;

public interface IControladores<T, K> {

    // listar
    public ModelAndView listar();

    // novo
    public ModelAndView novo();

    // novo para salvar o conteudo
    public ModelAndView novo(T objeto);
    // editar

    // editar
    public ModelAndView editar(K id);

    // salvar dados da edicao
    public ModelAndView editar(K id, T objeto);

    // excluir exibir dados
    public ModelAndView excluir(K id);

    // excluir definitivamente
    public ModelAndView excluir(K id, T objeto);

    // detalhes
    public ModelAndView detalhar(K id);

}
