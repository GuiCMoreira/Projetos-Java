import digitacao.EntradaTeclado;

public class App {
    EntradaTeclado tcl = new EntradaTeclado();

    static char[] vetor = new char[5];

    public static void main(String[] args) throws Exception {

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (char) (65 + i);
        }

        try {
            System.out.println(vetor[3]);
            String aux = "D";
            System.out.println(Integer.parseInt(aux));
        } catch (ArrayIndexOutOfBoundsException er) {
            System.out.println(er.getMessage());
        } catch (NumberFormatException er) {
            System.out.println(er.getMessage());
        } finally {
            System.out.println("O programa foi encerrado.");
        }

    }
}
