public class Exercicio1VT {
    public static void main(String[] args) throws Exception {

        String[] vt1 = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro" };

        System.out.println("-----------------------------------");
        System.out.println("Usando Foreach: ");
        System.out.println("-----------------------------------");
        for (String meses : vt1) {
            System.out.println(meses);

        }

        System.out.println("-----------------------------------");
        System.out.println("Usando For: ");
        System.out.println("-----------------------------------");

        for (int i = 0; i < vt1.length; i++) {
            System.out.println(vt1[i]);
        }

    }

}
