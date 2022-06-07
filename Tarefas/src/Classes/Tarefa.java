package Classes;

import java.util.UUID;

public class Tarefa {
    private ChecklistItem[] item;
    private String uuid;
    private String nome;
    private String deescrição;
    private boolean completa;


    private int Ordem;


    public Tarefa() {
        this.setUuid(UUID.randomUUID().toString());
    }

    public void completar() {
        setCompleta(true);
for (ChecklistItem item : this.getItem()){
    if (item != null){
        item.completar();
    }
}
    }

    // GETTER & SETTER
    public int getOrdem() {
        return Ordem;
    }

    public void setOrdem(int ordem) {
        Ordem = ordem;
    }


    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getNome() {

        return this.nome;
    }


    public void setCompleta(Boolean completa) {
        this.completa = completa;

    }

    public boolean getcompleta() {

        return (this.completa);
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ChecklistItem[] getItem() {
        return item;
    }

    public void setItem(ChecklistItem[] item) {
        this.item = item;
    }

    public String getUuid() {
        return this.uuid;

    }
    public void criarChecklist(int tamanho){
this.setItem(new ChecklistItem[tamanho]);

    }
    public boolean temChecklist() {
        return this.getItem() != null;

    }
    public boolean adicionarCheklistItem(ChecklistItem item) {
        for (int i = 0; i < this.getItem().length; i++) {
            if (this.getItem()[i] == null) {
                this.getItem()[i] =item;
                return true;
            }
        }
        return false;

    }

    public void setdeescrição(String deescrição) {
        this.deescrição = deescrição;
    }

    public String getdeescrição() {
        return this.deescrição;
    }

}

