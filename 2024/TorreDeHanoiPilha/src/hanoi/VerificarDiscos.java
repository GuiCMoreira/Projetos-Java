package hanoi;

public class VerificarDiscos {

  static boolean verificarDiscos(int origem, int destino) {
    int discoTorreOrigem = 0;
    int discoTorreDestino = 0;

    switch (origem) {
      case 1:
        switch (destino) {
          case 1:
            if (Torre1.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre1.consultaTop();
              discoTorreDestino = Torre1.consultaTop();

              if (discoTorreOrigem > discoTorreDestino) {
                return false;
              } else {
                return true;
              }
            }

          case 2:
            if (Torre2.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre1.consultaTop();
              discoTorreDestino = Torre2.consultaTop();

              if (discoTorreOrigem > discoTorreDestino) {
                return false;
              } else {
                return true;
              }
            }

          case 3:
            if (Torre3.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre1.consultaTop();
              discoTorreDestino = Torre3.consultaTop();

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
            if (Torre1.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre2.consultaTop();
              discoTorreDestino = Torre1.consultaTop();

              if (discoTorreOrigem > discoTorreDestino) {
                return false;
              } else {
                return true;
              }
            }

          case 2:
            if (Torre2.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre2.consultaTop();
              discoTorreDestino = Torre2.consultaTop();

              if (discoTorreOrigem > discoTorreDestino) {
                return false;
              } else {
                return true;
              }
            }

          case 3:
            if (Torre3.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre2.consultaTop();
              discoTorreDestino = Torre3.consultaTop();

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
            if (Torre1.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre3.consultaTop();
              discoTorreDestino = Torre1.consultaTop();

              if (discoTorreOrigem > discoTorreDestino) {
                return false;
              } else {
                return true;
              }
            }

          case 2:
            if (Torre2.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre3.consultaTop();
              discoTorreDestino = Torre2.consultaTop();

              if (discoTorreOrigem > discoTorreDestino) {
                return false;
              } else {
                return true;
              }
            }

          case 3:
            if (Torre3.estaVazia()) {
              return true;
            } else {
              discoTorreOrigem = Torre3.consultaTop();
              discoTorreDestino = Torre3.consultaTop();

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
