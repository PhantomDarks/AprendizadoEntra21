package Classes;

public class Pizza extends MinePizza {
    private String tamanho;

    public Pizza() {
        this.setTipo( "Pizza");
    }

    public void montarComanda() {
        super.montarComanda();
        System.out.println("Tamanho: " + this.tamanho);
    }
public void setTamanho(String tamanho){

        this.tamanho = tamanho;
}
public  String getTamanho(){
        return this.tamanho;

}

}
