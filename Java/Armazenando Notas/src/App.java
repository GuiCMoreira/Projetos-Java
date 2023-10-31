import digitacao.entradateclado;

public class App {

    private static String[] alunos = new String[2];
    private static double[][] notas = new double[2][3];
    private static double[] medias = new double[2];

    public static void main(String[] args) throws Exception {
        entradateclado tcl = new entradateclado();

        for (int a = 0; a < alunos.length; a++) {

            String nome = tcl.texto("Digite o nome do aluno: ");

            for (int i = 0; i < notas[a].length; i++) {

                double nota = 0;
                boolean erro = false;

                do {
                    try {
                        nota = tcl.decimal("Digite a nota " + (i + 1) + " do aluno: ");
                        erro = false;
                    } catch (Exception e) {
                        erro = true;
                        System.out.println("Digite um valor numérico");
                    }
                } while (erro == true);

                notas[a][i] = nota;

            }
            alunos[a] = nome;
        }
    }
}
