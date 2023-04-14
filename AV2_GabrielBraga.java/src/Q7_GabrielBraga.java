import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SomaNumerosArquivo {
    public static void main(String[] args) {
        String nomeArquivo = "numeros.txt"; // nome do arquivo a ser lido
        int soma = 0; // variável para armazenar a soma dos números

        try {
            BufferedReader br = new BufferedReader(new FileReader(nomeArquivo)); // cria um objeto BufferedReader para ler o arquivo
            String linha;

            while ((linha = br.readLine()) != null) { // lê o arquivo linha por linha
                int numero = Integer.parseInt(linha); // converte a linha para um número inteiro
                soma += numero; // adiciona o número à variável soma
            }

            br.close(); // fecha o arquivo
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        System.out.println("A soma dos números no arquivo " + nomeArquivo + " é " + soma + ".");
    }
}
