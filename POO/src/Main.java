import Classes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("-MENU: Escolha uma opção");
        System.out.println("(1)- X-Salada");
        System.out.println("(2)- X-Burguer");
        System.out.println("(3)- Misto quente");
        System.out.println("(4)- Hotdog");
        System.out.println("(5)- MinePizza");
        Lanche lanche = null;

        int escolha = in.nextInt();
        switch (escolha) {
            case 1:
                lanche = new XSalada();

                break;
            case 2:
                lanche = new XBurguer();


                break;
            case 3:
                lanche = new MistoQuente();


                break;
            case 4:
                lanche = new HotDog();


                break;
            case 5:
                lanche = new MinePizza();

                break;
            default:
                System.err.println("Escolha uma opção valida!");
        }
        in.nextLine();
        if (escolha == 1 || escolha == 2) {
            System.out.println("lanche aberto? (S/N):");
            String aberto = in.nextLine();
            ((XBurguer) lanche).aberto = aberto.equalsIgnoreCase("S");

        } else if (escolha == 5) {
            System.out.print("Deseja sem bora ou com? S/N");
            String Receba = in.nextLine();
            MinePizza miniPizza = ((MinePizza) lanche);
            miniPizza.Borda = Receba.equalsIgnoreCase("S");
            if (miniPizza.Borda) {
                System.out.println("Informe o sabor");
                miniPizza.Sabor = in.nextLine();
            }

        }
        if (escolha == 1 || escolha == 2 || escolha == 3 || escolha == 4) {
            Sanduiches add = ((Sanduiches) lanche);
            System.out.print("Deseja sem adicionais ou com? S/N");
            String Receba = in.nextLine();
            //qual o adicional
            // add.adicionarAdicional()
            // perguntar se quer continuar
            if (Receba.equalsIgnoreCase("S")){
                System.out.print("Deseja quantas adicionais?");
                int Receba2 = in.nextInt();
                in.nextLine();
                for (int i = 0; i < Receba2; i++) {
                    // pedir o add
                    Sanduiches miniPizza = ((Sanduiches) lanche);
                    System.out.println("Digite seu novo adicional: ");
                    String a = in.nextLine();
                    miniPizza.adicionarAdicional(a);
                    //pedir se deseja continuar
                }
            }

        }
        System.out.println("Informe o valor do lanche R$: ");
        lanche.valor = in.nextDouble();
        lanche.montarComanda();
    }
}
