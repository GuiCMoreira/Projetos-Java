import java.util.Scanner;

public class CifraDeCesarAT {
  public static void main(String[] args) {
    Scanner tcl = new Scanner(System.in);

    String frase1 = "";
    int desloc = 0;

    System.out.println("Insira a frase que será criptografada: ");
    frase1 = tcl.nextLine();

    System.out.println("Insira o deslocamento: ");
    desloc = tcl.nextInt();
    tcl.nextLine();

    for (int i = 0; i < frase1.length(); i++) {
      char frasemod = (char) (frase1.charAt(i));

      if (frasemod >= 'A' && frasemod <= 'Z') {
        frasemod = (char) ('A' + (frasemod - 'A' + desloc) % 26);
        if (frasemod < 'A') {
          frasemod += 26;
        }
      } else if (frasemod >= 'a' && frasemod <= 'z') {
        frasemod = (char) ('a' + (frasemod - 'a' + desloc) % 26);
        if (frasemod < 'a') {
          frasemod += 26;
        }
      } else if (frasemod >= '0' && frasemod <= '9') {
        int dig = frasemod - '0';
        dig = ((dig + desloc) + 10) % 10;
        frasemod = (char) ('0' + dig);
      }
      System.out.print(frasemod);
    }
  }
}
