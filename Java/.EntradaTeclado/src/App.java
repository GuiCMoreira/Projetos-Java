import digitacao.EntradaTeclado;

public class App {
    public static void main(String[] args) throws Exception {

        EntradaTeclado tcl = new EntradaTeclado();

        String nome = tcl.texto("Digite seu nome: ");

        int idade = tcl.numeroInteiro("Digite sua idade: ", "Erro, digite um número inteiro", true);

        double altura = tcl.numeroDecimal("Digite sua altura em metros: ", "Erro, digite um valor numérico", true);

        float tamanhoPe = tcl.numeroFloat("Digite o tamanho do seu pé em centímetros: ",
                "Erro, digite um valor numérico", true);

    }
}
