import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        String[] palavras = {"abc", "def", "ghi"};
        char letraProibida = 'a';
        boolean achou = false;
        for (String palavra : palavras) {
            for (int i = 0; i < palavra.length(); i++) {
                achou = palavra.charAt(i) == letraProibida;
                if (achou) {
                    break;

                }

            }
        }
        if (achou) {
            System.out.println("Encontrou a palavra proibida");
        } else {
            System.out.println("Não encontrou letra proibida");
        }

    }


}







