package pilhavetor;
import digitacao.EntradaTeclado;

public class App {
    public static EntradaTeclado tcl = new EntradaTeclado();
    static final int disco1 = 1;
    static final int disco2 = 2;
    static final int disco3 = 3;
    static final int disco4 = 4;
    static final int disco5 = 5;

    public static void main(String[] args) {

        PilhaA.empilhar(disco5);
        PilhaA.empilhar(disco4);
        PilhaA.empilhar(disco3);
        PilhaA.empilhar(disco2);
        PilhaA.empilhar(disco1);

        imprimirJogo();

        do {

            movimento();
            imprimirJogo();

        } while (!PilhaC.verificarJogoGanho());

    }

    static void imprimirJogo() {
        System.out.println("Torre 1: " + PilhaA.pilha[0] + " " + PilhaA.pilha[1] + " " + PilhaA.pilha[2] + " "
                + PilhaA.pilha[3] + " " + PilhaA.pilha[4]);
        System.out.println("Torre 2: " + PilhaB.pilha[0] + " " + PilhaB.pilha[1] + " " + PilhaB.pilha[2] + " "
                + PilhaB.pilha[3] + " " + PilhaB.pilha[4]);
        System.out.println("Torre 3: " + PilhaC.pilha[0] + " " + PilhaC.pilha[1] + " " + PilhaC.pilha[2] + " "
                + PilhaC.pilha[3] + " " + PilhaC.pilha[4]);

    }

    static void movimento() {

        boolean movimentoValido = false;
        int origem = 0;
        int destino = 0;
        do {
            origem = tcl.numeroInteiro("Você deseja mover o disco de cima de qual torre?",
                    "Digite um número inteiro!", true);
            if (origem == 1 || origem == 2 || origem == 3) {
                movimentoValido = true;
            } else {
                System.out.println("Essa torre não existe! Escolha uma torre válida");
            }
        } while (!movimentoValido);

        movimentoValido = false;
        do {
            destino = tcl.numeroInteiro("Você deseja mover o disco para cima de qual torre?",
                    "Digite um número inteiro!", true);
            if (destino == 1 || destino == 2 || destino == 3) {
                movimentoValido = true;
            } else {
                System.out.println("Essa torre não existe! Escolha uma torre válida");
            }
        } while (!movimentoValido);

        switch (origem) {
            case 1:
                int disco = PilhaA.desempilha();
                switch (destino) {
                    case 1:
                        PilhaA.empilhar(disco);
                        break;
                    case 2:
                        PilhaB.empilhar(disco);
                        break;
                    case 3:
                        PilhaC.empilhar(disco);
                        break;
                }
                break;
            case 2:
                switch (destino) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                }
                break;
            case 3:
                switch (destino) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                }
                break;
        }
    }

}
