package hashcode;

import digitacao.EntradaTeclado;

public class App {

    public static EntradaTeclado tcl = new EntradaTeclado();
    
    public static void main(String[] args) throws Exception {

        int qtd = 200;
        Funcoes.criar(qtd);
        int elementos = 0;

        while (elementos <= qtd) {
            int valor = (int) (Math.random() * 1000);
            if (Funcoes.busca(valor) == 0) {
                Funcoes.inserir(valor);
                elementos++;
            }
        }

        int[] tabela = Funcoes.exibirTabela();
        int i = 0;
        for (int valor : tabela) {
            System.out.print("indice-> " + (i++) + " valor-> ");
            System.out.println(valor + " key-> " + (valor % tabela.length));
        }

        int teste = tcl.numeroInteiro("Digite um número: ", "Digite um número inteiro.", true);
        
        System.out.println("Buscando valor " + teste + "...");

        if (Funcoes.busca(teste) != 0) {
            System.out.println("Valor encontrado.");
        } else {
            System.out.println("Valor não encontrado.");
        }

    }

}
