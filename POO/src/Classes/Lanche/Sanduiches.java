package Classes.Lanche;

public abstract class Sanduiches extends Lanche {

    private String[] adicionais = new String[10];


    public void adicionarAdicional(String adicionar) {
        for (int i = 0; i < 10; i++) {
            if (this.adicionais[i] == null) {
                this.adicionais[i] = adicionar;
                break;
            }
        }
    }

    public String[] getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(String[] adicionais) {
        this.adicionais = adicionais;
    }
}


