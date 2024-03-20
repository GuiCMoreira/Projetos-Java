package hanoi;

public class Imprimir_Jogo {

  static void imprimirJogo() {
    System.out.println("\nTorre 1: Torre 2: Torre 3:");
    System.out.println("   " + Torre_1.torre[4] + "        " + Torre_2.torre[4] + "        " + Torre_3.torre[4]);
    System.out.println("   " + Torre_1.torre[3] + "        " + Torre_2.torre[3] + "        " + Torre_3.torre[3]);
    System.out.println("   " + Torre_1.torre[2] + "        " + Torre_2.torre[2] + "        " + Torre_3.torre[2]);
    System.out.println("   " + Torre_1.torre[1] + "        " + Torre_2.torre[1] + "        " + Torre_3.torre[1]);
    System.out.println("   " + Torre_1.torre[0] + "        " + Torre_2.torre[0] + "        " + Torre_3.torre[0] + "\n");
  }

}
