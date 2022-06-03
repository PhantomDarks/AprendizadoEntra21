package Classes.Lanche;

public class Pizza extends MinePizza {
    private String tamanho;

    public Pizza() {
        this.setTipo( "Pizza");
    }


public void setTamanho(String tamanho){

        this.tamanho = tamanho;
}
public  String getTamanho(){
        return this.tamanho;

}

}
