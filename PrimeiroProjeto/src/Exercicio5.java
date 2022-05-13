import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Exercicio5 {
    public static void main(String[] args) {
exe01();
    }

    public static void exe01() {
        //1.Pedir ao usuario quantas palavras ele deseja informar;
        //2.Pedir ao usuario cada palavra;
        //3.Informar em uma unica linha as palavras que o usuario informou
        //  Separadas com virgula
        Scanner batata = new Scanner(System.in);
        System.out.println("quantas palavras deseja informar:");
        int v = batata.nextInt();
        String[] palavras = new String[v];
        for (int i = 0; i < v; i++) {
            System.out.println("informe a palavra:");
            palavras[i] = batata.next();
        }
        for (int i = 0; i < palavras.length; i++){
           if (i == 0){System.out.print(palavras[i]);}
           else { System.out.print(", " + palavras[i]);}

        }
    }
}
