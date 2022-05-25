package Classes;

public class MinePizza extends Lanche {
    public boolean Borda;
    public String Sabor;
    public MinePizza(){

    this.adicionarIngrediente("Oregane");
        this.adicionarIngrediente("Masse");
        this.adicionarIngrediente("Calapreza");
        this.adicionarIngrediente("CascaDeEucalipso");
        this.tipo = "MinePizza";}

    @Override
    public void montarComanda(){
        super.montarComanda();
        if (this.Borda){
            System.out.println("-- Borda --");
            System.out.println("-Borda recheada: " + Sabor);

        }

    }
}
