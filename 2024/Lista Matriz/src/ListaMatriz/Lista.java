package ListaMatriz;
public class Lista {

  static final int colNome = 0;
  static int colQuantidade = 0;

  public static boolean estaCheia(String[][] matriz) {
    int vazios = 0;
    for (int linha = 0; linha < matriz.length; linha++) {
      if (matriz[linha][colNome] == null) {
        vazios++;
      }
    }
    return vazios == 0 ? true : false;
  }

  public static boolean estaVazia(String[][] matriz) {
    return true;
  }

  public static void inserir(String nome, int quantidade, String[][] matriz) {
    if (!estaCheia(matriz)) {
      for (int linha = 0; linha < matriz.length; linha++) {
        if (matriz[linha][colNome] == null) {
          matriz[linha][colNome] = nome;
          matriz[linha][colQuantidade] = "" + quantidade;
          break;
        }
      }
    }
  }

  public static String[] chamar(int lugares, String[][] matriz) {
    if (!estaVazia(matriz)) {
      for (int linha = 0; linha < matriz.length; linha++) {
        if (Integer.parseInt(matriz[linha][colQuantidade]) == lugares) {
          String[] aux = matriz[linha];
          matriz[linha][colNome] = null;
          return aux;
        }
      }
    }
    return null;
  }

  public static String exibir(String[][] matriz) {
    String lista = "";
    for (int linha = 0; linha < matriz.length; linha++) {
      lista += matriz[linha][colNome] + " = " + matriz[linha][colQuantidade] + "\n";
    }
    return lista;
  }

}
