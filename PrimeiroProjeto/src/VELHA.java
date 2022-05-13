import java.util.Scanner;

public class VELHA {
    public static void main(String[] args) {
        exe07();
    }

    public static void exe07() {
        Scanner in = new Scanner(System.in);
        String[][] b = new String[3][3];

        int jogun = 1;
        boolean n = true;


        while (n == true) {
            System.out.println("informe o valor de 1 a 9");
            int r = in.nextInt();


            switch (r) {
                case 1:
                    if (jogun == 1) {
                        b[0][0] = "|o|";
                        jogun =0;
                    } else {
                        b[0][0] = "|x|";
                        jogun = 1;
                    }

                    break;

                case 2:
                    if (jogun == 1) {
                        b[0][1] = "|o|";
                        jogun =0;
                    } else {
                        b[0][1] = "|x|";
                        jogun = 1;
                    }

                    break;

                case 3:
                    if (jogun == 1) {
                        b[0][2] = "|o|";
                        jogun =0;
                    } else {
                        b[0][2] = "|x|";
                        jogun = 1;
                    }

                    break;
                case 4:
                    if (jogun == 1) {
                        b[1][0] = "|o|";
                        jogun =0;
                    } else {
                        b[1][0] = "|x|";
                        jogun = 1;
                    }

                    break;
                case 5:
                    if (jogun == 1) {
                        b[1][1] = "|o|";
                        jogun =0;
                    } else {
                        b[1][1] = "|x|";
                        jogun = 1;
                    }
                    break;
                case 6:
                    if (jogun == 1) {
                        b[1][2] = "|o|";
                        jogun =0;
                    } else {
                        b[1][2] = "|x|";
                        jogun = 1;
                    }

                    break;
                case 7:
                    if (jogun == 1) {
                        b[2][0] = "|o|";
                        jogun =0;
                    } else {
                        b[2][0] = "|x|";
                        jogun = 1;
                    }

                    break;
                case 8:
                    if (jogun == 1) {
                        b[2][1] = "|o|";
                        jogun =0;
                    } else {
                        b[2][1] = "|x|";
                        jogun = 1;
                    }

                    break;
                case 9:
                    if (jogun == 1) {
                        b[2][2] = "|o|";
                        jogun =0;
                    } else {
                        b[2][2] = "|x|";
                        jogun = 1;
                    }

                    break;
                default: {
                    System.out.println("Coloque um valor de 1 a 9");
                }
            }

            for (int li = 0; li < 3; li++) {
                for (int col = 0; col < 3; col++) {
                    if (b[li][col] == null) {
                        System.out.print(" - ");
                    } else {
                        System.out.print(b[li][col]);
                    }

                }
                System.out.println("");

                String[] certo = new String[8];


            }
        }


    }
}





