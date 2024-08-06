package filacicularvetor;

import digitacao.EntradaTeclado;

public class App {

    public static EntradaTeclado tcl = new EntradaTeclado();

    public static void main(String[] args) {

        boolean sairMenu = false;
        int tipoAtendimento = 0;
        int opcaoMenu = 0;

        while (!sairMenu) {

            opcaoMenu = tcl.numeroInteiro("\nMENU\n1 - Adicionar\n2 - Chamar\n3 - Exibir Fila\n4 - Sair",
                    "INSIRA UM NÚMERO", true);

            switch (opcaoMenu) {
                case 1:
                    tipoAtendimento = tcl.numeroInteiro(
                            "\nQual o tipo de atendimento?\n1 - Normal\n2 - Preferencial",
                            "INSIRA UM NÚMERO", true);

                    String nome = tcl.texto("\nInsira seu nome: ");

                    switch (tipoAtendimento) {
                        case 1:
                            if (!FuncoesFilaNormal.estaCheia()) {
                                FuncoesFilaNormal.inserir(nome);
                                System.out.println("\n" + nome + " ADICIONADO A FILA NORMAL.");
                            } else {
                                System.out.printf("\nFILA NORMAL CHEIA\n");
                                System.out.printf("\n%s NÃO FOI INSERIDO\n", nome);
                            }
                            break;

                        case 2:
                            if (!FuncoesFilaPreferencial.estaCheia()) {
                                FuncoesFilaPreferencial.inserir(nome);
                                System.out.println("\n" + nome + " ADICIONADO A FILA PREFERENCIAL.");
                            } else if (!FuncoesFilaNormal.estaCheia()) {
                                FuncoesFilaNormal.inserir(nome);
                                System.out.printf("\nFILA PREFERENCIAL CHEIA\n");
                                System.out.println("\n" + nome + " ADICIONADO A FILA NORMAL.");
                            } else {
                                System.out.printf("\nFILAS CHEIAS\n");
                                System.out.printf("\n%s NÃO FOI INSERIDO\n", nome);
                            }
                            break;

                        default:
                            System.out.println("INSIRA UMA OPÇÃO VÁLIDA.");
                            break;

                    }
                    break;

                case 2:
                    if (!FuncoesFilaPreferencial.estaVazia()) {
                        System.out.println("\nChamando " + FuncoesFilaPreferencial.remover());
                        break;
                    }
                    if (!FuncoesFilaNormal.estaVazia()) {
                        System.out.println("\nChamando " + FuncoesFilaNormal.remover());
                        break;
                    } else {
                        System.out.println("\nFILAS VAZIAS");
                    }
                    break;

                case 3:
                    System.out.println("\nExibindo fila preferencial: \n" +
                            FuncoesFilaPreferencial.imprimirFila());

                    System.out.println("\nExibindo fila normal: " + "\n"
                            + FuncoesFilaNormal.imprimirFila());
                    break;

                case 4:
                    System.out.println("\nSaindo...");
                    sairMenu = true;
                    break;

                default:
                    System.out.println("INSIRA UMA OPÇÃO VÁLIDA.");
                    break;
            }

            tipoAtendimento = 0;
            opcaoMenu = 0;
        }

    }

}
