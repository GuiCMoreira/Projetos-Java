package hashcode;

public class Funcoes {

  private static String tabela[];
  private static int tamanho;
  private static int qtdElementos;

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
    return (key & 0x7FFFFFFF) % tamanho;
  }

  public static void inserir(String valor) {
    if ((double) qtdElementos / tamanho > 0.7) {
      redimensionar();
    }

    int id = fatorHash(hashString(valor));
    boolean inserido = false;

    while (!inserido) {
      if (tabela[id] == null) {
        tabela[id] = valor;
        inserido = true;
        qtdElementos++;
        System.out.println("\n" + valor + " inserido na tabela.");
      } else if (tabela[id].equals(valor)) {
        System.out.println("\n" + valor + " já existe na tabela. Não foi possível inserir.");
        inserido = true;
      } else {
        id = fatorHash(id + 1);
      }
    }
  }

  public static int busca(String valor) {
    int id = fatorHash(hashString(valor));
    int tentativas = 0;

    while (tabela[id] != null && tentativas < tamanho) {
      if (tabela[id].equals(valor)) {
        return id;
      }
      id = fatorHash(id + 1);
      tentativas++;
    }
    return -1;
  }

  public static String[] exibirTabela() {
    return tabela;
  }

  public static int hashString(String str) {
    int hash = 0;
    hash = 31 * hash + (str == null ? 0 : str.hashCode());
    return hash;
  }

  // Método para redimensionar a tabela
  private static void redimensionar() {
    int novoTamanho = tamanho * 2; // Aumenta o tamanho da tabela para o dobro
    while (!verificarPrimo(novoTamanho)) {
      novoTamanho++;
    }

    String[] novaTabela = new String[novoTamanho];

    // Re-insere todos os elementos na nova tabela
    for (String elemento : tabela) {
      if (elemento != null) {
        int novoId = fatorHash(hashString(elemento));
        while (novaTabela[novoId] != null) {
          novoId = fatorHash(novoId + 1);
        }
        novaTabela[novoId] = elemento;
      }
    }

    tabela = novaTabela; // Atualiza a referência da tabela antiga para a nova
    tamanho = novoTamanho; // Atualiza o tamanho da tabela
  }
  
}
