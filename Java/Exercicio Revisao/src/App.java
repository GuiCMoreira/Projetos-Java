import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean sair = false;
        
        do {

            System.out.println("-----------------------------------------------------");
            System.out.println("| Menu                                              |");
            System.out.println("-----------------------------------------------------");
            System.out.println("| 1 - Soma de 3 números                             |");
            System.out.println("| 2 - Calcular o quadrado de um número              |");
            System.out.println("| 3 - Apresente um número aleatório entre 0 e 10000 |");
            System.out.println("| 4 - Sair                                          |");
            System.out.println("-----------------------------------------------------");
            System.out.println("Escolha uma operação: ");

            int operacaoEscolhida = lerInteiro();

            switch (operacaoEscolhida) {
                case 1:
                    System.out.println("A soma dos 3 números é " + operacao1());
                    break;

                case 2:
                    System.out.println("O quadrado deste número é " + operacao2());
                    break;

                case 3:
                    System.out.printf("Número aleatório entre 0 e 10000: " + "%5.0f \n", operacao3());
                    break;

                case 4:
                    sair = true;
                    break;

                default:
                    System.out.println("Insira uma operação válida");
                    break;
            }
        } while (sair == false);

    }

    static int lerInteiro() {
        int valor = 0;
        boolean entradaValida = false;
        do {
            try {
                valor = tcl.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Insira um número inteiro.");
                tcl.nextLine(); // Limpa o buffer de entrada
            }
        } while (entradaValida == false);

        return valor;
    }

    static double operacao1() {
        System.out.println("Insira o primeiro número: ");
        double n1 = lerDouble();
        System.out.println("Insira o segundo número: ");
        double n2 = lerDouble();
        System.out.println("Insira o terceiro número: ");
        double n3 = lerDouble();
        double resultado = (n1 + n2 + n3);
        return resultado;
    }

    static double operacao2() {
        System.out.println("Insira um número: ");
        double n1 = lerDouble();
        double resultado = (n1 * n1);
        return resultado;
    }

    static double operacao3() {
        double numeroAleatorio = Math.random() * 10000;
        return numeroAleatorio;
    }

    static double lerDouble() {
        double valor = 0;
        boolean entradaValida = false;
        do {
            try {
                valor = tcl.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Insira um número.");
                tcl.nextLine(); // Limpa o buffer de entrada
            }
        } while (entradaValida == false);

        return valor;
    }
}
