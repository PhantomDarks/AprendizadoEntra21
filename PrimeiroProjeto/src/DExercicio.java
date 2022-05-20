import java.util.Scanner;

public class DExercicio {

    public static void main(String[] args) {


    }

    public static Scanner in = new Scanner(System.in);

    public static void exe02() {
        System.out.println("digite algo");
        String UmaCoisa = in.nextLine();
        System.out.println("digite algo novamente");
        String OutraCoisa = in.nextLine();
        if (UmaCoisa.equals(OutraCoisa)) {
            System.out.println("Ambos são iguais");

        } else if (UmaCoisa.equalsIgnoreCase(OutraCoisa)) {
            System.out.println("São iguais indepentemente da situação apresentada");

        } else {
            System.out.println("São diferentes");

        }

    }

    public static void exe03() {
        System.out.println("digite algo");
        String UmaCoisa = in.nextLine();
        System.out.println("digite algo novamente");
        String OutraCoisa = in.nextLine();
        if (UmaCoisa.contains(OutraCoisa)) {
            System.out.println(OutraCoisa + "faz parte de" + UmaCoisa);
        } else if (OutraCoisa.contains(UmaCoisa)) {
            System.out.println(UmaCoisa + "faz parte de " + OutraCoisa);
        } else {
            System.out.println("Não faz parte");

        }

    }

    public static void exe04() {
        System.out.println("digite algo");
        String UmaCoisa = in.nextLine();
        System.out.println("digite algo novamente");
        String OutraCoisa = in.nextLine();
        if (UmaCoisa.startsWith(OutraCoisa)) {
            System.out.println(OutraCoisa + "é prefixo de" + UmaCoisa);

        } else if (OutraCoisa.startsWith(UmaCoisa)) {

            System.out.println(UmaCoisa + "é prefixo de" + OutraCoisa);

        } else {
            System.out.println("esquece, não é prefixo");

        }


    }

    public static void exe05() {
        System.out.println("digite algo");
        String UmaCoisa = in.nextLine();
        System.out.println("digite algo novamente");
        String OutraCoisa = in.nextLine();
        if (UmaCoisa.startsWith(OutraCoisa)) {
            System.out.println(OutraCoisa + "é prefixo de" + UmaCoisa);

        } else if (OutraCoisa.startsWith(UmaCoisa)) {

            System.out.println(UmaCoisa + "é prefixo de" + OutraCoisa);

        } else {
            System.out.println("esquece, não é prefixo");

        }
    }


    public static void exe10() {
//Take two integer lists as input and return a new list with all values of the first list thay are not in the second list//
        //primeira lista
        System.out.println("informe a quantidade de numeros da primeira lista ");
        int nuns = in.nextInt();
        int[] numeros = new int[nuns];
        for (int i = 0; i < nuns; i++) {
            System.out.println("informe um numero: ");
            numeros[i] = in.nextInt();
            //segunda lista
            System.out.println("informe a quantidade de numeros da segunda lista ");
            int nun = in.nextInt();
            int[] numeros1 = new int[nuns];
            for (int u = 0; u < nun; u++) {
                System.out.println("informe um numero: ");
                numeros1[i] = in.nextInt();
            }
            for (int valor1 : numeros){
                boolean achou = false;
                for (int valor2 : numeros1){
                    if (valor1 == valor2){
                        achou = true;
                        break;

                    }

                }


            }

        }


    }
}
