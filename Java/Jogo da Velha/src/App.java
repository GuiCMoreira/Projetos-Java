import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // 1 - Iniciar os vetores ou a matriz

        int[][] tabuleiro = new int[3][3];

        // 2 - Pedir os nomes dos jogadores

        InserirJogadores();

        // 3 - Determinar quem iniciará a jogada

        boolean jogador1jogar = false;
        double opcao = Math.random();
        if (opcao < 50.0) {
            jogador1jogar = true;
        } else {
            jogador1jogar = false;
        }

        // 4 - Repetir as próximas etapas até ocorrer um vencedor ou empate

        do {

            // 4.1 - Iniciar quem deve jogar

            if (jogador1jogar == true) {
                JOptionPane.showMessageDialog(null, "É a vez do " + jogador1jogar + " jogar", null, 0);
            }

            // 4.2 - Selecionar posicão

            jogada();

            // 4.3 - Verifiar se existe a posicao e se não está ocupada
            // 4.4 - Marcar posicao
            // 4.5 - Verificar se houve ganhador ou empate

        } while (true);

        // 5 - Indicar o jogador vencedor ou o empate

        // Tabuleiro: \n\n A B C \n\n " + vt1[0] + " | " + vt1[1] + " | " + vt1[2] + "
        // 1\n ---|-----|--- \n " + vt2[0] + " | " + vt2[1] + " | " + vt2[2] + " 2\n
        // ---|-----|--- \n " + vt3[0] + " | " + vt3[1] + " | " + vt3[2] + " 3\n\n

    }

    private static void jogada() {
        do {
            String posicao = JOptionPane.showInputDialog(null, "Em que posição deseja jogar?");

            char coluna = posicao.toUpperCase().charAt(0);
            char linha = posicao.toUpperCase().charAt(1);

            // Testa se a posição existe

            if (coluna < 'A' || coluna > 'C') {
                JOptionPane.showMessageDialog(null, "Essa coluna não existe");
                continue;
            }
            if (linha < 'A' || linha > 'C') {
                JOptionPane.showMessageDialog(null, "Essa linha não existe");
                continue;
            }
            if (tabuleiro[linha - 1][coluna - 65] != ' ') {
                JOptionPane.showMessageDialog(null, "Essa posição já está em uso");
                continue;
            }

            // Marcar a posição:
            if (jogador1jogar == true) {
                tabuleiro[linha - 1][coluna - 65] = 'o';
            } else {
                tabuleiro[linha - 1][coluna - 65] = 'x';
            }

            jogador1jogar = !jogador1jogar;
            break;
        } while (true);
    }

    private static void InserirJogadores() {

        do {
            String jogador1 = JOptionPane.showInputDialog(null, "Insira o nome do jogador 1: ");
            if (jogador1 != "") {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, insira seu nome");
            }
        } while (true);
        do {
            String jogador2 = JOptionPane.showInputDialog(null, "Insira o nome do jogador 2: ");
            if (jogador2 != "") {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, insira seu nome");
            }
        } while (true);

    }

    private static void RestoDoCodigo() {

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