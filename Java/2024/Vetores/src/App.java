import digitacao.EntradaTeclado;

public class App {

    static EntradaTeclado tcl = new EntradaTeclado();

    public static void main(String[] args) throws Exception {

        boolean repeat = true;

        while (repeat) {

            menu();

            int op = tcl.numeroInteiro("Escolha uma opção: ", "Insira um número inteiro!", true);

            switch (op) {
                case 1:
                    System.out.println("");
                    System.out.println("Meses do ano: ");
                    System.out.println("");
                    meses();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Veículos: ");
                    System.out.println("");
                    placas();
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Saindo...");
                    System.out.println("");
                    repeat = false;
                    break;
                default:
                    System.out.println("Insira uma opção válida: ");
                    break;
            }
        }

    }

    public static void menu() {

        System.out.println("+-------------------------------+");
        System.out.println("| O que você deseja consultar?  |");
        System.out.println("+-------------------------------+");
        System.out.println("| 1 - Meses do ano              |");
        System.out.println("| 2 - Placas e Modelos          |");
        System.out.println("| 3 - Sair                      |");
        System.out.println("+-------------------------------+");

    }

    public static void meses() {

        String meses[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro" };

        for (String Meses : meses) {
            System.out.println(Meses);
        }

    }

    public static void placas() {

        String mt1[][] = {
                { "GBM-6I59", "CB 250F Twister" },
                { "MFA-9K86", "XRE 300" },
                { "YOU-7W32", "CB 500X" }
        };

        for (int i = 0; i < mt1.length; i++) {
            for (int j = 0; j < mt1[i].length; j++) {
                System.out.println(mt1[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
