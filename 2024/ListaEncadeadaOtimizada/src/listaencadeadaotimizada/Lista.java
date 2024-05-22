/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaencadeadaotimizada;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luciano Pelissoli
 */
public class Lista<G> {
    private Node<G> inicio;
    private Node<G> fim;
    private int elementos;

    public Lista() {
        inicio = null;
        fim = null;
        elementos = 0;
    }
    // lenght()
    public int tamanho(){
        return elementos;
    }
    
    public void insert(G info){
        if ( inicio == null){
            inicio = new Node<G>(info);
            fim = inicio;
        }
        else{
            Node<G> atual = inicio;
            // mudar esta estrutura pora uso do fim
            /* while (atual.getProximo()!= null){
             *   atual = atual.getProximo();
             * } 
             * atual.setProximo(new Node<G>(info));
             */
            fim.setProximo(new Node<G>(info));
            fim = fim.getProximo();
        }
        elementos++;
    }
    
    public void insertBegin(G info){
        Node<G> novo = new Node<G>(info);
        elementos++;
        if (inicio != null){
            novo.setProximo(inicio);
        }
        else{
            fim = novo;
        }
        inicio = novo;
    }
    
    public void insertAfter(int posicao,G info) 
            throws RuntimeException {
        if (posicao <= 0){
            throw new RuntimeException("Posição deve ser maior que zero.");
        }
        Node<G> novo = new Node<G>(info);
        if (posicao >= elementos){
            insert(info);
        }
        else {
            int pos = 1;
            Node<G> atual = inicio;
            while (pos < posicao){
                atual = atual.getProximo();
                pos++;
            }
            novo.setProximo(atual.getProximo());
            atual.setProximo(novo);
            elementos++;
        }
    }
    public G buscar(G info){
        Node<G> atual = inicio;
        while ( atual != null && 
                atual.getInfo()!= null && 
               !atual.getInfo().equals(info)){
            atual = atual.getProximo();
        }
        G aux = null;
        if (atual != null){
            aux = atual.getInfo();
        }
        
        return aux;
    }
    
    public List<G> listar(){
        List<G> lista = new ArrayList<G>();
        
        Node<G> atual = inicio;
        while (atual != null){
            lista.add((G) atual.getInfo());
            atual = atual.getProximo();
        }
        return lista;
    }
    
    public G remover(G info){
        Node<G> atual = inicio;
        Node<G> removido = null;
        if (atual.getInfo().equals(info)){
            inicio = (atual.getProximo());
            // caso "atual" seja o único elemento, então
            // o  fim deverá ficar com o mesmo conteúdo 
            // do inicio
            if (fim == atual){
                fim = inicio;
            }
            return atual.getInfo();
        }
        
        while (atual.getProximo()!= null){
            Node<G> proximo = atual.getProximo();
            if (! proximo.getInfo().equals(info)){
                atual = atual.getProximo();            
            }
            else{
                break;
            }
        }
        if (atual.getProximo() != null){
            removido = atual.getProximo();
            atual.setProximo(removido.getProximo());
            removido.setProximo(null);
            // ajusta o fim caso ele seja removido
            // sendo redirecionado para o penultimo (atual)
            if (removido == fim){
                fim = atual;
            }
            return removido.getInfo();
        }
        return null;
        
    }
    
}
