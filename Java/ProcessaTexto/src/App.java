import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Path caminhoEntrada = Paths.get("src/processatexto/entrada.txt");

        List<String> dados = lerArquivo(caminhoEntrada);
        try {
            dados = lerArquivo(caminhoEntrada);
        } catch (IOException ex) {
            System.out.println("Arquivo de entrada não existe");
            System.exit(0);
        }

        novosDados = processarArquivo(dados);
        gravarArquivo(localGravacao, novosDados);

    }

    static List<String> lerArquivo(Path arquivo) throws IOException {

        return Files.readAllLines(arquivo);

    }

}
