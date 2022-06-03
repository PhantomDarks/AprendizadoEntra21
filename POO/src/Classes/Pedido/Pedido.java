package Classes.Pedido;

import Classes.Lanche.*;


public class Pedido {

    private Lanche[] lanches = new Lanche[10];

    public void imprimirComanda() {
        for (Lanche l : this.getLanches()) {
            if (l != null) {
                if (l instanceof MinePizza) {
                    MinePizza mp = ((MinePizza) l);
                    if (mp.isBorda()) {
                        System.out.println("-- Borda --");
                        System.out.println("-Borda recheada: " + mp.getSaborBorda());
                        System.out.println("====" + l.getTipo() + " - " + ((MinePizza) l).getSabor() + "====");
                    }
                    if (l instanceof Pizza) {
                        System.out.println("Tamanho: " + ((Pizza) l).getTamanho());
                    }
                } else {
                    System.out.println("====" + l.getTipo() + "====");
                }
                if (l instanceof XBurguer) {
                    if (((XBurguer) l).isAberto()) {
                        System.out.println("-- LANCHE ABERTO -- ");
                    }


                }
                System.out.printf("Valor: R$%.2f\n", l.getValor());
                System.out.println("-INGREDIENTES-");
                for (String ingrediente : l.getIngredientes()) {
                    if (ingrediente != null) {
                        System.out.println(ingrediente);
                    }
                }
                System.out.println("---------------");


                if (l instanceof Sanduiches) {
                    Sanduiches s = (Sanduiches) l;
                    if (s.getAdicionais()[0] != null) {
                        for (String add : s.getAdicionais()) {
                            System.out.println(add);
                        }
                    }
                }
            }


        }
        System.out.printf("Valor: R$%.2f\n", this.calcularValorTotal());
    }

    public double calcularValorTotal() {
        double valorTot = 0;
        for (int i = 0; i < 10; i++) {
            if (lanches[i] != null) {
                valorTot += lanches[i].getValor();
            }

        }


        return valorTot;
    }

    public void adicionarLanche(Lanche lanche) {
        for (int i = 0; i < 10; i++) {
            if (this.lanches[i] == null) {
                this.lanches[i] = lanche;
                break;

            }
        }
    }

    public Lanche[] getLanches() {
        return this.lanches;
    }
}
