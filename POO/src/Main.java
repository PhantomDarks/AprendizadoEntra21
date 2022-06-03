import Classes.Lanche.*;

import java.util.Scanner;

public class Main {
    public static  Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        montarLanche();
    }
    private static  void montarLanche(){
        Scanner in = new Scanner(System.in);
        System.out.println("-MENU: Escolha uma opção");
        System.out.println("(1)- X-Salada");
        System.out.println("(2)- X-Burguer");
        System.out.println("(3)- Misto quente");
        System.out.println("(4)- Hotdog");
        System.out.println("(5)- MinePizza");
        System.out.println("(6)- Pizza");
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
            case 6:

                lanche = new Pizza();
                break;
            default:
                System.err.println("Escolha uma opção valida!");
        }
        in.nextLine();
        if (escolha == 1 || escolha == 2) {
            System.out.println("lanche aberto? (S/N):");
            String aberto = in.nextLine();
            ((XBurguer) lanche).setAberto(aberto.equalsIgnoreCase("S"));

        } else if (escolha == 5) {
            System.out.println("Deseja qual sabor?");
            System.out.println("(1) - 4 Queijos");
            System.out.println("(2) - Calapreza");
            System.out.println("(3) - Frango com catupiri");
            System.out.println("(4) - Marguerita");
            System.out.println("(5) - Portuguesa");
            int sabor = in.nextInt();
            in.nextLine();
            MinePizza miniPizza = ((MinePizza) lanche);
            switch (sabor) {
                case 1:
                    miniPizza.AdicionarSaborEIngredientes("4 QUEIJOS");
                    break;
                case 2:
                    miniPizza.AdicionarSaborEIngredientes("calapreza");
                    break;
                case 3:
                    miniPizza.AdicionarSaborEIngredientes("frango com catupiri");
                    break;
                case 4:
                    miniPizza.AdicionarSaborEIngredientes("marguerita");
                    break;
                case 5:
                    miniPizza.AdicionarSaborEIngredientes("portuguesa");
                    break;
                default:
                    System.err.println("!!!!!!!escolha algo valido!!!!!!!!!");
            }
            if (lanche instanceof Pizza){
                System.out.println("Informe o tamanho da pizza:");
                System.out.println("XS- BROTO");
                System.out.println("SM - pequena");
                System.out.println("MD - media");
                System.out.println("LG - grande");
                System.out.println("XL - familia");
                ((Pizza)lanche).setTamanho(in.nextLine().toUpperCase());//armazena um valor para uma public string fora da main

            }

            System.out.print("Deseja sem borDa ou com? S/N");
            String Receba = in.nextLine();

            miniPizza.setBorda( Receba.equalsIgnoreCase("S"));
            if (miniPizza.isBorda()) {
                System.out.println("Informe o sabor");
                miniPizza.setSabor(in.nextLine());
            }

        }
        if (escolha == 1 || escolha == 2 || escolha == 3 || escolha == 4) {
            Sanduiches add = ((Sanduiches) lanche);
            System.out.print("Deseja sem adicionais ou com? S/N");
            String Receba = in.nextLine();
            //qual o adicional
            // add.adicionarAdicional()
            // perguntar se quer continuar
            if (Receba.equalsIgnoreCase("S")) {
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
            if (escolha == 5 || escolha == 6) {
                System.out.println("Deseja qual sabor?");
                System.out.println("(1) 4 Queijos");
                System.out.println("(2) Calapreza");
                System.out.println("(3) Frango com catupiri");
                System.out.println("(4) Marguerita");
                System.out.println("(5) Portuguesa");
                int sabor = in.nextInt();

            }
        }
        System.out.println("Informe o valor do lanche R$: ");
        lanche.setValor(String.valueOf(in.nextDouble()));
    }
}
