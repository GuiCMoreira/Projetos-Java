package pilhavetor;
import java.util.Scanner;

public class PilhaVetor {
    public static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insira uma frase: ");
        String frase = tcl.nextLine();
        char[] vetor = frase.toCharArray();

        for (int i = 0; i < vetor.length; i++) {
            Pilha.empilhar(vetor[i]);
        }

        System.out.println(Pilha.avaliar());

        System.out.println("Desempilhando -> " + Pilha.desempilha());

        System.out.println(Pilha.avaliar());
    }
}
