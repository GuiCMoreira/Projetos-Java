package hanoi;

public class ImprimirJogo {

  static void imprimirJogo() {
    System.out.println("\nTorre 1: Torre 2: Torre 3:");
    System.out.println("   " + Torre1.torre[4] + "        " + Torre2.torre[4] + "        " + Torre3.torre[4]);
    System.out.println("   " + Torre1.torre[3] + "        " + Torre2.torre[3] + "        " + Torre3.torre[3]);
    System.out.println("   " + Torre1.torre[2] + "        " + Torre2.torre[2] + "        " + Torre3.torre[2]);
    System.out.println("   " + Torre1.torre[1] + "        " + Torre2.torre[1] + "        " + Torre3.torre[1]);
    System.out.println("   " + Torre1.torre[0] + "        " + Torre2.torre[0] + "        " + Torre3.torre[0] + "\n");
  }

}
