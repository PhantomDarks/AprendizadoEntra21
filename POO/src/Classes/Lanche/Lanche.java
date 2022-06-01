package Classes;

public abstract class Lanche {
    private String[] ingredientes = new String[10];
    private double valor;

    private   String tipo;


    public  void  adicionarIngrediente(String ingredientes){
        for (int i = 0; i < 10; i++){
            if (this.ingredientes[i] ==null){
                this.ingredientes[i] = ingredientes;
                break;

            }
        }
    }
    public void montarComanda(){
        if (this instanceof MinePizza){
            System.out.println("===="+ this.tipo + " - " + ((MinePizza)this).getSabor()+ "====");
        } else {
            System.out.println("===="+this.tipo+"====");
        }
        System.out.printf("Valor: R$%.2f\n", this.valor);
        System.out.println("-INGREDIENTES-");
        for (String ingrediente: this.ingredientes){
            if (ingrediente != null){
                System.out.println(ingrediente);
            }
        }
        System.out.println("---------------");

    }
    public void setValor(String Valor){
        this.valor = valor;

    }
    public double getValor(){

        return  this.valor;
    } public void setTipo(String Tipo){
        this.tipo = tipo;

    }
    public String getTipo(String mistoQuente){

        return  this.tipo;
    }
}
