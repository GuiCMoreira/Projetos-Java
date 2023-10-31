package digitacao;

import java.util.Scanner;

public class entradateclado {

  Scanner tcl = new Scanner(System.in);

  public String texto(String msg) {
    System.out.println(msg);
    String dado = tcl.nextLine();
    return dado;
  }

  public double decimal(String msg) throws Exception {
    double dado = 0.0;
    String aux = texto(msg);
    aux = aux.replaceAll(",", ".");
    try {
      dado = Double.parseDouble(aux);
    } catch (Exception e) {
      throw new Exception("Erro de digitação");
    }
    return dado;

  }
}
