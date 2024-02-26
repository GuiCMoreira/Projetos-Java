public class Lista {
    static String[] ranking = new String[10];

    public static void main(String[] args) throws Exception {
        
        ListaRegras.inserir("Abacaxi", ranking);
        ListaRegras.excluir("Abacaxi", ranking);
        ListaRegras.consulta("Abacaxi", ranking);

    }
}
