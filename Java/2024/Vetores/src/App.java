import java.util.Scanner;

public class App {
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean repeat = true;

        while (repeat) {

            System.out.println("+-------------------------------+");
            System.out.println("| O que você deseja consultar?  |");
            System.out.println("+-------------------------------+");
            System.out.println("| 1 - Meses do ano              |");
            System.out.println("| 2 - Placas e Modelos          |");
            System.out.println("| 3 - Sair                      |");
            System.out.println("+-------------------------------+");
            int op = tcl.nextInt();

            switch (op) {
                case 1:
                    System.out.println("+-------------------------------+");
                    meses();
                    break;
                case 2:
                    System.out.println("+-------------------------------+");
                    placas();
                    break;
                case 3:
                    System.out.println("+-------------------------------+");
                    repeat = false;
                default:
                    break;
            }
        }

    }

    public static void meses() {

        String meses[] = { "JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO",
                "OUTUBRO", "NOVEMBRO", "DEZEMBRO" };

        for (String string : meses) {
            System.out.println(string);
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
