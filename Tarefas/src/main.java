import Classes.Tarefa;

import java.util.Scanner;

public class main {
    public static  Scanner in = new Scanner(System.in);
    public static void main(String[] args) {





    }
    public static  Tarefa criartarefa(){
        Tarefa t = new Tarefa();
        System.out.println(t.getUuid());
        System.out.println("Digite o  nome da tarefa:  ");
        t.setNome(in.nextLine());
        System.out.println("Descrição da tarefa:");
        t.setdeescrição(in.nextLine());
        return t;
    }


}
