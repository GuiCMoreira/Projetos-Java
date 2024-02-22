import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        String inicio = "";
        String fim = "";

        System.out.println("Digite a data inicial do periodo (mm-dd-yyyy): ");
        inicio = teclado.nextLine();

        System.out.println("Digite a data final do periodo (mm-dd-yyyy): ");
        fim = teclado.nextLine();

        // aqui, o vetor cotacoes recebe o vetor de strings retornado pelo metodo
        List<Cotacao> cotacoes = ServicoCotacaoBC.porperiodo(inicio, fim); // metodo
    }

}
