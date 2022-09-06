package classes;

public interface MeioTransporte {
    public boolean verificaOcupacao(String assento);

    public abstract int quantidadeLivre();

    public abstract void mostrarAssentos();

    public abstract Assento getAssento(String s);
}
