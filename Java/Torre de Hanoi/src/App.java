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

        boolean jogoGanho = false;
        boolean movimentovalido = false;
        imprimirinicio();
        do {
            int movimento = tcl.inteiro("Você deseja mover o disco de cima de qual torre?",
                    "Não é possível mover este disco! Escolha um válido", true);
            if (movimento < 1 && movimento > 3) {
                movimentovalido = true;
            } else {
                System.out.println("Não é possível mover este disco! Escolha um válido");
                movimento = 0;
            }
        } while (movimentovalido);

    }

    static void imprimirinicio() {

        pino1[0] = disco1;
        pino2[0] = "  |  ";
        pino3[0] = "  |  ";
        pino1[1] = disco2;
        pino2[1] = "  |  ";
        pino3[1] = "  |  ";
        pino1[2] = disco3;
        pino2[2] = "  |  ";
        pino3[2] = "  |  ";

        System.out.println(pino1[0] + " " + pino2[0] + " " + pino3[0]);
        System.out.println(pino1[1] + " " + pino2[1] + " " + pino3[1]);
        System.out.println(pino1[2] + " " + pino2[2] + " " + pino3[2]);

    }

    static void moverpino1() {

    }

    static void moverpino2() {

    }

    static void moverpino3() {

    }

    static void verificarjogoganho() {

    }
}
