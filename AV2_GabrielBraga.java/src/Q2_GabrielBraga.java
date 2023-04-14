import java.util.Scanner;

public class SomaInteiros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o número de inteiros a serem somados: ");
        int n = input.nextInt();
        
        int soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i+1) + "º inteiro: ");
            soma += input.nextInt();
        }
        
        System.out.println("A soma dos " + n + " inteiros digitados é: " + soma);
        input.close();
    }
}

