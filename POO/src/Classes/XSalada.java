package Classes;

public class XSalada extends XBurguer {

    public XSalada(){
        this.adicionarIngrediente("Alface");
        this.adicionarIngrediente("Tomate");
        this.adicionarIngrediente("Milho");
        this.adicionarIngrediente("Picles");
        this.adicionarIngrediente("Maionese");
        this.tipo = "XSalada";

    }
    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.aberto) {
            System.out.println("- LANCHE ABERTO --");
        }

    }
}
