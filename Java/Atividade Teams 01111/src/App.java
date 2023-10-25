import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean sair = false;
        while (sair == false) {

            System.out.println("-----------------------------------------------------");
            System.out.println("| Menu                                              |");
            System.out.println("-----------------------------------------------------");
            System.out.println("| 1 - Centímetros para polegadas                    |");
            System.out.println("| 2 - Polegadas para centímetros                    |");
            System.out.println("| 3 - Graus Celsius para graus Fahrenheit           |");
            System.out.println("| 4 - Graus Fahrenheit para graus Celsius           |");
            System.out.println("| 5 - Sair                                          |");
            System.out.println("-----------------------------------------------------");
            System.out.println("Escolha uma operação: ");

            int operacao = VerificarInteiro();

            switch (operacao) {
                case 1:
                    CentPol();
                    break;
                case 2:
                    PolCent();
                    break;
                case 3:
                    CelFah();
                    break;
                case 4:
                    FahCel();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Operação inválida, insira uma das opções do menu: ");
                    break;
            }
        }
    }

    // Funções de verificação ---------------------------------------------

    static int VerificarInteiro() {
        int valor = 0;
        boolean entradaValida = false;
        do {
            try {
                valor = tcl.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Operação inválida. Insira um número inteiro.");
                tcl.nextLine();
            }
        } while (entradaValida == false);

        return valor;
    }

    static double VerificarDouble() {
        double valor = 0;
        boolean entradaValida = false;
        do {
            try {
                valor = tcl.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Operação inválida. Insira um número.");
                tcl.nextLine();
            }
        } while (entradaValida == false);

        return valor;
    }

    // Funções de conversão ---------------------------------------------

    static double CentPol() {
        System.out.println("Insira o valor em centímetros: ");
        double cent = VerificarDouble();
        double pol = cent / 2.54f;
        System.out.println("O valor em polegadas é: " + pol);
        return pol;
    }

    static double PolCent() {
        System.out.println("Insira o valor em polegadas: ");
        double pol = VerificarDouble();
        double cent = pol * 2.54f;
        System.out.println("O valor em centímetros é: " + cent);
        return cent;
    }

    static double CelFah() {
        System.out.println("Insira o valor em graus Celsius: ");
        double cel = VerificarDouble();
        double fah = (cel * 9 / 5) + 32;
        System.out.println("O valor em graus Fahrenheit é: " + fah);
        return fah;
    }

    static double FahCel() {
        System.out.println("Insira o valor em graus Fahrenheit: ");
        double fah = VerificarDouble();
        double cel = (fah - 32) * 5 / 9;
        System.out.println("O valor em graus Celsius é: " + cel);
        return cel;
    }
}
