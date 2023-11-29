public class App {
    public static String[][] matriz = new String[3][6];

    public static void main(String[] args) throws Exception {
        matriz[0][0] = "Guilherme";
        matriz[0][1] = "1240";
        matriz[0][2] = "2104";
        matriz[0][3] = "2985";

        matriz[1][0] = "Maria";
        matriz[1][1] = "4652";
        matriz[1][2] = "4970";
        matriz[1][3] = "5890";

        matriz[2][0] = "Fernanda";
        matriz[2][1] = "7230";
        matriz[2][2] = "8980";
        matriz[2][3] = "7869";

        calcularMedia();
        String mediaTotal = calcularMediaTotal();
        porcentagem(mediaTotal);
        imprimirMatriz(mediaTotal);
    }

    public static void calcularMedia() {
        for (int i = 0; i < matriz.length; i++) {
            double venda1 = Double.parseDouble(matriz[i][1]);
            double venda2 = Double.parseDouble(matriz[i][2]);
            double venda3 = Double.parseDouble(matriz[i][3]);
            double media = (venda1 + venda2 + venda3) / 3;

            String mediaConvertida = String.valueOf(media);
            matriz[i][4] = mediaConvertida;
        }
    }

    public static String calcularMediaTotal() {
        double venda1 = Double.parseDouble(matriz[0][4]);
        double venda2 = Double.parseDouble(matriz[1][4]);
        double venda3 = Double.parseDouble(matriz[2][4]);

        double media = (venda1 + venda2 + venda3) / 3;
        String mediaConvertida = String.valueOf(media);

        return mediaConvertida;
    }

    public static void porcentagem(String mediaTotal) {
        double mediaTotalConvertida = Double.parseDouble(mediaTotal);

        for (int i = 0; i < matriz.length; i++) {
            double mediaVendedor = Double.parseDouble(matriz[i][4]);
            double porc = 0;
            if (mediaVendedor > mediaTotalConvertida) {
                porc = ((mediaVendedor / mediaTotalConvertida) - 1) * 100;
            } else {
                porc = (mediaVendedor / mediaTotalConvertida) * 100;
            }

            String porcentagem = String.valueOf(porc);
            matriz[i][5] = porcentagem;
        }
    }

    public static void imprimirMatriz(String mediaTotal) {
        System.out.println("====================================");
        System.out.println("Média Total: " + mediaTotal);
        System.out.println("====================================");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Nome: " + matriz[i][0]);
            System.out.println("Vendas 1: " + matriz[i][1]);
            System.out.println("Vendas 2: " + matriz[i][2]);
            System.out.println("Vendas 3: " + matriz[i][3]);
            System.out.println("Média do Vendedor: " + matriz[i][4]);
            System.out.println("Porcentagem: " + matriz[i][5] + " %");
            System.out.println("====================================");
        }
    }

}
