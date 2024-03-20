package hanoi;

public class Movimento {

  static void movimento() {
    boolean movimentoValido = false;
    int origem = 0;
    int destino = 0;
    do {
      origem = App.tcl.numeroInteiro("Você deseja mover o disco de cima de qual torre?",
          "Digite um número inteiro!", true);
      if (origem == 1 || origem == 2 || origem == 3) {
        movimentoValido = true;
      } else {
        System.out.println("Essa torre não existe! Escolha uma torre válida");
      }
    } while (!movimentoValido);

    movimentoValido = false;
    do {
      destino = App.tcl.numeroInteiro("Você deseja mover o disco para cima de qual torre?",
          "Digite um número inteiro!", true);
      if (destino == 1 || destino == 2 || destino == 3) {
        movimentoValido = true;
      } else {
        System.out.println("Essa torre não existe! Escolha uma torre válida");
      }
    } while (!movimentoValido);

    switch (origem) {
      case 1:
        if (Torre1.estaVazia()) {
          System.out.println("Torre de origem vazia, escolha outra.");
          break;
        } else {
          switch (destino) {
            case 1:
              if (!VerificarDiscos.verificarDiscos(1, 1)) {
                System.out.println("Não é possível colocar um disco maior em cima de um menor.");
                break;
              } else {
                int discoTorre1 = Torre1.desempilha();
                Torre1.empilhar(discoTorre1);
                break;
              }
            case 2:
              if (!VerificarDiscos.verificarDiscos(1, 2)) {
                System.out.println("Não é possível colocar um disco maior em cima de um menor.");
                break;
              } else {
                int discoTorre1 = Torre1.desempilha();
                Torre2.empilhar(discoTorre1);
                break;
              }
            case 3:
              if (!VerificarDiscos.verificarDiscos(1, 3)) {
                System.out.println("Não é possível colocar um disco maior em cima de um menor.");
                break;
              } else {
                int discoTorre1 = Torre1.desempilha();
                Torre3.empilhar(discoTorre1);
                break;
              }
          }
          break;
        }
      case 2:
        if (Torre2.estaVazia()) {
          System.out.println("Torre de origem vazia, escolha outra.");
          break;
        } else {
          switch (destino) {
            case 1:
              if (!VerificarDiscos.verificarDiscos(2, 1)) {
                System.out.println("Não é possível colocar um disco maior em cima de um menor.");
                break;
              } else {
                int discoTorre2 = Torre2.desempilha();
                Torre1.empilhar(discoTorre2);
                break;
              }
            case 2:
              if (!VerificarDiscos.verificarDiscos(2, 2)) {
                System.out.println("Não é possível colocar um disco maior em cima de um menor.");
                break;
              } else {
                int discoTorre2 = Torre2.desempilha();
                Torre2.empilhar(discoTorre2);
                break;
              }
            case 3:
              if (!VerificarDiscos.verificarDiscos(2, 3)) {
                System.out.println("Não é possível colocar um disco maior em cima de um menor.");
                break;
              } else {
                int discoTorre2 = Torre2.desempilha();
                Torre3.empilhar(discoTorre2);
                break;
              }
          }
          break;
        }
      case 3:
        if (Torre3.estaVazia()) {
          System.out.println("Torre de origem vazia, escolha outra.");
          break;
        } else {
          switch (destino) {
            case 1:
              if (!VerificarDiscos.verificarDiscos(3, 1)) {
                System.out.println("Não é possível colocar um disco maior em cima de um menor.");
                break;
              } else {
                int discoTorre3 = Torre3.desempilha();
                Torre1.empilhar(discoTorre3);
                break;
              }
            case 2:
              if (!VerificarDiscos.verificarDiscos(3, 2)) {
                System.out.println("Não é possível colocar um disco maior em cima de um menor.");
                break;
              } else {
                int discoTorre3 = Torre3.desempilha();
                Torre2.empilhar(discoTorre3);
                break;
              }
            case 3:
              if (!VerificarDiscos.verificarDiscos(3, 3)) {
                System.out.println("Não é possível colocar um disco maior em cima de um menor.");
                break;
              } else {
                int discoTorre3 = Torre3.desempilha();
                Torre3.empilhar(discoTorre3);
                break;
              }
          }
          break;
        }
    }
  }

}
