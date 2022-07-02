package Classes;

import Classes.CatasAll.Carta;
import Classes.CatasAll.Naipe;
import Classes.CatasAll.ValorCarta;

import java.awt.font.FontRenderContext;
import java.util.ArrayList;

public class Baralho {
    private ArrayList<Carta> cartas = new ArrayList<>();

    public Baralho() {
        int valorNipe = 1;
        for (Naipe n : Naipe.values()) {
            int valorCarta = 1;
            for (ValorCarta vc : ValorCarta.values()) {
                Carta c = new Carta();
                c.setValor(vc);
                c.setNaipe(n);
                c.setValorReal(valorCarta);
            }
        }
    }

    public void shuffle() {

    }

    public Carta getFromTop() {
        return this.cartas.remove(0);
    }

    public Carta getFromBottom() {
        return this.cartas.remove(this.cartas.size() - 1);

    }

    public Carta searchCard(Naipe naipe, ValorCarta valor) {
        return this.cartas.stream().filter(carta -> naipe.equals(carta.getNaipe()) && valor.equals(carta.getValor())).findFirst().orElse(null);
    }


    public Carta searchCard(Naipe naipe, int valorReal) {

    }
}