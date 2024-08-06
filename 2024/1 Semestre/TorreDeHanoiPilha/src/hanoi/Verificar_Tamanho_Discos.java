package hanoi;

public class Verificar_Tamanho_Discos {

  static boolean verificarDiscos(int origem, int destino) {
    int discoTorreOrigem = 0;
    int discoTorreDestino = 0;

    switch (origem) {
      case 1:
        switch (destino) {
          case 1:
            if (Torre_1.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre_1.consultaTop();
              discoTorreDestino = Torre_1.consultaTop();

              if (discoTorreOrigem > discoTorreDestino) {
                return false;
              } else {
                return true;
              }
            }

          case 2:
            if (Torre_2.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre_1.consultaTop();
              discoTorreDestino = Torre_2.consultaTop();

              if (discoTorreOrigem > discoTorreDestino) {
                return false;
              } else {
                return true;
              }
            }

          case 3:
            if (Torre_3.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre_1.consultaTop();
              discoTorreDestino = Torre_3.consultaTop();

              if (discoTorreOrigem > discoTorreDestino) {
                return false;
              } else {
                return true;
              }
            }

        }
        break;
      case 2:
        switch (destino) {
          case 1:
            if (Torre_1.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre_2.consultaTop();
              discoTorreDestino = Torre_1.consultaTop();

              if (discoTorreOrigem > discoTorreDestino) {
                return false;
              } else {
                return true;
              }
            }

          case 2:
            if (Torre_2.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre_2.consultaTop();
              discoTorreDestino = Torre_2.consultaTop();

              if (discoTorreOrigem > discoTorreDestino) {
                return false;
              } else {
                return true;
              }
            }

          case 3:
            if (Torre_3.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre_2.consultaTop();
              discoTorreDestino = Torre_3.consultaTop();

              if (discoTorreOrigem > discoTorreDestino) {
                return false;
              } else {
                return true;
              }
            }

        }
        break;
      case 3:
        switch (destino) {
          case 1:
            if (Torre_1.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre_3.consultaTop();
              discoTorreDestino = Torre_1.consultaTop();

              if (discoTorreOrigem > discoTorreDestino) {
                return false;
              } else {
                return true;
              }
            }

          case 2:
            if (Torre_2.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre_3.consultaTop();
              discoTorreDestino = Torre_2.consultaTop();

              if (discoTorreOrigem > discoTorreDestino) {
                return false;
              } else {
                return true;
              }
            }

          case 3:
            if (Torre_3.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre_3.consultaTop();
              discoTorreDestino = Torre_3.consultaTop();

              if (discoTorreOrigem > discoTorreDestino) {
                return false;
              } else {
                return true;
              }
            }

        }
        break;
    }
    return true;
  }

}
