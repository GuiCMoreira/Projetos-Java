/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilhavetor;

/**
 *
 * @author Luciano Pelissoli
 */
public class PilhaVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Pilha.avaliar());
        Pilha.empilhar("joao");
        Pilha.empilhar("joao2");
        Pilha.empilhar("joao3");
        Pilha.empilhar("joao4");
        Pilha.empilhar("joao5");
        //Pilha.empilhar("joao6");
        System.out.println(Pilha.avaliar());
        System.out.println("Desempilhando -> " + Pilha.desempilha());
        System.out.println("Desempilhando -> " + Pilha.desempilha());
        System.out.println("Desempilhando -> " + Pilha.desempilha());
        System.out.println("Desempilhando -> " + Pilha.desempilha());
        System.out.println(Pilha.avaliar());
    }
    
}
