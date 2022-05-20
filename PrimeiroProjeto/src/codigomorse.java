import java.util.Scanner;

public class codigomorse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean a;
        while (a = true) {
            System.out.println("Digite 1 para codificador ou 2 para decodificador: ");
            int var1 = in.nextInt();
            if (var1 == 1) {
                codigomorse();
                a = false;
                break;
            } else if (var1 == 2) {
                decodificadormorse();
                a = false;
                break;
            } else {
                System.out.println("Essa opção não existe. Por favor insira um numero válido!");
            }
        }
    }

    public static void codigomorse() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma frase para o codificador Morse: ");
        String frase1 = in.nextLine().toUpperCase();
        int numLetras = frase1.length();
        String[] frase2 = new String[numLetras];
        for (int i = 0; i < numLetras; i++) {
            frase2[i] = String.valueOf(frase1.charAt(i));
            System.out.println(frase2[i]);
        }
        for (int i = 0; i < numLetras; i++) {

            switch (frase2[i]) {
                case "A":
                    System.out.print(".-|");
                    break;
                case "B":
                    System.out.print("-...|");
                    break;
                case "C":
                    System.out.print("-.-.|");
                    break;
                case "D":
                    System.out.print("-..|");
                    break;
                case "E":
                    System.out.print(".|");
                    break;
                case "F":
                    System.out.print("..-.|");
                    break;
                case "G":
                    System.out.print("--.|");
                    break;
                case "H":
                    System.out.print("....|");
                    break;
                case "I":
                    System.out.print("..|");
                    break;
                case "J":
                    System.out.print(".---|");
                    break;
                case "K":
                    System.out.print("-.-|");
                    break;
                case "L":
                    System.out.print(".-..|");
                    break;
                case "M":
                    System.out.print("--|");
                    break;
                case "N":
                    System.out.print("-.|");
                    break;
                case "O":
                    System.out.print("---|");
                    break;
                case "P":
                    System.out.print(".--.|");
                    break;
                case "Q":
                    System.out.print("--.-|");
                    break;
                case "R":
                    System.out.print(".-.|");
                    break;
                case "S":
                    System.out.print("...|");
                    break;
                case "T":
                    System.out.print("-|");
                    break;
                case "U":
                    System.out.print("..-|");
                    break;
                case "V":
                    System.out.print("...-|");
                    break;
                case "W":
                    System.out.print(".--|");
                    break;
                case "X":
                    System.out.print("-..-|");
                    break;
                case "Y":
                    System.out.print("-.--|");
                    break;
                case "Z":
                    System.out.print("--..|");
                    break;
                case "0":
                    System.out.print("-----|");
                    break;
                case "1":
                    System.out.print(".----|");
                    break;
                case "2":
                    System.out.print("..---|");
                    break;
                case "3":
                    System.out.print("...--|");
                    break;
                case "4":
                    System.out.print("....-|");
                    break;
                case "5":
                    System.out.print(".....|");
                    break;
                case "6":
                    System.out.print("-....|");
                    break;
                case "7":
                    System.out.print("--...|");
                    break;
                case "8":
                    System.out.print("---..|");
                    break;
                case "9":
                    System.out.print("----.|");
                    break;
                case "!":
                    System.out.print("-.-.--|");
                    break;
                case "(":
                    System.out.print("-.--.|");
                    break;
                case ")":
                    System.out.print("-.--.|");
                    break;
                case "?":
                    System.out.print("..--..|");
                    break;
                case "/":
                    System.out.print("-..-.|");
                    break;
                case ",":
                    System.out.print("--..--|");
                    break;
                case ".":
                    System.out.print(".-.-.-|");
                    break;
                case ":":
                    System.out.print("---..|");
                    break;
                case "'":
                    System.out.print(".----.|");
                    break;
                case ";":
                    System.out.print("-.-.-.|");
                    break;
                case "\"":
                    System.out.print(".-..-.|");
                    break;
                case "=":
                    System.out.print("-...-|");
                    break;
                case "+":
                    System.out.print(".-.-.|");
                    break;
                case "-":
                    System.out.print("-....-|");
                    break;
                case " ":
                    System.out.print("*|");
                    break;
                default:
                    System.out.println("Letra não encontrada!");
            }
        }
    }

    public static void decodificadormorse() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um codigo para o decodificador Morse: ");
        String frase1 = in.nextLine().toUpperCase();
        String[] frase2 = frase1.split("\\|");
        for (int i = 0; i < frase2.length; i++) {

            switch (frase2[i]) {
                case ".-":
                    System.out.print("A");
                    break;
                case "-...":
                    System.out.print("B");
                    break;
                case "-.-.":
                    System.out.print("C");
                    break;
                case "-..":
                    System.out.print("D");
                    break;
                case ".":
                    System.out.print("E");
                    break;
                case "..-.":
                    System.out.print("F");
                    break;
                case "--.":
                    System.out.print("G");
                    break;
                case "....":
                    System.out.print("H");
                    break;
                case "..":
                    System.out.print("I");
                    break;
                case ".---":
                    System.out.print("J");
                    break;
                case "-.-":
                    System.out.print("K");
                    break;
                case ".-..":
                    System.out.print("L");
                    break;
                case "--":
                    System.out.print("M");
                    break;
                case "-.":
                    System.out.print("N");
                    break;
                case "---":
                    System.out.print("O");
                    break;
                case ".--.":
                    System.out.print("P");
                    break;
                case "--.-":
                    System.out.print("Q");
                    break;
                case ".-.":
                    System.out.print("R");
                    break;
                case "...":
                    System.out.print("S");
                    break;
                case "-":
                    System.out.print("T");
                    break;
                case "..-":
                    System.out.print("U");
                    break;
                case "...-":
                    System.out.print("V");
                    break;
                case ".--":
                    System.out.print("W");
                    break;
                case "-..-":
                    System.out.print("X");
                    break;
                case "-.--":
                    System.out.print("Y");
                    break;
                case "--..":
                    System.out.print("Z");
                    break;
                case "-----":
                    System.out.print("0");
                    break;
                case ".----":
                    System.out.print("1");
                    break;
                case "..---":
                    System.out.print("2");
                    break;
                case "...--":
                    System.out.print("3");
                    break;
                case "....-":
                    System.out.print("4");
                    break;
                case ".....":
                    System.out.print("5");
                    break;
                case "-....":
                    System.out.print("6");
                    break;
                case "--...":
                    System.out.print("7");
                    break;
                case "---..":
                    System.out.print("8");
                    break;
                case "----.":
                    System.out.print("9");
                    break;
                case "-.-.--":
                    System.out.print("!");
                    break;
                case "..--..":
                    System.out.print("?");
                    break;
                case "-..-.":
                    System.out.print("/");
                    break;
                case "--..--":
                    System.out.print(",");
                    break;
                case ".-.-.-":
                    System.out.print(".");
                    break;
                case "---...":
                    System.out.print(":");
                    break;
                case ".----.":
                    System.out.print("'");
                    break;
                case "-.-.-.":
                    System.out.print(";");
                    break;
                case ".-..-.":
                    System.out.print("\"");
                    break;
                case "-...-":
                    System.out.print("=");
                    break;
                case ".-.-.":
                    System.out.print("+");
                    break;
                case "-....-":
                    System.out.print("-");
                    break;
                case "*":
                    System.out.print(" ");
                    break;
                default:
                    System.out.println("Código não encontrado!");
            }
        }
    }

}


