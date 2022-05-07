import java.util.Locale;
import java.util.Scanner;

public class Exercicios6 {
    public static void main(String[] args) {
        exe04();
    }

    public static void exe01() {
        Scanner in = new Scanner(System.in);

        boolean isClazz = true;
        while (isClazz) {
            System.out.println("Qual a abreviação");
            String clazz = in.nextLine().toUpperCase(Locale.ROOT);

            if (clazz.length() != 3) {
                System.out.println("Não é uma abreviação valida, use 3 caracteres");

                continue;
            }

            switch (clazz) {
                case "WAR", "PLD", "DKN", "GNB":
                    System.out.println("Tank");
                    isClazz = false;
                    break;
                case "WHM", "SCH", "AST", "SAG":
                    System.out.println("Healer");
                    isClazz = false;
                    break;
                case "MNR", "DRG", "NJA", "SMR", "RPR", "BRP", "MCH", "DNC", "BLM", "SMN", "RDM", "BEM":
                    System.out.println("DPS");
                    isClazz = false;
                    break;
                default:
                    System.out.println("Não existe, por favor insira uma abreviação correta da classe ");

                    //isClazz = false;
                    break;

            }


        }

    }

    public static void exe02() {
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva uma frase...");

        String plv = in.nextLine();
        int espaços = 0;
        for (int i = 0; i < plv.length(); i++) {

            if (plv.charAt(i) == ' ') {
                espaços++;

            }


        }
        System.out.println("ELE TEM " + espaços + " ESPAÇOS");
    }

    public static void exe03() {

        Scanner in = new Scanner(System.in);
        boolean d = true;
        int coluna = 0;
        boolean f = true;
        while(f){
            System.out.println("informe a posição de 5 a 0 de altura, para parar informe 9");
            int b = in.nextInt();
            if(b == 9){
                break;
            }
                while (d) {
                    System.out.println("informe a posição de a há i");
                    String a = in.next().toUpperCase();
                    switch (a) {
                        case "A":
                            coluna = 0;
                            d = false;
                            break;
                        case "B":
                            coluna = 1;
                            d = false;
                            break;
                        case "C":
                            coluna = 2;
                            d = false;
                            break;
                        case "D":
                            coluna = 3;
                            d = false;
                            break;
                        case "E":
                            coluna = 4;
                            d = false;
                            break;
                        case "F":
                            coluna = 5;
                            d = false;
                            break;
                        case "G":
                            coluna = 6;
                            d = false;
                            break;
                        case "H":
                            coluna = 7;
                            d = false;
                            break;
                        case "I":
                            coluna = 8;
                            d = false;
                            break;
                    }
                }


            int[][] Bat = {
                    {0, 0, 0, 0, 0, 0, 1, 1, 0},
                    {0, 1, 0, 0, 0, 0, 0, 0, 0},
                    {0, 1, 0, 1, 1, 1, 0, 0, 1},
                    {0, 1, 0, 0, 0, 0, 0, 0, 1},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {1, 1, 0, 0, 0, 0, 0, 0, 0},
            };


            if (Bat[b][coluna] == 1) {
                System.out.println("Você acertou um barco");

            } else {
                System.out.println("Você não acertou");


            }
        }
    }

    public static void exe04() {
        Scanner in = new Scanner(System.in);
        //escreva um algoritimo que peça o usuario que informe 5 numeros e imprima a soma deles usando repetição
        int soma = 0;
        for (int i = 0; i < 5; i++){
            System.out.println("informe um valor");
            soma += in.nextInt();
        }
        System.out.println("Soma é " + soma);

    }
}

