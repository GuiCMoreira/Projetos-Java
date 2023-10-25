import java.util.Scanner;

public class App {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean sair = false;
        while (sair == false) {

            System.out.println("Qual conversão você deseja realizar?");
            System.out.println("1 - Centímetros para polegadas");
            System.out.println("2 - Polegadas para centímetros");
            System.out.println("3 - Graus Celsius para graus Fahrenheit");
            System.out.println("4 - Graus Fahrenheit para graus Celsius");
            System.out.println("5 - Sair");
            int operacao = tcl.nextInt();

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
                    sair = true;
                    break;
            }
        }
    }

    static void VerificarOperacao(String operacao) {
        try {
            int op = Integer.parseInt(operacao);
            if (op < 1 || op > 5) {
                throw new Exception("Operação inválida");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Funções de conversão ---------------------------------------------

    static double CentPol() {
        System.out.println("Insira o valor em centímetros: ");
        double cent = tcl.nextDouble();
        double pol = cent / 2.54f;
        System.out.println("O valor em polegadas é: " + pol);
        return pol;
    }

    static double PolCent() {
        System.out.println("Insira o valor em polegadas: ");
        double pol = tcl.nextDouble();
        double cent = pol * 2.54f;
        System.out.println("O valor em centímetros é: " + cent);
        return cent;
    }

    static double CelFah() {
        System.out.println("Insira o valor em graus Celsius: ");
        double cel = tcl.nextDouble();
        double fah = (cel * 9 / 5) + 32;
        System.out.println("O valor em graus Fahrenheit é: " + fah);
        return fah;
    }

    static double FahCel() {
        System.out.println("Insira o valor em graus Fahrenheit: ");
        double fah = tcl.nextDouble();
        double cel = (fah - 32) * 5 / 9;
        System.out.println("O valor em graus Celsius é: " + cel);
        return cel;
    }
}
