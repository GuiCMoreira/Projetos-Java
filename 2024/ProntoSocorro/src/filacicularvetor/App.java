package filacicularvetor;

import digitacao.EntradaTeclado;

public class App {

    public static EntradaTeclado tcl = new EntradaTeclado();

    public static void main(String[] args) {

        boolean tipoAtendimentoValido = false;
        boolean opcaoMenuValida = false;
        boolean sairMenu = false;
        int tipoAtendimento = 0;
        int opcaoMenu = 0;

        while (!sairMenu) {

            while (!opcaoMenuValida) {

                opcaoMenu = tcl.numeroInteiro("\nMENU\n1 - Adicionar\n2 - Chamar\n3 - Sair",
                        "INSIRA UM NÚMERO", true);

                if (opcaoMenu < 1 || opcaoMenu > 3) {
                    System.out.println("INSIRA UMA OPÇÃO VÁLIDA");
                } else {
                    opcaoMenuValida = true;
                }

            }

            switch (opcaoMenu) {
                case 1:

                    while (!tipoAtendimentoValido) {

                        tipoAtendimento = tcl.numeroInteiro(
                                "\nQual o tipo de atendimento?\n1 - Normal\n2 - Preferencial",
                                "INSIRA UM NÚMERO", true);

                        if (tipoAtendimento < 1 || tipoAtendimento > 2) {
                            System.out.println("INSIRA UMA OPÇÃO VÁLIDA");
                        } else {
                            tipoAtendimentoValido = true;
                        }

                    }

                    switch (tipoAtendimento) {
                        case 1:
                            String nomeNormal = tcl.texto("\nInsira seu nome: ");
                            try {
                                System.out.println("\nAdicionando " + nomeNormal + " a fila normal.");
                                FuncoesFilaNormal.inserir(nomeNormal);

                            } catch (RuntimeException e) {
                                System.out.println(e.getMessage());
                                System.out.printf("\n%s não foi inserido\n", nomeNormal);

                            }

                            break;

                        case 2:
                            String nomePreferencial = tcl.texto("\nInsira seu nome: ");
                            try {
                                System.out.println("\nAdicionando " + nomePreferencial + " a fila preferencial.");
                                FuncoesFilaPreferencial.inserir(nomePreferencial);

                            } catch (RuntimeException e) {
                                System.out.println(e.getMessage());
                                System.out.printf("\n%s não foi inserido\n", nomePreferencial);

                            }

                            break;
                    }

                    break;

                case 2:

                    break;

                case 3:
                    System.out.println("\nSaindo...");
                    sairMenu = true;
                    break;
            }

            tipoAtendimentoValido = false;
            opcaoMenuValida = false;
            tipoAtendimento = 0;
            opcaoMenu = 0;
        }

        /*
         * 
         * 
         * 
         * System.out.println("\nAvaliando a fila circular\n" +
         * FuncoesFila.imprimirFila());
         * boolean erro = false;
         * int execucoes = 0;
         * 
         * do {
         * try {
         * if (execucoes < 4) {
         * System.out.println("Chamando " + FuncoesFila.remover());
         * System.out.println("\nAvaliando a fila circular\n" +
         * FuncoesFila.imprimirFila());
         * execucoes++;
         * } else {
         * System.out.println("Adicionando Rodrigo");
         * FuncoesFila.inserir("Rodrigo");
         * System.out.println("\nAvaliando a fila circular\n" +
         * FuncoesFila.imprimirFila());
         * execucoes = 0;
         * }
         * } catch (RuntimeException e) {
         * System.out.println(e.getMessage());
         * erro = true;
         * }
         * } while (!erro);
         */

    }

}
