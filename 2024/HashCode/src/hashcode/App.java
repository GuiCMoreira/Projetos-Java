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
            System.out.println("Posição " + i + ": " + valor);
        }

    }

}
