package filacicularvetor;

public class App {

    private static final String[] nomes = { "Alberto",
            "Joao", "Maria", "Juliano", "Felizberto", "Debora", "Vanessa" };

    public static void main(String[] args) {
        for (String nome : nomes) {
            try {
                System.out.println("Adicionando " + nome);
                FuncoesFila.inserir(nome);

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.printf("%s não foi inserido\n", nome);
            }
        }

        System.out.println("\nAvaliando a fila circular\n" +
                FuncoesFila.imprimirFila());
        boolean erro = false;
        int execucoes = 0;

        do {
            try {
                if (execucoes < 4) {
                    System.out.println("Chamando " + FuncoesFila.remover());
                    System.out.println("\nAvaliando a fila circular\n" +
                            FuncoesFila.imprimirFila());
                    execucoes++;
                } else {
                    System.out.println("Adicionando Rodrigo");
                    FuncoesFila.inserir("Rodrigo");
                    System.out.println("\nAvaliando a fila circular\n" +
                            FuncoesFila.imprimirFila());
                    execucoes = 0;
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                erro = true;
            }
        } while (!erro);
    }

}
