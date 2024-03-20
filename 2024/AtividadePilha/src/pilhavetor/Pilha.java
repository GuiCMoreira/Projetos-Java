package pilhavetor;

public class Pilha {
    static char[] pilha = new char[150];
    static int top = -1;
    
    public static boolean estaCheia(){
        return top == pilha.length - 1;
    }
    
    public static boolean estaVazia(){
        return top == -1;
    }
    public static void empilhar(char valor){
        if (!estaCheia()){
            top++;
            pilha[top] = valor;
        }
        else{
            throw new RuntimeException("Pilha Cheia.");
        }
    }
    
    public static char desempilha(){
        char letra = '\0';
        if (!estaVazia()){
            letra = pilha[top];
            pilha[top] = '\0';
            top--;
        }
        else{
            throw new RuntimeException("Pilha vazia.");
        }
        return letra;
        
    }
    
    public static char consultaTop(){
        if (!estaVazia()){
            return pilha[top];
        }
        else{
            throw new RuntimeException("Pilha vazia.");
        }
    }
    
    public static char avaliar(){
        char aux = '\0';
        for (char valor : pilha) {
            aux += valor;
        }
        return aux;
    }
    
}
