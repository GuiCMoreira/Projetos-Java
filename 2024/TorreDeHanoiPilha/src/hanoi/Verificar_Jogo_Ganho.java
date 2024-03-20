package hanoi;

public class Verificar_Jogo_Ganho {
  
  static boolean verificarJogoGanho() {
    if (Torre_3.torre[0] == 5 && Torre_3.torre[1] == 4 && Torre_3.torre[2] == 3 && Torre_3.torre[3] == 2
        && Torre_3.torre[4] == 1) {
      System.out.println("Parabéns! Você completou a Torre de Hanói!");
      return true;
    } else {
      return false;
    }
  }

}
