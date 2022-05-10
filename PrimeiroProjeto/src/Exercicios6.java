import java.util.Locale;
import java.util.Scanner;

public class Exercicios6 {
    public static void main(String[] args) {
        exe08();
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
        while (f) {
            System.out.println("informe a posição de 5 a 0 de altura, para parar informe 9");
            int b = in.nextInt();
            if (b == 9) {
                break;
            }
            while (d) {
                System.out.println("informe a posição de A há I");
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
        for (int i = 0; i < 5; i++) {
            System.out.println("informe um valor");
            soma += in.nextInt();
        }
        System.out.println("Soma é " + soma);

    }

    public static void exe05() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor...");
        int f = in.nextInt();

        int soma = 1;
        if (f == 0) {
            f = 0;

        } else {
            for (int i = f; i > 0; i--) {
                soma *= i;


            }
        }
        System.out.println("fatorial de " + f + "é" + soma);
    }

    public static void exe06() {
        Scanner in = new Scanner(System.in);
        int a = 0;

        for (int t = 0; t < 3; t++) {
            System.out.println("Insira seu pin:");
            int pin = in.nextInt();


            if (pin == 91352) {
                System.out.println("Você logou com sucesso!!");
                break;
            } else {
                System.out.println("Você inseriu a senha incorreta");
                a++;
            }
        }
        if (a == 3) {
            System.out.println("Você bloqueou seu pin");
        }
    }

    public static void exe06r() {
        Scanner in = new Scanner(System.in);
        boolean b = true;
        int d = 0;
        int c = 3;
        while (d <= c){

            System.out.println("Insira seu pin:");
            int pin = in.nextInt();


            if (pin == 91352) {
                System.out.println("Você logou com sucesso!!");
                break;
            } else {
                System.err.println("Você inseriu a senha incorreta");
                d++;
                System.err.println("você tem mais "+ d + "/3");
            }
            if (d == 3){
                System.err.println("Você bloqueou seu pin");
                break;
            }

        }


    }

    public static void exe07() {
        Scanner in = new Scanner(System.in);
        String [][] b = {{"-","-", "-"},
                {"-","-" , "-"},
                {"-", "-", "-"},
    };

        boolean jogun = true;


            while(jogun == true) {
                System.out.println("informe o valor de 0 a 9");
                int r = in.nextInt();

                if (r <= 9) {
                    switch (r) {
                        case 1:
                            b[0][0] = "X";
                            break;
                        case 2:
                            b[0][1] = "X";
                            break;
                        case 3:
                            b[0][2] = "X";
                            break;
                        case 4:
                            b[0][3] = "X";
                            break;
                        case 5:
                            b[1][0] = "X";
                            break;
                        case 6:
                            b[1][1] = "X";
                            break;
                        case 7:
                            b[1][2] = "X";
                            break;
                        case 8:
                            b[2][0] = "X";
                            break;
                        case 9:
                            b[2][1] = "X";
                        case 10:
                            b[2][2] = "X";
                    }

                }else {
                    System.out.println("insira algo valido");
                    break;
                }
                System.out.println(b);
            }



        }
    public static void exe08() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor...");
        int f = in.nextInt();

        int soma = 0;
        if (f == 0) {
            f = 0;

        } else {
            for (int i = f; i > 0; i--) {
                soma += i;


            }
        }
        System.out.println("A soma  de 1 a " + f + " é " + soma);
    }

    }



