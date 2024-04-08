package hashcode;

import digitacao.EntradaTeclado;

public class App {

    public static EntradaTeclado tcl = new EntradaTeclado();

    public static void main(String[] args) throws Exception {

        int qtd = tcl.numeroInteiro(
                "Quantidade de dados que serão inseridos: ",
                "Digite um número inteiro.", true);

        Funcoes.criar(qtd);

        boolean sair = false;
        while (!sair) {
            menu();

            int opcao = tcl.numeroInteiro("Digite uma opção: ", "Digite um número inteiro.", true);
            switch (opcao) {
                case 1:
                    String nome = tcl.texto("Digite um nome: ");

                    Funcoes.inserir(nome);
                    break;
                case 2:
                    String buscarNome = tcl.texto("Buscar nome: ");

                    if (Funcoes.busca(buscarNome) != null) {
                        System.out.println("Valor encontrado.");
                    } else {
                        System.out.println("Valor não encontrado.");
                    }
                    break;
                case 3:
                    imprimirTabela();
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1 - Inserir");
        System.out.println("2 - Buscar");
        System.out.println("3 - Exibir Tabela");
        System.out.println("4 - Sair");
    }

    public static void imprimirTabela() {
        String[] tabela = Funcoes.exibirTabela();
        for (int i = 0; i < tabela.length; i++) {
            System.out.println(i + " - " + tabela[i]);
        }
    }

}
