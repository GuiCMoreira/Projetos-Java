public class ListaRegras {

  public static void inserir(String dado, String vetor[]) {

    if (vetor[vetor.length - 1] == null ||
        Integer.parseInt(vetor[vetor.length - 1]) < Integer.parseInt(dado)) {
      vetor[vetor.length - 1] = dado;
    }

    reordenar(vetor);

    System.out.println("Inseri");

  }

  public static String excluir(String dado, String vetor[]) {

    System.out.println("Exclui.");
    return null;

  }

  public static boolean consulta(String dado, String vetor[]) {

    System.out.println("Consultei.");
    return false;

  }

  private static void reordenar(String vetor2[]) {

    for (byte pos = (byte) (vetor2.length - 1); pos > 0; pos--) {

      if (vetor2[pos - 1] == null || Integer.parseInt(vetor2[pos]) > Integer.parseInt(vetor2[pos - 1])) {

        String aux = vetor2[pos - 1];
        vetor2[pos - 1] = vetor2[pos];
        vetor2[pos] = aux;

      } else {
        break;
      }

    }

  }

}
