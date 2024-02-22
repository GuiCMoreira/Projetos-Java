import digitacao.EntradaTeclado;

public class App {
    
    public static EntradaTeclado tcl = new EntradaTeclado();

    public static float[][] mt1 = new float[3][4];
    public static float[][] mt2 = new float[3][4];

    public static void main(String[] args) throws Exception {
        iniciarMatrizes();
        imprimirMatrizes();
        preencherMatriz1();
        imprimirMatrizes();
    }

    public static void iniciarMatrizes() {
        for (int i = 0; i < mt1.length; i++) {
            for (int j = 0; j < mt1[i].length; j++) {
                mt1[i][j] = 0;
            }
        }
        for (int i = 0; i < mt2.length; i++) {
            for (int j = 0; j < mt2[i].length; j++) {
                mt2[i][j] = 0;
            }
        }
    }

    public static void imprimirMatrizes() {
        System.out.println("Matriz 1:");
        for (int i = 0; i < mt1.length; i++) {
            for (int j = 0; j < mt1[i].length; j++) {
                System.out.print(mt1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz 2:");
        for (int i = 0; i < mt2.length; i++) {
            for (int j = 0; j < mt2[i].length; j++) {
                System.out.print(mt2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void preencherMatriz1() {
        for (int i = 0; i < mt1.length; i++) {
            for (int j = 0; j < mt1[i].length; j++) {
                mt1[i][j] = tcl.numeroFloat("Digite o valor da posição [" + i + "][" + j + "] da matriz 1: ", "Valor inválido! Insira novamente: ", true);
            }
        }
    }
}
