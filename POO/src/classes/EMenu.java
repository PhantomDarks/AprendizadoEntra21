package classes;

public enum EMenu {SAIR(1, "X-Salada"),
    ADICIONAR_ITEM(2, "X-Burguer"),
    BUSCAR_ITEM(3, "Misto Quente"),
    REMOVER_ITEM(4, "Hot Dog"),
    MOSTRAR_ITENS(5, "Mini Pizza"),
    ADICIONAR_ESTANTE(6, "Pizza");

    public static EMenu getByValorOpcao(int escolha) {
        for (EMenu e : EMenu.values()) {
            if (e.getValorOpcao() == escolha) {
                return e;
            }
        }
        return null;
    }

    private int valorOpcao;
    private String descricao;
    EMenu(int valor, String descricao) {
        valorOpcao = valor;
        this.descricao = descricao;
    }
    public int getValorOpcao() {
        return valorOpcao;
    }

    public void setValorOpcao(int valorOpcao) {
        this.valorOpcao = valorOpcao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
