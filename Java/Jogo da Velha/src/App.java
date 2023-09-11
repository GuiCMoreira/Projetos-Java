import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tcl = new Scanner(System.in);

        char[][] mt1 = new char[3][3];

        String jogador1 = JOptionPane.showInputDialog(null, "Insira o nome do jogador 1: ");
        String jogador2 = JOptionPane.showInputDialog(null, "Insira o nome do jogador 2: ");

        String coluna = JOptionPane.showInputDialog(null, "Em qual coluna você deseja jogar?");
        String colunaUpper = coluna.toUpperCase();
        char colunaConvertida = colunaUpper.charAt(0);
        int joga1coluna = colunaConvertida - 65;

        String linha = JOptionPane.showInputDialog(null, "Em que linha você deseja jogar?");
        int joga1linha = Integer.parseInt(linha);

        for (int i = 0; i < mt1.length; i++) {
            for (int j = 0; j < mt1.length; j++) {

            }
        }

    }
}
