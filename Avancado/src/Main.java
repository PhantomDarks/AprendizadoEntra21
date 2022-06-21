import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex3();

    }

    public static void ex1() {
        //pedir pro usuario informar n numeros inteiros ate ele digitar 0
        //quando ele digitar 0, mostrar a lista dos numeros digitados por ele
        ArrayList inteiro = new ArrayList();
        while (true) {
            System.out.println("informe um valor inteiro");
            int escolha = in.nextInt();
            inteiro.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.println("Valores informados:");
        System.out.println(inteiro);

    }

    public static void ex2() {
        double nImpar = 0;
        double nPares = 0;
        //pedir pro usuario infomar valores inteiros atéque seja informado 0
        //quando for informado 0, mostrara os valores que o usuario digitou
        //mostrar a soma dos numeros pares e dos numeros impares informados
        //mostrar a media de todos os valores informados
        ArrayList<Double> inteiro = new ArrayList<Double>();
        while (true) {
            System.out.println("informe um valor inteiro");
            double escolha = in.nextInt();
            inteiro.add(escolha);
            if (escolha == 0) {
                break;
            }

            if (escolha % 2 == 0) {
                nPares += escolha;
            } else {
                nImpar += escolha;
            }
        }
        System.out.println("Valores informados:");
        System.out.println("Todos numeros: " + inteiro);
        System.out.println("|Soma de numeros pares: " + nPares + " |Soma dos numeros impares: " + nImpar + "|");
        System.out.println("Soma total: " + (nImpar + nPares) / inteiro.size());

    }

    public static void ex3() {
        //1- ler o imput do usuario ()String até que seja informado SAIR
        //2-Pedir pro usuario um valor inteiro > 0
        //3- Remover da lista as palavras que tenham a quantidade de caracteres menor que o numero informado
        //4- Mostrar a lista de palavras
        ArrayList<String> palavras = new ArrayList<String>();

        while (true) {

            System.out.println("informe uma palavra, E sair para sair");
            String escolha = in.nextLine().toUpperCase();

            if (escolha.equalsIgnoreCase("SAIR")) {
                break;
            }
            palavras.add(escolha);
        }
        System.out.println("Informe um numero minimo de caracteres");
        int num = in.nextInt();
        for (int i = 0; i < palavras.size(); i++) {
            if (num > palavras.get(i).length()) {
                palavras.remove(i);
                i--;
            }
        }
        System.out.println(palavras);
    }
}



