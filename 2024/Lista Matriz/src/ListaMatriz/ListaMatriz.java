package listamatriz;

public class ListaMatriz {
    public static void main(String[] args) throws Exception {

        String[][] espera = new String[10][2];

        System.out.println("Lista vazia: ");
        System.out.println(Lista.exibir(espera));

        Lista.inserir("Gui", 2, espera);
        Lista.inserir("Mafe", 4, espera);
        Lista.inserir("Jão", 1, espera);
        Lista.inserir("Luciano", 7, espera);
        Lista.inserir("Paloma", 3, espera);
        Lista.inserir("Nicolas", 2, espera);
        Lista.inserir("Gabriel", 9, espera);

        System.out.println("Lista depois de inserir as pessoas: ");
        System.out.println(Lista.exibir(espera));

        var chamando = Lista.chamar(4, espera);

        System.out.println("Chamando pessoa que reservou 4 lugares: ");
        System.out.println("Chamando " + chamando[0]);

        System.out.println(Lista.exibir(espera));

        System.out.println("Inserindo uma nova pessoa no lugar da pessoa que chamei anteriormente: ");
        Lista.inserir("Gab", 7, espera);
        System.out.println(Lista.exibir(espera));


    }

}
