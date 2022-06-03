package Classes;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tarefa t = new Tarefa();
        System.out.println(t.getUuid());
        System.out.println("Digite o  nome da tarefa:  ");
       t.setNome(in.nextLine());
        System.out.println("Descrição da tarefa:");
        t.setdeescrição(in.nextLine());


        System.out.println(t.getUuid());
        System.out.println(t.getNome());
        System.out.println(t.getdeescrição());
    }


}
