/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filacicularvetor;

/**
 *
 * @author Luciano Pelissoli
 */
public class FilaCircular {
    static String[] vetor = new String[5];
    static int inicio = -1;
    static int fim = -1;
    static int elementos = 0;
    static boolean estaCheia(){
        int proximo = fim + 1;
        proximo = (proximo == vetor.length ? 0: proximo);
        return proximo == inicio ? true : false;
    }
    static boolean estaVazia(){
        
        return (elementos == 0) ;
    }
    
    static void pop(String valor){
       if (!estaCheia()){
           fim = (fim + 1) == vetor.length ? 0 : fim+1;
           vetor[fim] = valor;
           elementos++;
           inicio = (inicio == -1 ? 0 : inicio);
       } 
       else{
           throw new RuntimeException("Fila Cheia");
       }
    }
    static String push(){
        String retorno;
        if (!estaVazia()){
            retorno = vetor[inicio];
            vetor[inicio++] = null;
            inicio = (inicio == vetor.length ? 0 : inicio);
            elementos--;
        }
        else{
            throw new RuntimeException("Fila vazia");
        }
        
        return retorno;
        
    }

    
    static String avaliar() {
        String aux ="";
        for (String conteudo : vetor) {
            aux += conteudo + ", ";
        }
        aux += "\n";
        return aux;
    }
    
}
