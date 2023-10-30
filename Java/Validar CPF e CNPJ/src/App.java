import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String cpf = validarcpf("Digite seu CPF (somente os números): ");
    }

    // Validar CPF
    static String validarcpf(String msg) {
        String cpf;
        do {
            System.out.println(msg);
            cpf = input.nextLine();
            if (cpf.length() != 11) {
                System.out.println("CPF inválido, digite novamente!");
            }
        } while (cpf.length() != 11);

        String vet1[] = cpf.split("");
        boolean cpfValido = false;
        for (int i = 0; i < vet1.length - 1; i++) {
            int vet2[] = integer.parseInt(vet1[i]);
            
        }
        return cpf;
    }

}
