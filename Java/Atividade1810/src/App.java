import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

    private static final int MAX_LINES = 100;
    private static final String FILE_NAME = "texto.txt";
    private static String[] textLines = new String[MAX_LINES];
    private static int lineCount = 0;

    public static void main(String[] args) {
        loadTextFromFile();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Digite um comando, texto ou linha para editar: ");
            String input = scanner.nextLine();

            if (input.startsWith("\\q")) {
                running = false;
            } else if (input.startsWith("\\sv")) {
                saveTextToFile();
            } else if (input.startsWith("\\ed")) {
                // Command to edit a line: \ed #
                try {
                    int lineNumber = Integer.parseInt(input.substring(3));
                    editLine(lineNumber);
                } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
                    System.out.println("Comando de edição inválido. Use \\ed # para editar uma linha.");
                }
            } else {
                addTextLine(input);
            }
        }

        scanner.close();
    }

    private static void loadTextFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                textLines[i] = line;
                i++;
            }
            lineCount = i;
            System.out.println("Arquivo carregado com sucesso.");
        } catch (IOException e) {
            System.out.println("O arquivo não foi encontrado. Um novo arquivo será criado.");
        }
    }

    private static void saveTextToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (int i = 0; i < lineCount; i++) {
                writer.write(textLines[i]);
                writer.newLine();
            }
            System.out.println("Texto salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o texto no arquivo.");
        }
    }

    private static void addTextLine(String text) {
        if (lineCount < MAX_LINES) {
            textLines[lineCount] = text;
            lineCount++;
            System.out.println("Texto adicionado com sucesso.");
        } else {
            System.out.println("Limite de linhas atingido. Use o comando \\sv para salvar e liberar espaço.");
        }
    }

    private static void editLine(int lineNumber) {
        if (lineNumber >= 0 && lineNumber < lineCount) {
            System.out.println("Texto atual na linha " + lineNumber + ": " + textLines[lineNumber]);
            System.out.print("Digite o novo texto: ");
            Scanner scanner = new Scanner(System.in);
            String newText = scanner.nextLine();
            textLines[lineNumber] = newText;
            System.out.println("Linha editada com sucesso.");
        } else {
            System.out.println("Número de linha inválido.");
        }
    }
}
