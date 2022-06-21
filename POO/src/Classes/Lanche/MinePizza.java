package Classes.Lanche;

public class MinePizza extends Lanche {
    private boolean Borda;
    private String SaborBorda;
    private String Sabor;

    public MinePizza() {

        this.adicionarIngrediente("Masse");
        this.adicionarIngrediente("CascaDeEucalipso");
        this.setTipo("MinePizza");
    }


    public void AdicionarSaborEIngredientes(String batata) {
        this.Sabor = batata;
        switch (batata.toUpperCase()) {
            case "4 QUEIJOS":
                this.adicionarIngrediente("cheddar");
                this.adicionarIngrediente("Catupiry");
                this.adicionarIngrediente("Provolone");
                break;
            case "CALAPREZA":
                this.adicionarIngrediente("Calapreza");
                break;
            case "FRANGO COM CATUPIRI":
                this.adicionarIngrediente("Frango");
                this.adicionarIngrediente("Catupiri");
                break;
            case "MARGUERITA":
                this.adicionarIngrediente("Tomate");
                this.adicionarIngrediente("Mangericão");
                break;
            case "PORTUGUESA":
                this.adicionarIngrediente("Presunto");
                this.adicionarIngrediente("Cebola ");
                this.adicionarIngrediente("Ovo");
                break;
        }

    }


    public void setBorda(boolean borda) {
        this.Borda = borda;
    }

    public boolean isBorda() {
        return this.Borda;
    }

    public void setSaborBorda(String SaborBorda) {
        this.SaborBorda = SaborBorda;

    }

    public String getSaborBorda() {
        return this.SaborBorda;

    }

    public void setSabor(String Sabor) {
        this.Sabor = Sabor;
    }

    public String getSabor() {
        return this.Sabor;
    }

    @Override
    public void mostrarDetalhesComanda() {

    }
}
