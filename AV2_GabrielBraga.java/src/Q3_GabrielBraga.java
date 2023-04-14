import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de números a serem somados: ");
        int n = input.nextInt();
        
        int soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            soma += input.nextInt();
        }
        
        System.out.println("A soma dos " + n + " números digitados é: " + soma);
        input.close();
    }
}
