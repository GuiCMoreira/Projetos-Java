import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tcl = new Scanner(System.in);

        // 1 - Iniciar os vetores ou a matriz
        // 2 - Pedir os nomes dos jogadores
        // 3 - Determinar quem iniciará a jogada
        // 4 - Repetir as próximas etapas até ocorrer um vencedor ou empate
        // 4.1 - Iniciar quem deve jogar
        // 4.2 - Selecionar posicão
        // 4.3 - Verifiar se existe a posicao e se não está ocupada
        // 4.4 - Marcar posicao
        // 4.5 - Verificar se houve ganhador ou empate
        // 5 - Indicar o jogador vencedor ou o empate

        // Tabuleiro: \n\n A B C \n\n " + vt1[0] + " | " + vt1[1] + " | " + vt1[2] + "
        // 1\n ---|-----|--- \n " + vt2[0] + " | " + vt2[1] + " | " + vt2[2] + " 2\n
        // ---|-----|--- \n " + vt3[0] + " | " + vt3[1] + " | " + vt3[2] + " 3\n\n

        char[] vt1 = new char[3];
        char[] vt2 = new char[3];
        char[] vt3 = new char[3];

        vt1[0] = 'x';
        vt1[1] = 'x';
        vt1[2] = 'x';
        vt2[0] = 'x';
        vt2[1] = 'x';
        vt2[2] = 'x';
        vt3[0] = 'x';
        vt3[1] = 'x';
        vt3[2] = 'x';

        String jogador1 = JOptionPane.showInputDialog(null, "Insira o nome do jogador 1: ");
        String jogador2 = JOptionPane.showInputDialog(null, "Insira o nome do jogador 2: ");

        int quemComeca = Integer.parseInt(JOptionPane.showInputDialog(null, "Quem comecará o jogo? (1 ou 2)"));

        String coluna = JOptionPane.showInputDialog(null,
                "Em qual COLUNA você deseja jogar? \n\n A     B     C \n\n " + vt1[0] + "  |  " + vt1[1] + "  |  "
                        + vt1[2] + "      1\n ---|-----|--- \n " + vt2[0] + "  |  " + vt2[1] + "  |  " + vt2[2]
                        + "     2\n ---|-----|--- \n " + vt3[0] + "  |  " + vt3[1] + "  |  " + vt3[2] + "     3\n\n");
        String colunaUpper = coluna.toUpperCase();
        char colunaConvertida = colunaUpper.charAt(0);
        int joga1coluna = colunaConvertida - 65;

        String linha = JOptionPane.showInputDialog(null,
                "Em qual LINHA você deseja jogar? \n\n A     B     C \n\n " + vt1[0] + "  |  " + vt1[1] + "  |  "
                        + vt1[2] + "      1\n ---|-----|--- \n " + vt2[0] + "  |  " + vt2[1] + "  |  " + vt2[2]
                        + "     2\n ---|-----|--- \n " + vt3[0] + "  |  " + vt3[1] + "  |  " + vt3[2] + "     3\n\n");
        int joga1linha = Integer.parseInt(linha);

    }
}

// " + vt1[0] + "