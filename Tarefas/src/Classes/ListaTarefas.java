package Classes;

public class ListaTarefas {
    private Tarefa[] lista;
    private int tamanhoLista;
    private String nomeLista;

    public boolean adicionarTarf(Tarefa ti) {
        if (ti.getOrdem() < 0 ||
                ti.getOrdem() > this.getTamanhoLista()) {
            return false;
        }
        for (int i = 0; i < this.getTamanhoLista(); i++) {
            if (this.lista[i] == null) {
                this.lista[i] = ti;
                return true;
            } else if (this.lista[i].getOrdem() == ti.getOrdem()) {
                break;
            }
        }
        return false;
    }

    public Tarefa buscarTarefa(int posição) {

        for (Tarefa t : this.getLista()) {
            if (t != null &&
                    t.getOrdem() == posição) {
                return t;
            }
        }
        return null;

    }

    public boolean alterarOrdemTarefa(int antigaOrdem, int novaPosição) {
        Tarefa tarefaAntiga = buscarTarefa(antigaOrdem);
        Tarefa tarefaNova = buscarTarefa(novaPosição);
        if (tarefaAntiga == null || tarefaNova == null) {
            return false;
        }
        tarefaAntiga.setOrdem(novaPosição);
        tarefaNova.setOrdem(antigaOrdem);
        return true;


    }

    public ListaTarefas(int tamanhoLista) {
        this.setTamanhoLista(tamanhoLista);
        this.setLista(new Tarefa[tamanhoLista]);//cria uma lista de tarefas no privete lista, com o tamanho da lista

    }

    //Getter & SETTER
    public Tarefa[] getLista() {
        return lista;
    }

    public void setLista(Tarefa[] lista) {
        this.lista = lista;
    }

    public int getTamanhoLista() {
        return tamanhoLista;
    }

    public void setTamanhoLista(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }

    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }


}
