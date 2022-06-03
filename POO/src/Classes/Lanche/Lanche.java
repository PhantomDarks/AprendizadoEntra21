package Classes.Lanche;

public abstract class Lanche {
    private String[] ingredientes = new String[10];
    private double valor;

    private String tipo;


    public void adicionarIngrediente(String ingredientes) {
        for (int i = 0; i < 10; i++) {
            if (this.ingredientes[i] == null) {
                this.ingredientes[i] = ingredientes;
                break;

            }
        }
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setValor(String Valor) {
        this.valor = valor;

    }

    public double getValor() {

        return this.valor;
    }

    public void setTipo(String Tipo) {
        this.tipo = tipo;

    }

    public String getTipo() {

        return this.tipo;
    }
}
