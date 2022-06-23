import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashMap<String, Double> produtos = new HashMap<>();
        boolean executa = true;
        while (executa) {
            System.out.println("Menu: ");
            System.out.println("1- Cadastro de produto");
            System.out.println("2- buscar produto");
            System.out.println("3- mostrar produtos");
            System.out.println("0- Sair");
            int n = in.nextInt();
            in.nextLine();
            switch (n) {
                case 0:
                    executa = false;
                    break;
                case 1:
                    System.out.println("informe o nome do produto:");
                    String nome = in.nextLine().toLowerCase();
                    if (produtos.containsKey(nome)) {
                        System.out.println("produto ja existe, deseja atualizar o valor? (S/N)");
                        if (in.nextLine().equalsIgnoreCase("N")) {
                            continue;
                        }
                    }
                    System.out.println("Informe o valor:");
                    double valor = in.nextDouble();
                    produtos.put(nome, valor);
                    break;
                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produto:");
                    } else {
                        System.out.println("informe o produto");
                        String busca = in.nextLine().toLowerCase();
                        if (produtos.containsKey(busca)) {
                            System.out.println(busca + " : " + produtos.get(busca));
                        } else {
                            System.out.println("produto" + busca + "Não encontrado");
                        }
                    }
                    break;
                case 3:
                    System.out.println(produtos);
                    break;
                case 4:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produto:");
                    } else {
                        System.out.println("informe o produto");
                        String busca = in.nextLine().toLowerCase();
                        if (produtos.containsKey(busca)) {
                            produtos.remove(busca);
                        } else {
                            System.out.println("produto" + busca + "Não encontrado");
                        }


                    }break;
                default:
                    System.out.println("Informe algo valido");
                    break;


        }
    }

}
}

