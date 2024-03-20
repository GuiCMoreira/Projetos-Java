package pilhavetor;

public class PilhaC {
    static int[] pilha = new int[5];
    static int top = -1;
    
    public static boolean estaCheia(){
        return top == pilha.length - 1;
    }
    
    public static boolean estaVazia(){
        return top == -1;
    }
    public static void empilhar(int valor){
        if (!estaCheia()){
            top++;
            pilha[top] = valor;
        }
        else{
            throw new RuntimeException("Pilha Cheia.");
        }
    }
    
    public static int desempilha(){
        int aux = 0;
        if (!estaVazia()){
            aux = pilha[top];
            pilha[top] = 0;
            top--;
        }
        else{
            throw new RuntimeException("Pilha vazia.");
        }
        return aux;
        
    }
    
    public static int consultaTop(){
        if (!estaVazia()){
            return pilha[top];
        }
        else{
            throw new RuntimeException("Pilha vazia.");
        }
    }
    
    public static int avaliar() {
        int aux = 0;
        for (int valor : pilha) {
            aux += valor;
        }
        return aux;
    }
    
}
