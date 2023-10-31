import java.util.Scanner;

public class App {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int numeroInteiro = VerificarInteiroTC("Insira um número inteiro:");
        double numeroReal = VerificarDoubleTC("Insira um número real:");
        System.out.println("O número inteiro inserido foi: " + numeroInteiro);
        System.out.println("O número real inserido foi: " + numeroReal);
    }

    // Verifica se o valor inserido é um INT TRY CATCH
    static int VerificarInteiroTC(String mensagem) {
        Boolean erro = false;
        int aux = 0;
        String valor;
        while (erro == false) {
            System.out.println(mensagem);
            valor = tcl.nextLine();
            try {
                aux = Integer.parseInt(valor);
                erro = true;
            } catch (Exception e) {
                System.out.println("Insira uma operação válida");
            }
        }
        return aux;
    }

    // Verifica se o valor inserido é um DOUBLE TRY CATCH
    static double VerificarDoubleTC(String mensagem) {
        Boolean erro = false;
        double aux = 0;
        String valor;
        while (erro == false) {
            System.out.println(mensagem);
            valor = tcl.nextLine();
            try {
                aux = Double.parseDouble(valor);
                erro = true;
            } catch (Exception e) {
                System.out.println("Insira uma operação válida");
            }
        }
        return aux;
    }

    // -------------------------------------------------------------------------------

    // Verifica se o valor inserido é um INT
    static int VerificarInteiro(String mensagem) {
        System.out.println(mensagem);
        while (!tcl.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro: ");
            tcl.next();
        }

        return tcl.nextInt();
    }

    // Verifica se o valor inserido é um DOUBLE
    static double VerificarDouble(String mensagem) {
        System.out.println(mensagem);
        while (!tcl.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, insira um número: ");
            tcl.next();
        }

        return tcl.nextDouble();
    }
}
