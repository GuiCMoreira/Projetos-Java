import digitacao.EntradaTeclado;

public class App {

    static EntradaTeclado tcl = new EntradaTeclado();
    static String disco1 = "  ***  ";
    static String disco2 = " ***** ";
    static String disco3 = "*******";
    static String[] pino1 = new String[3];
    static String[] pino2 = new String[3];
    static String[] pino3 = new String[3];

    public static void main(String[] args) throws Exception {

        pino1[0] = disco3;
        pino1[1] = disco2;
        pino1[2] = disco1;
        pino2[0] = "       ";
        pino2[1] = "       ";
        pino2[2] = "       ";
        pino3[0] = "       ";
        pino3[1] = "       ";
        pino3[2] = "       ";

        do {

            imprimirJogo();
            movimento();

        } while (!verificarJogoGanho());
    }

    static void imprimirJogo() {

        System.out.println("--------------------------");
        System.out.println(pino1[2] + pino2[2] + pino3[2]);
        System.out.println(pino1[1] + pino2[1] + pino3[1]);
        System.out.println(pino1[0] + pino2[0] + pino3[0]);
        System.out.println("--------------------------");

    }

    static void movimento() {
        boolean movimentoValido = false;
        int origem = 0;
        int destino = 0;
        do {
            origem = tcl.inteiro("Você deseja mover o disco de cima de qual torre?",
                    "Digite um número inteiro!", true);
            if (origem == 1 || origem == 2 || origem == 3) {
                movimentoValido = true;
            } else {
                System.out.println("Essa torre não existe! Escolha uma torre válida");
            }
        } while (!movimentoValido);

        movimentoValido = false;
        do {
            destino = tcl.inteiro("Você deseja mover o disco para cima de qual torre?",
                    "Digite um número inteiro!", true);
            if (destino == 1 || destino == 2 || destino == 3) {
                movimentoValido = true;
            } else {
                System.out.println("Essa torre não existe! Escolha uma torre válida");
            }
        } while (!movimentoValido);

        String disco = "       ";
        switch (origem) {
            case 1:
                if (pino1[2] != "       ") {
                    disco = pino1[2];
                    pino1[2] = "       ";
                } else if (pino1[1] != "       ") {
                    disco = pino1[1];
                    pino1[1] = "       ";
                } else if (pino1[0] != "       ") {
                    disco = pino1[0];
                    pino1[0] = "       ";
                } else {
                    System.out.println("Essa torre está vazia! Escolha uma torre com discos");
                    return;
                }
                break;
            case 2:
                if (pino2[2] != "") {
                    disco = pino2[2];
                    pino2[2] = "";
                } else if (pino2[1] != "") {
                    disco = pino2[1];
                    pino2[1] = "";
                } else if (pino2[0] != "") {
                    disco = pino2[0];
                    pino2[0] = "";
                } else {
                    System.out.println("Essa torre está vazia! Escolha uma torre com discos");
                    return;
                }
                break;
            case 3:
                if (pino3[2] != "       ") {
                    disco = pino3[2];
                    pino3[2] = "       ";
                } else if (pino3[1] != "       ") {
                    disco = pino3[1];
                    pino3[1] = "       ";
                } else if (pino3[0] != "       ") {
                    disco = pino3[0];
                    pino3[0] = "       ";
                } else {
                    System.out.println("Essa torre está vazia! Escolha uma torre com discos");
                    return;
                }
                break;
        }

        switch (destino) {
            case 1:
                if (pino1[0] == "       ") {
                    pino1[0] = disco;
                } else if (pino1[1] == "       ") {
                    pino1[1] = disco;
                } else if (pino1[2] == "       ") {
                    pino1[2] = disco;
                } else {
                    System.out.println("Essa torre está cheia! Escolha uma torre vazia");
                    return;
                }
                break;
            case 2:
                if (pino2[0] == "       ") {
                    pino2[0] = disco;
                } else if (pino2[1] == "       ") {
                    pino2[1] = disco;
                } else if (pino2[2] == "       ") {
                    pino2[2] = disco;
                } else {
                    System.out.println("Essa torre está cheia! Escolha uma torre vazia");
                    return;
                }
                break;
            case 3:
                if (pino3[0] == "       ") {
                    pino3[0] = disco;
                } else if (pino3[1] == "       ") {
                    pino3[1] = disco;
                } else if (pino3[2] == "       ") {
                    pino3[2] = disco;
                } else {
                    System.out.println("Essa torre está cheia! Escolha uma torre vazia");
                    return;
                }
                break;
        }
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
