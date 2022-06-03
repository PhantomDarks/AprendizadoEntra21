package Classes.Lanche;

public class XBurguer  extends Sanduiches
{

    private boolean aberto;

    public XBurguer() {

        this.adicionarIngrediente("Hamburguer");
        this.adicionarIngrediente("Queijunto");
        this.adicionarIngrediente("Preijo");
        this.adicionarIngrediente("Pão");
        this.setTipo( "XBurguer");
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    public boolean getAberto(boolean s){
        return this.aberto;

    }
}