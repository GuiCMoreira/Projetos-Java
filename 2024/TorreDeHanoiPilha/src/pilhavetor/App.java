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

        } while (!verificarJogoGanho());

    }

    static void imprimirJogo() {
        System.out.println("\nTorre 1: Torre 2: Torre 3:");
        System.out.println("   " + PilhaA.pilha[4] + "        " + PilhaB.pilha[4] + "        " + PilhaC.pilha[4]);
        System.out.println("   " + PilhaA.pilha[3] + "        " + PilhaB.pilha[3] + "        " + PilhaC.pilha[3]);
        System.out.println("   " + PilhaA.pilha[2] + "        " + PilhaB.pilha[2] + "        " + PilhaC.pilha[2]);
        System.out.println("   " + PilhaA.pilha[1] + "        " + PilhaB.pilha[1] + "        " + PilhaC.pilha[1]);
        System.out
                .println("   " + PilhaA.pilha[0] + "        " + PilhaB.pilha[0] + "        " + PilhaC.pilha[0] + "\n");

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
                if (PilhaA.estaVazia()) {
                    System.out.println("Torre de origem vazia, escolha outra.");
                    break;
                } else {
                    int discoTorre1 = PilhaA.desempilha();
                    switch (destino) {
                        case 1:
                            PilhaA.empilhar(discoTorre1);
                            break;
                        case 2:
                            PilhaB.empilhar(discoTorre1);
                            break;
                        case 3:
                            PilhaC.empilhar(discoTorre1);
                            break;
                    }
                    break;
                }
            case 2:
                if (PilhaB.estaVazia()) {
                    System.out.println("Torre de origem vazia, escolha outra.");
                    break;
                } else {
                    int discoTorre2 = PilhaB.desempilha();
                    switch (destino) {
                        case 1:
                            PilhaA.empilhar(discoTorre2);
                            break;
                        case 2:
                            PilhaB.empilhar(discoTorre2);
                            break;
                        case 3:
                            PilhaC.empilhar(discoTorre2);
                            break;
                    }
                    break;
                }
            case 3:
                if (PilhaC.estaVazia()) {
                    System.out.println("Torre de origem vazia, escolha outra.");
                    break;
                } else {
                    int discoTorre3 = PilhaC.desempilha();
                    switch (destino) {
                        case 1:
                            PilhaA.empilhar(discoTorre3);
                            break;
                        case 2:
                            PilhaB.empilhar(discoTorre3);
                            break;
                        case 3:
                            PilhaC.empilhar(discoTorre3);
                            break;
                    }
                    break;
                }
        }
    }

    static boolean verificarTorreVazia(int torre) {

        return true;
    }

    static boolean verificarJogoGanho() {

        if (PilhaC.pilha[0] == 5 && PilhaC.pilha[1] == 4 && PilhaC.pilha[2] == 3 && PilhaC.pilha[3] == 2
                && PilhaC.pilha[4] == 1) {
            System.out.println("Parabéns! Você completou a Torre de Hanói!");
            return true;
        } else {
            return false;
        }

    }

}
