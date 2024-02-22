import java.util.Scanner;

public class Aulinha {

  static final float pi = 3.1415f;
  static String nome1 = "fatec";
  static String nome2 = "fatec";

  public static void main(String[] args) {
    Scanner tcl = new Scanner(System.in);

    // Comparando endereços
    if (nome1 == nome2) {
      System.out.println("Estes endereços são iguais");
    } else {
      System.out.println("Estes endereços são diferentes");
    }

    // Recebendo os valores das variáveis
    System.out.println("Digite um nome: ");
    String nome1 = tcl.nextLine();
    System.out.println("Digite outro nome: ");
    String nome2 = tcl.nextLine();

    // Compara valores de um variável string
    if (nome1.equals(nome2)) {
      System.out.println("Estes valores são iguais");
    } else {
      System.out.println("Estes valores são diferentes");
    }

    // Ignora caixa alta nos valores
    if (nome1.equalsIgnoreCase(nome2)) {
      System.out.println("Estes valores são iguais");
    } else {
      System.out.println("Estes valores são diferentes");
    }

    // Obter tamanho de uma string
    System.out.println("A variável nome1 tem tamanho: " + nome1.length());

    // Imprimir letra por letra de uma string
    for (int i = 0; i < nome1.length(); i++) {
      System.out.println("Letra: " + nome1.charAt(i));
    }

    // Imprimir palavra por palavra de uma string
    String[] aux = nome1.split(" ");
    for (String palavra : aux) {
      System.out.println("A palavra é: " + palavra);
    }

    // Substituição
    nome1 = nome1.replaceAll("a", "2023");
    System.out.println("Troca: " + nome1);

    // Mostrar letras e códigos numéricos correspondentes
    for (int i = (int) 'A'; i <= 128; i++) {
      System.out.println(i + "->" + (char) i);
    }

  }
}
