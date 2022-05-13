import java.util.Scanner;

public class exercicios2 {

    public static void main(String[] args) {
        exe18();
    }

    public static void exe11() {
        Scanner in = new Scanner(System.in);
        int a = 10;
        double b = in.nextDouble();


        if (b > a) {
            System.out.println("É maior que 10");

        } else {
            System.out.println("É menor que 10");

        }

    }

    public static void exe12() {

        Scanner in = new Scanner(System.in);
        System.out.println("Informe o numero...");
        double a = in.nextDouble();

        if (a > -0.1) {
            System.out.println("Positivo");

        } else {
            System.out.println("Negativo");

        }
    }

    public static void exe13() {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantas maçãs você quer comprar?");


        double b = in.nextDouble();
        double total = b * 1.30;

        if (b > 12.0) {
            System.out.println(" R$ " + b);
        } else {

            System.out.println(" R$ " + total);

        }
    }

    public static void exe14() {
        Scanner in = new Scanner(System.in);
        System.out.println("Data de nascimento...");
        int data = in.nextInt();
        int total = 2022 - data;

        if (total < 15) {
            System.out.println("Você não pode fazer o titulo de eleitor");

        } else {

            System.out.println("Você  pode fazer o titulo de eleitor");

        }
    }

    public static void exe15() {
        Scanner in = new Scanner(System.in);

        System.out.println("Um numero qualquer...");
        double a = in.nextDouble();
        System.out.println("Outro numero qualquer...");
        double b = in.nextDouble();

        if (a > b) {

            System.out.println("Numero maior é " + a);
        } else {
            System.out.println("Numeor maior é " + b);

        }
    }

    public static void exe16() {

        Scanner in = new Scanner(System.in);

        System.out.println("Um numero qualquer...");
        int a = in.nextInt();
        System.out.println("Outro numero qualquer...");
        double b = in.nextInt();

        if (a > b) {
            System.out.println(b + " Depois " + a);

        } else {

            System.out.println(a + " Depois " + b);

        }


    }

    public static void exe17() {
        // Hora do inicio ao fim; (Apenas inteiras)
        // Calcule a duração em horas
        // Max 24 horas
        Scanner in = new Scanner(System.in);

        System.out.println("Qual hora Iniciou?");
        int b = in.nextInt();
        System.out.println("Qual hora Acabou?");
        int a = in.nextInt();
        int tempo = a - b + 24;

        if (a < b) {

            System.out.println("Foram = " + tempo);

        } else {


            System.out.println("Foram = " + (b - a));


        }
    }

    public static void exe18() {
        Scanner in = new Scanner(System.in);
        //A jornada de trabalho semanal de um funcionário é de 40 horas.
        // O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
        // Escreva um algoritmo que leia o número de horas trabalhadas em um mês,
        // o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
        // (considere que o mês possua 4 semanas exatas de 5 dias úteis).


        int A = 160;
        System.out.println("Valor do seu salario por hora");

        int sala = in.nextInt();

        System.out.println("Quantas horas você trabalhou?");

        int horas = in.nextInt();

        if (horas > A) {
            int B = sala * A ;
            double D = (horas-A) * (sala + (sala*0.5));

            System.out.println(B + D + "R$");

        } else {

            System.out.println(horas * sala + "R$");


        }


    }

    public static void exe19() {
        Scanner in = new Scanner(System.in);

        //Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule e mostre seu peso ideal, utilizando as seguintes fórmulas:
        //- para sexo masculino: peso ideal = (72.7 * altura) - 58
        //	- para sexo feminino: peso ideal = (62.1 * altura) - 44.7


        System.out.println("Informe o nome: ");
        String N = in.nextLine();
        System.out.println("Informe a altura");
        double alt = in.nextDouble();
        in.nextLine();
        System.out.println("Informe o sexo");
        String i = in.nextLine();

        if (i.equals("M")) {

            double V = (72.7 * alt) - 58;
            System.out.println("Seu peso ideal é " + V + " Kg");


        } else if (i.equals("F")) {

            double W = (62.1 * alt) - 44.7;

            System.out.println("Seu peso ideal é " + W + " Kg");
        } else {


            System.out.println("Você não informou o M ou F corretamente");


        }
    }

    public static void exe20() {
//Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.
// Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$1.500,00
// mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.





    }

}

