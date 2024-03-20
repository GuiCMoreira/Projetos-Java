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
        Torre_1.empilhar(disco5);
        Torre_1.empilhar(disco4);
        Torre_1.empilhar(disco3);
        Torre_1.empilhar(disco2);
        Torre_1.empilhar(disco1);

        Imprimir_e_Verificar.imprimirJogo();

        do {

            Movimento.movimento();
            Imprimir_e_Verificar.imprimirJogo();

        } while (!Imprimir_e_Verificar.verificarJogoGanho());
    }

}
