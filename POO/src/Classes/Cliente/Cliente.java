package Classes.Cliente;

import Classes.Pedido.Pedido;

public class Cliente {

    public Cliente(){
        this.setPedido(new Pedido());

    }
    private String nome;
    private Pedido pedido;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
