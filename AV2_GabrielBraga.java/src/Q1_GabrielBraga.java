import java.util.Scanner;

public class SomaInteiros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro inteiro: ");
        int num1 = input.nextInt();
        
        System.out.print("Digite o segundo inteiro: ");
        int num2 = input.nextInt();
        
        int soma = num1 + num2;
        
        System.out.println("A soma dos inteiros digitados é: " + soma);
        input.close();
    }
}
