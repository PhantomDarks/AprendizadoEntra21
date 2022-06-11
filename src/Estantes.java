import java.util.Locale;

public class Estantes {
    private int capMaxima;
    private Item[] itens;

    public Estantes(int capMaxima) {
        setCapMaxima(capMaxima);
        setItens(new Item[capMaxima]);
    }


    public boolean estanteCheia() {
        return this.quantideDItens() == this.getCapMaxima();
    }

    public int quantideDItens() {
        int QtdDIt = 0;
        for (int i = 0; i < itens.length; i++) {
            if (itens[i] != null) {
                QtdDIt++;
            }
        }

        return QtdDIt;
    }

    public Item buscarItem(String titulo) {
        for (Item i : this.getItens()) {
            if (i != null && i.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                return i;
            }
        }

        return null;
    }


    public boolean adicionarItem(Item item) {
        for (int i = 0; i < itens.length; i++) {
            if (itens[i] == null) {
                itens[i] = item;
                return true;
            }
        }

        return false;
    }

    public Item removerItem(int posição) {
        Item i = itens[posição];
        this.getItens()[posição] = null;
        return i;
    }


    //GETTER & SETTER
    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }
}
