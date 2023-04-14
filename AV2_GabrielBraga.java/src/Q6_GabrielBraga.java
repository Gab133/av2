import java.util.Random;

public class MultiplicacaoMatrizes {
    public static void main(String[] args) {
        int n = 3; // tamanho das matrizes (3x3)
        int[][] matriz1 = new int[n][n]; // primeira matriz
        int[][] matriz2 = new int[n][n]; // segunda matriz
        int[][] resultado = new int[n][n]; // matriz resultado

        Random random = new Random(); // objeto para gerar números aleatórios

        // inicializa as matrizes com números aleatórios
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz1[i][j] = random.nextInt(10);
                matriz2[i][j] = random.nextInt(10);
            }
        }

        // realiza a multiplicação entre as matrizes
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        // exibe as matrizes e o resultado da multiplicação
        System.out.println("Matriz 1:");
        exibeMatriz(matriz1);
        System.out.println("Matriz 2:");
        exibeMatriz(matriz2);
        System.out.println("Resultado da multiplicação:");
        exibeMatriz(resultado);
    }

    // método auxiliar para exibir uma matriz
    private static void exibeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
