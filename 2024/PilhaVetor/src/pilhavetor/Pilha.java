package pilhavetor;

public class Pilha {
    static String[] pilha = new String[5];
    static int top = -1;
    
    public static boolean estaCheia(){
        return top == pilha.length - 1;
    }
    
    public static boolean estaVazia(){
        return top == -1;
    }
    public static void empilhar(String valor){
        if (!estaCheia()){
            top++;
            pilha[top] = valor;
        }
        else{
            throw new RuntimeException("Pilha Cheia.");
        }
    }
    
    public static String desempilha(){
        String retorno = "";
        if (!estaVazia()){
            retorno = pilha[top];
            pilha[top] = null;
            top--;
        }
        else{
            throw new RuntimeException("Pilha vazia.");
        }
        return retorno;
        
    }
    
    public static String consultaTop(){
        if (!estaVazia()){
            return pilha[top];
        }
        else{
            throw new RuntimeException("Pilha vazia.");
        }
    }
    
    public static String avaliar(){
        String aux = "";
        for (String valor : pilha) {
            aux += valor + " -> ";
        }
        return aux;
    }
    
}
