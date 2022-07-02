package classes;

import java.util.ArrayList;

public class Aviao implements MeioTransporte {
    private ArrayList<AssentoVoo> acntvoo = new ArrayList<>();


    //------------------------------------------------------------------
    public ArrayList<AssentoVoo> getAcntvoo() {
        return acntvoo;
    }

    public void setAcntvoo(ArrayList<AssentoVoo> acntvoo) {
        this.acntvoo = acntvoo;
    }

    @Override
    public boolean verificaOcupacao(String a) {
        for (AssentoVoo i : acntvoo) {
            if (i.getCodigo().equalsIgnoreCase(a)) {
                return i.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int w = 0;
        for (AssentoVoo i : acntvoo) {
            if (!i.isOcupado()) {
                w++;
            }
        }
        return w;
    }

    @Override
    public void mostrarAssentos() {


    }

    @Override
    public Assento getAssento(String s) {
        for(AssentoVoo i: acntvoo){
            if (i.getCodigo().equalsIgnoreCase(s)){
                return i;
            }
        }
        return null;
    }
    public Assento getAssento(String assento, ClasseAssentoVoo classe) {
        for (AssentoVoo i: acntvoo){

            if (i.getCodigo().equalsIgnoreCase(assento)&& i.getClasse().equals(classe)){
                return i;
            }
        }

        return null;
    }
}
