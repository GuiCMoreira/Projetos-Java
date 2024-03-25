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

                    switch (tipoAtendimento) {
                        case 1:
                            String nomeNormal = tcl.texto("\nInsira seu nome: ");
                            try {
                                System.out.println("\n" + nomeNormal + " ADICIONADO A FILA NORMAL.");
                                FuncoesFilaNormal.inserir(nomeNormal);

                            } catch (RuntimeException e) {
                                System.out.println(e.getMessage());
                                System.out.printf("\n%s não foi inserido\n", nomeNormal);

                            }
                            break;

                        case 2:
                            String nomePreferencial = tcl.texto("\nInsira seu nome: ");
                            try {
                                System.out.println("\n" + nomePreferencial + " ADICIONADO A FILA PREFERENCIAL.");
                                FuncoesFilaPreferencial.inserir(nomePreferencial);

                            } catch (RuntimeException e) {
                                System.out.println(e.getMessage());
                                System.out.printf("\n%s não foi inserido\n", nomePreferencial);

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
