import digitacao.EntradaTeclado;

public class App {
    public static void main(String[] args) throws Exception {

        EntradaTeclado tcl = new EntradaTeclado();

        String nome = tcl.validarstring("Digite seu nome: ");

        int idade = tcl.validarinteiro("Digite sua idade: ", "Erro, digite um número inteiro", true);

        double altura = tcl.validardouble("Digite sua altura em metros: ", "Erro, digite um valor numérico", true);

    }
}
