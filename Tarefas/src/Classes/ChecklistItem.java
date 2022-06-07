package Classes;

import java.util.UUID;

public class ChecklistItem {



    private String uuid;
    private String nome;
    private String descrição;
    private boolean completa;



    public ChecklistItem() {
        this.setUuid(UUID.randomUUID().toString());
    }

    public void completar() {

        //todo
    }


    //GETTER  E SETTER
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }



}
