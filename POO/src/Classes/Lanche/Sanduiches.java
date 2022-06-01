package Classes;

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

    @Override
    public void montarComanda() {
        super.montarComanda();
        for (int i = 0; i < 10; i++) {
            if (this.adicionais[i] != null) {
                System.out.println(adicionais[i]);
            }
        }
    }

}


