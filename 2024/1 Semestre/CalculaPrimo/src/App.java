import java.util.Scanner;

public class App {

    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Insira um Número: ");
        int n1 = tcl.nextInt();
        boolean primo = true;

        for (int i = 2; i < n1; i++) {
            if (n1 % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println(n1 + " é um número primo.");
        } else {
            System.out.println(n1 + " não é um número primo.");
        }

    }
}
