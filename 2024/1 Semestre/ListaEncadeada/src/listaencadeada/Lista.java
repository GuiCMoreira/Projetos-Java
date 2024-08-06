/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaencadeada;

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
    
    
    
}
