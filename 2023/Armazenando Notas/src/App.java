import digitacao.EntradaTeclado;

public class App {

    private static String[] alunos = new String[2];
    private static double[][] notas = new double[2][3];

    public static void main(String[] args) throws Exception {
        EntradaTeclado tcl = new EntradaTeclado();

        for (int a = 0; a < alunos.length; a++) {

            String nome = tcl.texto("Digite o nome do aluno: ");

            for (int i = 0; i < notas[a].length; i++) {

                double nota = tcl.numeroDecimal("Digite a nota " + (i + 1) + " do aluno: ", "Digite um valor numérico", true);

                notas[a][i] = nota;

            }
            alunos[a] = nome;
        }
    }
}
