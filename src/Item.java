import java.util.Scanner;

public class Item {


    private Avaliacao[] avaliaçao = new Avaliacao[30];
    private String titulo;
    private String genero;
    private double valor;

    public void Avaliar1() {
        Scanner in = new Scanner(System.in);
        Avaliacao val = new Avaliacao();
        System.out.println("informe o nome do avaliador:");
        val.setNome(in.nextLine());

        System.out.println("digite a quantidade de estrelas");

        val.setRating(in.nextDouble());
        in.nextLine();
        for (int i = 0; i < 30; i++) {
            if (avaliaçao[i] == null) {
                avaliaçao[i] = val;
                break;
            }
        }

    }

    public double getTotalRating() {
        int quantidade = 0;
        double notaTot = 0;
        for (int i = 0; i < 30; i++) {
            if (avaliaçao[i] != null) {
                quantidade++;

            }

            if (avaliaçao[i] != null) {
                notaTot += avaliaçao[i].getRating();

            }

        }
        double total = notaTot / quantidade;
        return total;
    }

    // GETTER & SETTER
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Avaliacao[] getAvaliaçao() {
        return avaliaçao;
    }

    public void setAvaliaçao(Avaliacao[] avaliaçao) {
        this.avaliaçao = avaliaçao;
    }

}
