package hashcode;

public class Funcoes {

  static int tabela[] = new int[10];
  static int tamanho = 10;

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

  public static boolean busca(int valor) {
    int id = fatorHash(valor);
    while (true) {
        if (tabela[id] == valor) {
            return true;
        } else if (tabela[id] == 0) {
            return false;
        } else {
            id = fatorHash(id+1);
        }
    }
  }
  
}
