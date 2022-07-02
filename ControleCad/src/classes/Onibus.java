package classes;

import java.util.ArrayList;


public class Onibus implements MeioTransporte {

    private ArrayList<AssentoOnibus> acntOni = new ArrayList<>();

    public Onibus(int linhasCadeira) {


        for (int i = 1; i <= 4 * linhasCadeira; i++) {
            AssentoOnibus a = new AssentoOnibus();
            a.setLugar(String.valueOf(i));
            acntOni.add(a);
        }
    }

    //-------------------------------------------------------
    public ArrayList<AssentoOnibus> getAcntOni() {
        return acntOni;
    }

    public void setAcntOni(ArrayList<AssentoOnibus> acntOni) {
        this.acntOni = acntOni;
    }


    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoOnibus i : this.getAcntOni()) {
            if (i.getLugar().equalsIgnoreCase(assento)) {
                return i.isOcupado();
            }
            return false;
        }

        return false;
    }

    @Override
    public int quantidadeLivre() {
        int w = 0;
        for (AssentoOnibus i : acntOni) {
            if (!i.isOcupado()) {
                w++;
            }
        }
        return w;
    }

    @Override
    public void mostrarAssentos() {
        for (int i = 0; i < acntOni.size(); i++) {
            if (i % 4 == 0) {
                System.out.println();
            } else if (i % 2 == 0) {
                System.out.print("||");
            }

            if (acntOni.get(i).isOcupado()) {
                System.out.print(" [XX] ");
            } else if (i< 9 ){
                System.out.print(" [0" + getAcntOni().get(i).getLugar() + "] " );
            }else {
                System.out.print(" [" + getAcntOni().get(i).getLugar() + "] ");
            }

        }}




    @Override
    public Assento getAssento(String s) {
        for (AssentoOnibus i : acntOni) {

            if (i.getLugar().equalsIgnoreCase(s)) {
                return i;
            }
        }
        return null;

    }
}
