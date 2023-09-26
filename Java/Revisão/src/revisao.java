public class revisao {

    // Como declarar cada tipo de variável:

    // Números inteiros
    static int x = 0;

    // Decimais
    static double d = 10.5;

    // Float necessita do f no final
    static float f = 10.5f;

    // Char precisa das aspas simples
    static char c = 'd';

    // String com S maiúsculo e aspas duplas
    static String s = "Guizin Carvalho";

    // Como declarar um vetor de 10 posições
    static String[] g = new String[10];

    public static void main(String[] args) throws Exception {

        // Separei a String s em um vetor usando CharAt e peguei a posição 3 desse vetor
        // e atribuí á variável c:
        c = s.charAt(3);

        // Split é para separar a string, aqui estou usando o espaço para segapar o
        // Guizin do Carvalho e cada nome será armazenando em uma posição do vetor
        String[] g = s.split(" ");

        // Abaixo o vetor g será recriado
        g = new String[8];

        // Declarando um vetor já com os elementos definidos em String e int:
        String[] vet = { "10", "20", "30", "40" };
        int[] vet2 = { 1, 2, 3, 4 };

        // Imprimindo vetores:
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }

        for (int i = 0; i < vet2.length; i++) {
            System.out.println(vet2[i]);
        }

        // Vet2 (inteiros) está recebendo os valores de vet (string) convertidos em int
        vet2[0] = Integer.parseInt(vet[0]);

    }

    // Criando uma função e puxando vet e vet2 para dentro dela
    static void teste(int[] a, String[] b) {
        for (int a = 0; a < g.length; a++) {
            for (int b = 0; b < g.length; b++) {

            }
        }
    }

    // Tambem é possível declarar uma variável no final do programa, porém não
    // recomendável
    static long l = 1;

}