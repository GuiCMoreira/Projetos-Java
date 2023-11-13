import digitacao.EntradaTeclado;

public class App {

    static EntradaTeclado tcl = new EntradaTeclado();
    static String disco1 = "  **  ";
    static String disco2 = " **** ";
    static String disco3 = "******";
    static String[] pino1 = new String[3];
    static String[] pino2 = new String[3];
    static String[] pino3 = new String[3];

    public static void main(String[] args) throws Exception {

        pino1[0] = disco1;
        pino1[1] = disco2;
        pino1[2] = disco3;
        pino2[0] = "";
        pino2[1] = "";
        pino2[2] = "";
        pino3[0] = "";
        pino3[1] = "";
        pino3[2] = "";

        do {

            imprimirJogo();
            movimento();

        } while (!verificarJogoGanho());
    }

    static void imprimirJogo() {

        System.out.println(pino1[0] + " " + pino2[0] + " " + pino3[0]);
        System.out.println(pino1[1] + " " + pino2[1] + " " + pino3[1]);
        System.out.println(pino1[2] + " " + pino2[2] + " " + pino3[2]);

    }

    static void movimento() {
        boolean movimentoValido = false;
        do {
            int movimento = tcl.inteiro("Você deseja mover o disco de cima de qual torre?",
                    "Digite um número inteiro!", true);
            if (movimento == 1 || movimento == 2 || movimento == 3) {
                movimentoValido = true;
            } else {
                System.out.println("Essa torre não existe! Escolha uma torre válida");
            }
        } while (!movimentoValido);

        boolean movimentoValido2 = false;
        do {
            int movimento2 = tcl.inteiro("Você deseja mover o disco para cima de qual torre?",
                    "Digite um número inteiro!", true);
            if (movimento2 == 1 || movimento2 == 2 || movimento2 == 3) {
                movimentoValido2 = true;
            } else {
                System.out.println("Essa torre não existe! Escolha uma torre válida");
            }
        } while (!movimentoValido2);
    }

    static boolean verificarJogoGanho() {
        if (pino3[0] == disco1 && pino3[1] == disco2 && pino3[2] == disco3) {
            System.out.println("Parabéns! Você completou a Torre de Hanói!");
            return true;
        } else {
            return false;
        }
    }

}
