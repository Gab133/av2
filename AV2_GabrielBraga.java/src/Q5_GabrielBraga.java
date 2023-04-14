import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalavrasComLink {
    public static void main(String[] args) {
        List<String> palavrasComLink = new ArrayList<String>();
        Scanner input = null;
        
        try {
            input = new Scanner(new File("arquivo.txt"));
            
            while (input.hasNext()) {
                String palavra = input.next();
                if (palavra.contains("link")) {
                    palavrasComLink.add(palavra);
                }
            }
            
            System.out.println("Palavras com a subsequência 'link': " + palavrasComLink);
            
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
