import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;
public class jogoForca {

    public static void main(String[] args) {
        Palavra();
    }

    public static void Palavra() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a palavra para o jogo: ");
        String palavraDesconhecida = ler.nextLine().toUpperCase();

        for (int i = 0; i < 100; i++) {
            System.out.print("");
        }

        boolean continua = true;
        int tamanho = palavraDesconhecida.length();
        char[] letras = palavraDesconhecida.toCharArray();

        while(continua) {
            System.out.println("Informe uma letra: ");
            String letraInformada = ler.next();

            for (int i = 0; i < tamanho; i++) {
                if (letraInformada.charAt(0) == letras[i]){
                    System.out.println("Você acertou uma letra");

                    break;
                }
            }

            continua = !continua;
        }

    }
}

