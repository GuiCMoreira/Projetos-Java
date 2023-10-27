import java.util.Scanner;

public class App {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean sair = false;
        while (sair == false) {

            Menu();

            int operacao = VerificarInteiro("Escolha uma operação: ");

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

    //Menu de opções ---------------------------------------------
    static void Menu() {
        System.out.println("-----------------------------------------------------");
        System.out.println("| Menu                                              |");
        System.out.println("-----------------------------------------------------");
        System.out.println("| 1 - Centímetros para polegadas                    |");
        System.out.println("| 2 - Polegadas para centímetros                    |");
        System.out.println("| 3 - Graus Celsius para graus Fahrenheit           |");
        System.out.println("| 4 - Graus Fahrenheit para graus Celsius           |");
        System.out.println("| 5 - Sair                                          |");
        System.out.println("-----------------------------------------------------");
    }

    // Funções de verificação ---------------------------------------------

    //Verifica se o valor inserido é um número inteiro
    static int VerificarInteiro(String mensagem) {
        System.out.println(mensagem);
         while (!tcl.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro: ");
            tcl.next();
         }

        return tcl.nextInt();
    }

    //Verifica se o valor inserido é um número real
    static double VerificarDouble(String mensagem) {
        System.out.println(mensagem);
        while (!tcl.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, insira um número: ");
            tcl.next();
        }

        return tcl.nextDouble();
    }

    // Funções de conversão ---------------------------------------------

    //Centímetros para polegadas
    static double CentPol() {
        double cent = VerificarDouble("Insira o valor em centímetros:");
        double pol = cent / 2.54f;
        System.out.println("O valor em polegadas é: " + pol);
        return pol;
    }

    //Polegadas para centímetros
    static double PolCent() {
        double pol = VerificarDouble("Insira o valor em polegadas:");
        double cent = pol * 2.54f;
        System.out.println("O valor em centímetros é: " + cent);
        return cent;
    }

    //Graus Celsius para graus Fahrenheit
    static double CelFah() {
        double cel = VerificarDouble("Insira o valor em graus Celsius:");
        double fah = (cel * 9 / 5) + 32;
        System.out.println("O valor em graus Fahrenheit é: " + fah);
        return fah;
    }

    //Graus Fahrenheit para graus Celsius
    static double FahCel() {
        double fah = VerificarDouble("Insira o valor em graus Fahrenheit:");
        double cel = (fah - 32) * 5 / 9;
        System.out.println("O valor em graus Celsius é: " + cel);
        return cel;
    }
}
