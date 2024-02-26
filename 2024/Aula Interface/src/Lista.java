import java.util.Scanner;

public class Lista {
    static String[] ranking = new String[10];
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        for (String valor : ranking) {
            System.out.println(valor);
        }

        ListaRegras.inserir("2000", ranking);

        for (String valor : ranking) {
            System.out.println(valor);
        }

        ListaRegras.inserir("1000", ranking);

        for (String valor : ranking) {
            System.out.println(valor);
        }

    }
}
