import java.util.Scanner;

public class TokensComS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();
        
        String[] tokens = frase.split(" ");
        System.out.println("Tokens que começam com 's': ");
        for (String token : tokens) {
            if (token.toLowerCase().startsWith("s")) {
                System.out.println(token);
            }
        }
        
        input.close();
    }
}
