package pilhavetor;

public class PilhaVetor {

    public static void main(String[] args) {

        System.out.println(Pilha.avaliar());
        
        Pilha.empilhar("joao");
        Pilha.empilhar("joao2");
        Pilha.empilhar("joao3");
        Pilha.empilhar("joao4");
        Pilha.empilhar("joao5");

        System.out.println(Pilha.avaliar());

        System.out.println("Desempilhando -> " + Pilha.desempilha());
        System.out.println("Desempilhando -> " + Pilha.desempilha());
        System.out.println("Desempilhando -> " + Pilha.desempilha());
        System.out.println("Desempilhando -> " + Pilha.desempilha());

        System.out.println(Pilha.avaliar());
    }
    
}
