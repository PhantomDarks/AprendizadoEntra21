import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        exe02();
    }


    public static void exe01() {
        Scanner batata = new Scanner(System.in);
        System.out.println("qual tabuada desejas saber");
        int valor = batata.nextInt();
        for (int i = 0; i <= 10; i++) {

            System.out.println(i * valor);


        }
    }


    public static void exe02() {
        Scanner batata = new Scanner(System.in);

        System.out.println("qual tabuada desejas saber");
        int valor = batata.nextInt();
        while (valor != 0) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(valor*i);
            }
            System.out.println("qual tabuada desejas saber");
             valor = batata.nextInt();
        }


    }

}






