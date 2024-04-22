package listaencadeada;

public class ListaEncadeada {

    private static Lista<Paciente> normal;
    private static Lista<Paciente> prioritario;

    public static void main(String[] args) throws Exception {
        normal.insert(new Paciente("João", 20));
        normal.insert(new Paciente("Gui", 29));
        prioritario.insert(new Paciente("Maria", 30));
    }
}
