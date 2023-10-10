import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] palavras = {"java", "programacao", "computador", "desenvolvimento", "algoritmo", "exemplo", "facil", "aplicativo", "android", "teclado", "monitor", "internet", "codigo", "framework", "construtor", "heranca", "interface", "polimorfismo", "encapsulamento", "classe"};

        Random random = new Random();
        String palavraEscolhida = palavras[random.nextInt(palavras.length)];
        int tamanhoPalavra = palavraEscolhida.length();
        char[] letrasCertas = new char[tamanhoPalavra];
        boolean[] letrasEncontradas = new boolean[tamanhoPalavra];
        int tentativas = 6;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo da Forca!");
        System.out.println("A palavra tem " + tamanhoPalavra + " letras.");

        while (tentativas > 0) {
            System.out.println("\nTentativas restantes: " + tentativas);
            System.out.print("Palavra: ");

            for (int i = 0; i < tamanhoPalavra; i++) {
                if (letrasEncontradas[i]) {
                    System.out.print(letrasCertas[i]);
                } else {
                    System.out.print("_");
                }
            }

            System.out.print("\nLetras erradas: ");
            for (int i = 0; i < tamanhoPalavra; i++) {
                if (!letrasEncontradas[i]) {
                    System.out.print(letrasCertas[i] + " ");
                }
            }

            System.out.print("\nDigite uma letra: ");
            char letra = scanner.next().charAt(0);

            boolean letraEncontrada = false;

            for (int i = 0; i < tamanhoPalavra; i++) {
                if (palavraEscolhida.charAt(i) == letra) {
                    letrasEncontradas[i] = true;
                    letrasCertas[i] = letra;
                    letraEncontrada = true;
                }
            }

            if (!letraEncontrada) {
                tentativas--;
            }

            boolean palavraCompleta = true;
            for (boolean encontrada : letrasEncontradas) {
                if (!encontrada) {
                    palavraCompleta = false;
                    break;
                }
            }

            if (palavraCompleta) {
                System.out.println("\nParabéns! Você acertou a palavra: " + palavraEscolhida);
                break;
            }
        }

        if (tentativas == 0) {
            System.out.println("\nGame Over! A palavra era: " + palavraEscolhida);
        }

        scanner.close();
    }
}
