import java.util.Scanner;

public class gpt {

    public static void main(String[] args) {
        int numDiscos = 3;
        Torre[] torres = new Torre[3];
        for (int i = 0; i < 3; i++) {
            torres[i] = new Torre(i);
        }

        // Inicializa a torre inicial com os discos
        for (int i = numDiscos; i > 0; i--) {
            torres[0].adicionarDisco(new Disco(i));
        }

        Scanner scanner = new Scanner(System.in);
        int torreOrigem, torreDestino;

        while (!torres[2].torreCompleta(numDiscos)) {
            System.out.println("Torre 1: " + torres[0].toString());
            System.out.println("Torre 2: " + torres[1].toString());
            System.out.println("Torre 3: " + torres[2].toString());

            System.out.print("Escolha a torre de origem (1, 2 ou 3): ");
            torreOrigem = scanner.nextInt() - 1; // Ajusta para o índice do array

            System.out.print("Escolha a torre de destino (1, 2 ou 3): ");
            torreDestino = scanner.nextInt() - 1; // Ajusta para o índice do array

            if (torreOrigem < 0 || torreOrigem > 2 || torreDestino < 0 || torreDestino > 2) {
                System.out.println("Torres inválidas. Escolha entre 1, 2 ou 3.");
                continue;
            }

            if (torres[torreOrigem].estaVazia()) {
                System.out.println("A torre de origem está vazia. Escolha novamente.");
                continue;
            }

            Disco disco = torres[torreOrigem].removerDisco();
            if (!torres[torreDestino].adicionarDisco(disco)) {
                torres[torreOrigem].adicionarDisco(disco);
                System.out.println("Movimento inválido. Um disco maior não pode ser colocado sobre um disco menor.");
            }
        }

        System.out.println("Parabéns! Você completou a Torre de Hanói!");
        scanner.close();
    }
}

class Disco {
    private int tamanho;

    public Disco(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return String.valueOf(tamanho);
    }
}

class Torre {
    private int indice;
    private java.util.Stack<Disco> discos;

    public Torre(int indice) {
        this.indice = indice;
        discos = new java.util.Stack<>();
    }

    public boolean adicionarDisco(Disco disco) {
        if (!discos.isEmpty() && disco.getTamanho() >= discos.peek().getTamanho()) {
            return false;
        }
        discos.push(disco);
        return true;
    }

    public Disco removerDisco() {
        if (!discos.isEmpty()) {
            return discos.pop();
        }
        return null;
    }

    public boolean torreCompleta(int numDiscos) {
        return discos.size() == numDiscos && discos.peek().getTamanho() == 1;
    }

    public boolean estaVazia() {
        return discos.isEmpty();
    }

    @Override
    public String toString() {
        if (discos.isEmpty()) {
            return "Vazio";
        }
        StringBuilder sb = new StringBuilder();
        for (Disco disco : discos) {
            sb.append(disco.toString()).append(" ");
        }
        return sb.toString();
    }
}
