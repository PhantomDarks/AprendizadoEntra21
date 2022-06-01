package Classes;

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

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.aberto) {
            System.out.println("- LANCHE ABERTO --");
        }

    }
    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    public boolean getAberto(boolean s){
        return this.aberto;

    }
}