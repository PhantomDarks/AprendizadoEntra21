package Classes;

public class XBurguer  extends Lanche {

    public boolean aberto;

    public XBurguer() {

        this.adicionarIngrediente("Hamburguer");
        this.adicionarIngrediente("Queijunto");
        this.adicionarIngrediente("Preijo");
        this.adicionarIngrediente("Pão");
        this.tipo = "XBurguer";
    }


}