package hashcode;

public class Funcoes {

  private static String tabela[];
  private static int tamanho;

  public static void criar(int qtd) {
    int total = qtd * 2;
    while (!verificarPrimo(total)) {
      total++;
    }
    tamanho = total;
    tabela = new String[tamanho];
  }

  public static boolean verificarPrimo(int n1) {
    for (int i = 2; i < n1; i++) {
      if (n1 % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int fatorHash(int key) {
    return (key % tamanho);
  }

  public static void inserir(String valor) {
    int id = fatorHash(hashString(valor));
    while (true) {
      if (tabela[id] == null) {
        tabela[id] = valor;
        break;
      }
      id = fatorHash(id + 1);
    }
  }

  public static String busca(String valor) {
    int id = fatorHash(hashString(valor));
    while (true) {
      if (tabela[id] != null && tabela[id].equals(valor)) {
        return tabela[id];
      } else if (tabela[id] == null) {
        break;
      } else {
        id = fatorHash(id + 1);
      }
    }
    return null;
  }

  public static String[] exibirTabela() {
    return tabela;
  }

  public static int hashString(String str) {
    int hash = 0;
    hash = 31 * hash + (str == null ? 0 : str.hashCode());
    return hash;
  }

}
