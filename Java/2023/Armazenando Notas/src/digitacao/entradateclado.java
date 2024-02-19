package digitacao;

import java.util.Scanner;

public class EntradaTeclado {
  Scanner tcl = new Scanner(System.in);

  public String texto(String mensagem) {

    System.out.println(mensagem);
    String dado = tcl.nextLine();

    return dado;
  }

  public int numeroInteiro(String mensagem, String msgErro, boolean repetir) {

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

  public double numeroDecimal(String mensagem, String msgErro, boolean repetir) {

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

  public float numeroFloat(String mensagem, String msgErro, boolean repetir) {

    float dado = 0;
    boolean erro = false;

    do {
      String aux = texto(mensagem);
      aux = aux.replaceAll(",", ".");
      try {
        dado = Float.parseFloat(aux);
        erro = false;
      } catch (RuntimeException e) {
        System.out.println(msgErro);
        erro = repetir;
      }
    } while (erro == true);

    return dado;
  }

}
