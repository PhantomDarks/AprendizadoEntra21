package Classes.Lanche;

public class MistoQuente extends Sanduiches{

    public MistoQuente(){
        this.adicionarIngrediente("Queijunto");
        this.adicionarIngrediente("Preijo");
        this.adicionarIngrediente("Pão");
        this.setTipo("MistoQuente");

    }

    @Override
    public void mostrarDetalhesComanda() {

    }
}
