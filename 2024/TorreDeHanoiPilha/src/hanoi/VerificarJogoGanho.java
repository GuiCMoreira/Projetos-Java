package hanoi;

public class VerificarJogoGanho {

  static boolean verificarJogoGanho() {
    if (Torre3.torre[0] == 5 && Torre3.torre[1] == 4 && Torre3.torre[2] == 3 && Torre3.torre[3] == 2
        && Torre3.torre[4] == 1) {
      System.out.println("Parabéns! Você completou a Torre de Hanói!");
      return true;
    } else {
      return false;
    }
  }

}
