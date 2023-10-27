import java.util.Scanner;

public class App {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int numeroInteiro = VerificarInteiro("Insira um número inteiro:");
        double numeroReal = VerificarDouble("Insira um número real:");
        System.out.println("O número inteiro inserido foi: " + numeroInteiro);
        System.out.println("O número real inserido foi: " + numeroReal);
    }

    // Verifica se o valor inserido é um número inteiro
    static int VerificarInteiro(String mensagem) {
        System.out.println(mensagem);
        while (!tcl.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro: ");
            tcl.next();
        }

        return tcl.nextInt();
    }

    // Verifica se o valor inserido é um número real
    static double VerificarDouble(String mensagem) {
        System.out.println(mensagem);
        while (!tcl.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, insira um número: ");
            tcl.next();
        }

        return tcl.nextDouble();
    }

}
