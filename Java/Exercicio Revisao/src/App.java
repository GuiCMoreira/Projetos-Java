import java.util.Scanner;

public class App {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean sair = false;
        while (sair == false) {

            System.out.println("------------------");
            System.out.println("Menu");
            System.out.println("------------------");
            System.out.println("1 - Soma de 3 números");
            System.out.println("2 - Calcular o quadrado de um número");
            System.out.println("3 - Apresente um número aleatório entre 0 e 10000");
            System.out.println("4 - Sair");
            System.out.println("------------------");
            System.out.println("Escolha uma opção: ");
            int operacaoEscolhida = tcl.nextInt();

            switch (operacaoEscolhida) {
                case 1:
                    System.out.println(operacao1());
                    break;

                case 2:
                    System.out.println(operacao2());
                    break;

                case 3:
                    System.out.printf("%5.0f \n", operacao3());
                    break;

                case 4:
                    sair = true;
                    break;

                default:
                    System.out.println("Insira uma operação válida");
                    break;
            }
        }
    }

    static double operacao1() {
        System.out.println("Insira o primeiro número: ");
        double n1 = tcl.nextDouble();
        System.out.println("Insira o segundo número: ");
        double n2 = tcl.nextDouble();
        System.out.println("Insira o terceiro número: ");
        double n3 = tcl.nextDouble();
        double resultado = (n1 + n2 + n3);
        return resultado;
    }

    static double operacao2() {
        System.out.println("Insira um número: ");
        double n1 = tcl.nextDouble();
        double resultado = (n1 * n1);
        return resultado;
    }

    static double operacao3() {
        double numeroAleatorio = Math.random() * 10000;
        return numeroAleatorio;
    }
}
