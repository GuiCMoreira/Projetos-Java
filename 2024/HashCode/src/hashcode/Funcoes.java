package hashcode;

public class Funcoes {

  private static int tabela[];
  private static int tamanho;

  public static void criar(int qtd) {
    int total = qtd * 2;
    while (!verificarPrimo(total)) {
      total++;
    }
    tamanho = total;
    tabela = new int[tamanho];
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

  public static void inserir(int valor) {
    int id = fatorHash(valor);
    while (true) {
      if (tabela[id] == 0) {
        tabela[id] = valor;
        break;
      }
      id = fatorHash(id + 1);
    }
  }

  public static int busca(int valor) {
    int id = fatorHash(valor);
    while (true) {
      if (tabela[id] == valor) {
        return tabela[id];
      } else if (tabela[id] == 0) {
        break;
      } else {
        id = fatorHash(id + 1);
      }
    }
    return 0;
  }

  public static int[] exibirTabela() {
    return tabela;
  }

}
