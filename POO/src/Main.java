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
            in.nextLine();
            String aberto = in.nextLine();
            ((XBurguer) lanche).aberto = aberto.equalsIgnoreCase("S");

        }else if (escolha == 5) {
            System.out.print("Deseja sem bora ou com? S/N");
            String Receba = in.nextLine();
            ((MinePizza)lanche).Borda = Receba.equalsIgnoreCase("S");
            if (Receba.equals('S')) {
                System.out.println("Informe o sabor");
                ((MinePizza) lanche).Sabor = in.nextLine();
            }
        }
        System.out.println("Informe o valor do lanche R$: ");
        lanche.valor = in.nextDouble();
        lanche.montarComanda();
    }
}
