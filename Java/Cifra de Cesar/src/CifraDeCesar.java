import java.util.Scanner;

public class CifraDeCesar {
  public static void main(String[] args) {
    Scanner tcl = new Scanner(System.in);

    // Receber uma frase e deslocar X quantidades de acordo com o usuário:

    System.out.println("Escreva uma frase: ");
    String frase = tcl.nextLine();
    System.out.println("Quantas casas você deseja deslocar essa frase?");
    int desloc = tcl.nextInt();

    // Modificando a frase:

    for (int i = 0; i < frase.length(); i++) {
      char novaletra = (char) (frase.charAt(i) + desloc);
      System.out.print(novaletra);
    }
    System.out.println("");

    tcl.close();
  }
}
