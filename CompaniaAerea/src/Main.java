import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int vertical = 0;
        int horizontal = 0;
        while (true){
        System.out.println("Informe a quantidade de linhas de cadeiras: ");
        horizontal = in.nextInt();}x
        System.out.println("informe a quantidade de cadeiras por coluna: ");
        vertical = in.nextInt();
        VOO v = new VOO(horizontal, vertical);
        v.mostrarAssentos();
        while (v.quantidadeLivre()>0){
            System.out.println("Informe o código do assento: ");
            String cod = in.nextLine();
            if (!v.verificaOcupacao(cod)){
                v.ocupar(cod);
                System.out.println("deseja vender outra passagem? s/n?");
                String res = in.nextLine();
                if (res.equalsIgnoreCase("N"))
            }else {
                System.err.println("CADEIRA OCUPADA! SELECIONE OUTRA CADEIRA!");
            }
        }
    }
}
