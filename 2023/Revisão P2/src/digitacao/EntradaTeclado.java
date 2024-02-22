package digitacao;

import java.util.Scanner;

public class EntradaTeclado {
  static Scanner tcl = new Scanner(System.in);

  public String texto(String mensagem) {

    System.out.println(mensagem);
    String dado = tcl.nextLine();

    return dado;
  }

  public int inteiro(String mensagem, String msgErro, boolean repetir) {

    int dado = 0;
    boolean erro = false;

    do {
      String aux = texto(mensagem);
      try {
        dado = Integer.parseInt(aux);
        erro = false;
      } catch (RuntimeException e) {
        System.out.println(msgErro);
        erro = repetir;
      }
    } while (erro == true);

    return dado;
  }

  public double decimal(String mensagem, String msgErro, boolean repetir) {

    double dado = 0;
    boolean erro = false;

    do {
      String aux = texto(mensagem);
      aux = aux.replaceAll(",", ".");
      try {
        dado = Double.parseDouble(aux);
        erro = false;
      } catch (RuntimeException e) {
        System.out.println(msgErro);
        erro = repetir;
      }
    } while (erro == true);

    return dado;
  }

}
