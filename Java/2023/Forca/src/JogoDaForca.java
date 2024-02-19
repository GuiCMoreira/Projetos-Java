import java.util.Random;
import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {
        String[] palavras = { "java", "programacao", "computador", "desenvolvimento", "algoritmo", "exemplo", "facil",
                "aplicativo", "android", "teclado", "monitor", "internet", "codigo", "framework", "construtor",
                "heranca", "interface", "polimorfismo", "encapsulamento", "classe" };

        Random random = new Random();
        String palavraEscolhida = palavras[random.nextInt(palavras.length)];
        int tamanhoPalavra = palavraEscolhida.length();
        char[] letrasCertas = new char[tamanhoPalavra];
        boolean[] letrasEncontradas = new boolean[tamanhoPalavra];
        int tentativas = 6;
        StringBuilder letrasUtilizadas = new StringBuilder();
        StringBuilder letrasIncorretas = new StringBuilder();

        Scanner tcl = new Scanner(System.in);

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

            System.out.println("\nLetras utilizadas: " + letrasUtilizadas.toString());

            try {
                System.out.print("Digite uma letra: ");
                char letra = tcl.next().charAt(0);

                if (!Character.isLetter(letra)) {
                    throw new IllegalArgumentException("Por favor, insira uma letra válida.");
                }

                if (letrasUtilizadas.toString().contains(String.valueOf(letra))) {
                    throw new IllegalArgumentException("Você já usou essa letra. Tente outra.");
                }

                letrasUtilizadas.append(letra).append(" ");

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
                    letrasIncorretas.append(letra).append(" ");
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
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        if (tentativas == 0) {
            System.out.println("\nGame Over! A palavra era: " + palavraEscolhida);
        } else {
            System.out.println("\nVocê acertou a palavra com " + (6 - tentativas) + " erros.");
        }

        tcl.close();
    }
}
