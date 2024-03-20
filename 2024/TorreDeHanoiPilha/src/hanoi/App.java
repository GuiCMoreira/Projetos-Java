package hanoi;

import digitacao.EntradaTeclado;

public class App {

    public static EntradaTeclado tcl = new EntradaTeclado();
    static final int disco1 = 1;
    static final int disco2 = 2;
    static final int disco3 = 3;
    static final int disco4 = 4;
    static final int disco5 = 5;

    public static void main(String[] args) {
        Torre1.empilhar(disco5);
        Torre1.empilhar(disco4);
        Torre1.empilhar(disco3);
        Torre1.empilhar(disco2);
        Torre1.empilhar(disco1);

        ImprimirJogo.imprimirJogo();

        do {

            Movimento.movimento();
            ImprimirJogo.imprimirJogo();

        } while (!VerificarJogoGanho.verificarJogoGanho());
    }
    
}
