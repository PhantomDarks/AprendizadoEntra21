package Classes;

import java.util.UUID;

public class Tarefa {
    private String uuid;
    private String nome;
    private String deescrição;
    private boolean completa;
    private int Ordem = 0;


    public Tarefa() {
        this.setUuid(UUID.randomUUID().toString());
    }

    public void completar() {
        setCompleta(true);

    }
    // GETTER & SETTER

    public  void setNome(String nome) {
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

    public String getUuid() {
        return this.uuid;

    }

    public void setdeescrição(String deescrição) {
        this.deescrição = deescrição;
    }

    public String getdeescrição() {
        return this.deescrição;
    }
}

