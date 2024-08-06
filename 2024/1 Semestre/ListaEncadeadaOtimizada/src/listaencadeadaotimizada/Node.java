/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaencadeadaotimizada;

/**
 *
 * @author Luciano Pelissoli
 */
public class Node<T> {
    private T info;
    private Node<T> proximo;

    public Node() {
        proximo = null;
    }

    public Node(T info) {
        this();
        this.info = info;
    }
    
    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Node<T> getProximo() {
        return proximo;
    }

    public void setProximo(Node<T> proximo) {
        this.proximo = proximo;
    }
    
    
}
