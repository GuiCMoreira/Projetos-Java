import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String cpf = "";

        while (!validarCPF(cpf)) {
            System.out.print("Digite o CPF (somente números): ");
            cpf = input.nextLine();

            if (validarCPF(cpf)) {
                System.out.println("CPF válido!");
            } else {
                System.out.println("CPF inválido!");
            }
        }
    }

    public static boolean validarCPF(String cpf) {
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("[^\\d]", "");

        // Verifica se o CPF possui 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int resto = 11 - (soma % 11);
        int digito1 = (resto >= 10) ? 0 : resto;

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        resto = 11 - (soma % 11);
        int digito2 = (resto >= 10) ? 0 : resto;

        // Verifica se os dígitos verificadores estão corretos
        return (digito1 == Character.getNumericValue(cpf.charAt(9)))
                && (digito2 == Character.getNumericValue(cpf.charAt(10)));
    }
}
