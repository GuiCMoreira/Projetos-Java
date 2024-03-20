package hanoi;

public class Torre1 {

    static int[] torre = new int[5];
    static int top = -1;
    
    public static boolean estaCheia(){
        return top == torre.length - 1;
    }
    
    public static boolean estaVazia() {
        return top == -1;
    }
    
    public static void empilhar(int valor){
        if (!estaCheia()){
            top++;
            torre[top] = valor;
        }
        else{
            throw new RuntimeException("torre Cheia.");
        }
    }
    
    public static int desempilha(){
        int aux = 0;
        if (!estaVazia()){
            aux = torre[top];
            torre[top] = 0;
            top--;
        }
        else{
            throw new RuntimeException("Pilha vazia.");
        }
        return aux; 
    }
    
    public static int consultaTop(){
        if (!estaVazia()){
            return torre[top];
        }
        else{
            throw new RuntimeException("Pilha vazia.");
        }
    }
    
    public static int avaliar(){
        int aux = 0;
        for (int valor : torre) {
            aux += valor;
        }
        return aux;
    }
    
}
