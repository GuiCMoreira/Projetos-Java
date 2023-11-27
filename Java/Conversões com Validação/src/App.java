import digitacao.EntradaTeclado;

public class App {

    static EntradaTeclado tcl = new EntradaTeclado();

    public static void main(String[] args) throws Exception {

        boolean sair = false;
        while (sair == false) {

            Menu();

            int operacao = tcl.numeroInteiro("Escolha uma operação: ", "Insira uma operação válida!", true);

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

    // Menu de opções
    // ---------------------------------------------------------------

    static void Menu() {
        System.out.println("-----------------------------------------------------");
        System.out.println("|                      Menu                         |");
        System.out.println("-----------------------------------------------------");
        System.out.println("| 1 - Centímetros para polegadas                    |");
        System.out.println("| 2 - Polegadas para centímetros                    |");
        System.out.println("| 3 - Graus Celsius para graus Fahrenheit           |");
        System.out.println("| 4 - Graus Fahrenheit para graus Celsius           |");
        System.out.println("| 5 - Sair                                          |");
        System.out.println("-----------------------------------------------------");
    }

    // Funções de conversão
    // ---------------------------------------------------------

    // Centímetros para polegadas
    static double CentPol() {
        double cent = tcl.numeroDecimal("Insira o valor em centímetros:", "Insira um número real!", true);
        double pol = cent / 2.54f;
        System.out.println("O valor em polegadas é: " + pol);
        return pol;
    }

    // Polegadas para centímetros
    static double PolCent() {
        double pol = tcl.numeroDecimal("Insira o valor em polegadas:", "Insira um número real!", true);
        double cent = pol * 2.54f;
        System.out.println("O valor em centímetros é: " + cent);
        return cent;
    }

    // Graus Celsius para graus Fahrenheit
    static double CelFah() {
        double cel = tcl.numeroDecimal("Insira o valor em graus Celsius:", "Insira um número real!", true);
        double fah = (cel * 9 / 5) + 32;
        System.out.println("O valor em graus Fahrenheit é: " + fah);
        return fah;
    }

    // Graus Fahrenheit para graus Celsius
    static double FahCel() {
        double fah = tcl.numeroDecimal("Insira o valor em graus Fahrenheit:", "Insira um número real!", true);
        double cel = (fah - 32) * 5 / 9;
        System.out.println("O valor em graus Celsius é: " + cel);
        return cel;
    }
}
