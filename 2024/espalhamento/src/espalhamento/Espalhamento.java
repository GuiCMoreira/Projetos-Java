package espalhamento;

public class Espalhamento {

    public static void main(String[] args) {
        int qtd = 200;
        Hash.criar(qtd);
        int elementos = 0;
        while (elementos <= qtd){
            int valor = (int) (Math.random()* 1000);
            if (Hash.busca(valor) == 0){
                Hash.inserir(valor);
                elementos++;
            }
        }
        int[] t = Hash.retorno();
        int i = 0;
        for (int valor : t ) {
            System.out.print("indice-> " + (i++)  + " valor-> ");
            System.out.println(valor + " key-> " + (valor % t.length));
            
        }
    }
    
}
