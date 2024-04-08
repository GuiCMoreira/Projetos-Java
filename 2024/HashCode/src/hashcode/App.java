package hashcode;

import digitacao.EntradaTeclado;

public class App {

    public static EntradaTeclado tcl = new EntradaTeclado();

    public static void main(String[] args) throws Exception {

        int qtd = tcl.numeroInteiro(
                "\nQuantidade de dados que serão inseridos: ",
                "\nDigite um número inteiro.", true);

        Funcoes.criar(qtd);

        boolean sair = false;
        while (!sair) {
            menu();

            int opcao = tcl.numeroInteiro("\nDigite uma opção: ", "Digite um número inteiro.", true);
            switch (opcao) {
                case 1:
                    String nome = tcl.texto("\nDigite um nome: ");

                    Funcoes.inserir(nome);
                    break;
                case 2:
                    String buscarNome = tcl.texto("\nBuscar nome: ");

                    if (Funcoes.busca(buscarNome) != null) {
                        System.out.println("\nValor encontrado.");
                    } else {
                        System.out.println("\nValor não encontrado.");
                    }
                    break;
                case 3:
                    imprimirTabela();
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("\nOpção inválida.");
                    break;
            }
        }

    }

    public static void menu() {
        System.out.println("\nMenu");
        System.out.println("1 - Inserir");
        System.out.println("2 - Buscar");
        System.out.println("3 - Exibir Tabela");
        System.out.println("4 - Sair");
    }

    public static void imprimirTabela() {
        String[] tabela = Funcoes.exibirTabela();
        System.out.println("\nTabela Hash");
        for (int i = 0; i < tabela.length; i++) {
            System.out.println(i + " - " + tabela[i]);
        }
    }

}
