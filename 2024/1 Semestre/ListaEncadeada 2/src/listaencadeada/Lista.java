/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaencadeada;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luciano Pelissoli
 */
public class Lista<G> {
    private Node<G> inicio;
    private int elementos;

    public Lista() {
        inicio = null;
        elementos = 0;
    }
    // lenght()
    public int tamanho(){
        return elementos;
    }
    
    public void insert(G info){
        if ( inicio == null){
            inicio = new Node<G>(info);
        }
        else{
            Node<G> atual = inicio;
            while (atual.getProximo()!= null){
                atual = atual.getProximo();
            }
            atual.setProximo(new Node<G>(info));
        }
        elementos++;
    }
    
    public void insertBegin(G info){
        Node<G> novo = new Node<G>(info);
        elementos++;
        if (inicio != null){
            novo.setProximo(inicio);
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
        ArrayList<G> lista = new ArrayList<G>();
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
            return removido.getInfo();
        }
        return null;
        
    }
    
}
