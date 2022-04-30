import javax.swing.tree.VariableHeightLayoutCache;
import java.util.Scanner;


public class Exercicios {



    public static void main(String[] args) {

        exe17();

    }
    public static void exe01() {
        int VarA = 10;
        int VarB = 20;
        int VarC = VarA;
        VarA = VarB;
        VarB = VarC;
        System.out.println(VarA);
        System.out.println(VarB);




    }

    public static void exe02() {
        int exdois = 20;

        System.out.println(-- exdois);


    }


    public static void exe03() {


        Scanner in = new Scanner(System.in);
        System.out.println("digite algum valor");
        int valor = in.nextInt();
        System.out.println(--valor);


    }


    public static void exe04(){
        Scanner in = new Scanner(System.in);

        System.out.println("Altura é? ");
        int altura = in.nextInt();

        System.out.println("base é? ");
        int base = in.nextInt();

        System.out.println(" O area é " + base * altura);

        System.out.println(" O perimetro é " + (base + base + altura + altura));

    }
    public static void exe05(){
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos anos a Pessoa tem? ");
         int Var365 = 365;
         int VarAnos = in.nextInt();

         Var365 *= VarAnos  ;


        System.out.println("Quantos meses a pessoa tem? ");
        int Var30 = 30;
        int VarMes = in.nextInt();
        Var30 *= VarMes  ;

        System.out.println("Quantos dias a pessoa tem? ");

        System.out.println( "Essa pessoa tem " + (in.nextInt() + Var30 +  Var365) + " dias de vida"  );

    }
    public static void exe5() {

        Scanner in = new Scanner(System.in);

        System.out.println("Quantos eleitores tem em um municipio? ");

        int Total = in.nextInt();

        System.out.println("Quantos votos nulos? ");

        int Nulos = in.nextInt();

        System.out.println("Quantos votos brancos ");

        int Brancos = in.nextInt();

        double Ntotais = (Nulos * 100.0) / Total;

        double Btotais = (Brancos * 100.0) / Total;

        double Totalmente = (-Brancos - Nulos) + Total;

        double Ttotais = (Totalmente * 100.0) / Total;

        System.out.println("Total de pessoas com voto valido " + Totalmente);
        System.out.println("Porcentagem de votos nulos é " + Ntotais + "%");
        System.out.println("Porcentagem de votos Brancos é " + Btotais + "%");
        System.out.println("Porcentagem de votos Validos é " + Ttotais + "%");



    }

    public static void exe06() {

        Scanner in = new Scanner(System.in);


        System.out.println("Quanto você recebe atualmente?");

        int Salario = in.nextInt();

        System.out.println("Quanto você recebe de reajuste?");

        int Percentual = in.nextInt();

       double a = Percentual *= Salario;
       double bo = a / 100;
       double c = bo + Salario;



        System.out.println(" Seu novo salario seria " + c  )  ;

    }


    public static void exe07() {

        Scanner in = new Scanner(System.in);

        System.out.println("Valor do carro?");
        double ValorC = in.nextDouble();
        double b = 100;
        double d = 73;

        double a =  ValorC * d ;
        double bo = a / b ;
        double c = bo + ValorC;

        System.out.println( "Tera o valor de:" + c    );

    }

    public static void exe08() {

        Scanner in = new Scanner(System.in);

        System.out.println("qual seu salario?");
        int Salario = in.nextInt();
        System.out.println("Quantos carros você vendeu?");
        int Nvendidos = in.nextInt();
        System.out.println("Valor total de suas vendas?");
        int Vld = in.nextInt();
        System.out.println("quanto voce ganhou em comição");
        int comicao = in.nextInt();
        System.out.println("Quanto você recebe por carro vendido?");
        int Cv = in.nextInt();
        int Du = Salario + comicao;
        double tri = Cv * 5 /100.0;
        System.out.println( Salario + tri + Du);


    }

    public static void exe09() {

        Scanner in = new Scanner(System.in);

        System.out.println("Quantos graus Fahrenheit está fazendo");
        double C = in.nextDouble();
        double F=  5 * (C - 32) ;
        double Ff= F / 9;

        System.out.println( "Esta fazendo " + Ff + " Graus C");




    }

    public static void exe10() {

        Scanner in = new Scanner(System.in);

        System.out.println("Primeira nota");
        double p = in.nextDouble() * 2;
        System.out.println("Segunda nota");
        double s = in.nextDouble() * 3;
        System.out.println("Terceira nota");
        double t = in.nextDouble() * 5;

        double Total = (p + s + t) /10;

        System.out.println(Total);





    }

    public static void exe11() {
        Scanner in = new Scanner(System.in);
        int a = 10 ;
        double b = in.nextDouble();


    if (b > a) {
        System.out.println( "É maior que 10");

    }
    else {
        System.out.println( "É menor que 10");

    }

    }
    public static void exe12() {

        Scanner in = new Scanner(System.in);
        System.out.println( "Informe o numero...");
        double a = in.nextDouble();

        if ( a > -0.1) {
            System.out.println( "Positivo");

        }
        else {
            System.out.println( "Negativo");

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
            System.out.println( "Data de nascimento..." );
            int data =  in.nextInt();
            int total = 2022 - data;

            if (total < 15){
                System.out.println( "Você não pode fazer o titulo de eleitor" );

            }
            else {

                System.out.println( "Você  pode fazer o titulo de eleitor" );

            }
        }

             public static void exe15() {
                 Scanner in = new Scanner(System.in);

                 System.out.println( "Um numero qualquer..." );
                 double a = in.nextDouble();
                 System.out.println("Outro numero qualquer...");
                 double b = in.nextDouble();

                 if (a > b) {

                     System.out.println( "Numero maior é " + a );
                 }

                 else  {
                     System.out.println("Numeor maior é " + b);

                 }
             }
             public static void exe16() {

                 Scanner in = new Scanner(System.in);

                 System.out.println( "Um numero qualquer..." );
                 int a = in.nextInt();
                 System.out.println("Outro numero qualquer...");
                 double b = in.nextInt();

                 if (a > b) {
                     System.out.println(b + " Depois " + a);

                 }

                else {

                     System.out.println( a + " Depois " + b);

                 }





                 }

                 public static void exe17() {
                // Hora do inicio ao fim; (Apenas inteiras)
                     // Calcule a duração em horas
                     // Max 24 horas
                     Scanner in = new Scanner(System.in);

                     System.out.println( "Qual hora Aniciou?");
                    int b = in.nextInt();
                     System.out.println( "Qual hora Acabou?");
                    int a = in.nextInt();
                     int tempo =  a - b + 24 ;

                     if ( a < b) {

                         System.out.println( "Foram = " + tempo);

                     }
                     else {


                         System.out.println("Foram = " + (b - a));


                     }
                }













    }