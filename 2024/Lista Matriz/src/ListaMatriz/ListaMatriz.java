package listamatriz;

public class ListaMatriz {
    public static void main(String[] args) throws Exception {

        String[][] espera = new String[10][2];
        System.out.println(Lista.exibir(espera));
        
        Lista.inserir("Gui", 3, espera);
        System.out.println(Lista.exibir(espera));

    }

}
