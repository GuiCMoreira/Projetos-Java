/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package espalhamento;

/**
 *
 * @author Luciano Pelissoli
 */
public class Espalhamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int qtd = 200;
        Hash.criar(qtd);
        int elementos = 0;
        while (elementos <= qtd){
            int valor = (int) (Math.random()* 1000);
            if (Hash.busca(valor) == 0){
                Hash.inserir(valor);
                elementos++;
            }
        }
        int[] t = Hash.retorno();
        int i = 0;
        for (int valor : t ) {
            System.out.print("indice-> " + (i++)  + " valor-> ");
            System.out.println(valor + " key-> " + (valor % t.length));
            
        }
    }
    
}
