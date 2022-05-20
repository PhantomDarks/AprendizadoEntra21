package PedraPapelTesoura;

import java.util.Scanner;

public class PPT {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a palavra para o jogo: ");
        String palavraDesconhecida = ler.nextLine().toUpperCase();
        for ( int i = 0; i < 100; i++) {
            System.out.println("");
        }
        int tamanho = palavraDesconhecida.length();
        int erros =0;
        int acertos = 0;
        char letra;

        char charsAcertos[] = new char[tamanho];
        for(int i=0; i<tamanho; i++)
        {
            charsAcertos[i] += '_';
        }

        boolean achou = false;
        while(erros<6 && acertos<tamanho)
        {
            if(erros==0)
            {
                System.out.println("------------------------");
                System.out.println("|----------------------|");
                System.out.println("|                       ");
                System.out.println("|                       ");
                System.out.println("|                       ");
            }
            else if(erros==1)
            {
                System.out.println("------------------------");
                System.out.println("|----------------------|");
                System.out.println("|                      O");
                System.out.println("|                       ");
                System.out.println("|                       ");
            }
            else if(erros==2)
            {
                System.out.println("------------------------");
                System.out.println("|----------------------|");
                System.out.println("|                      O");
                System.out.println("|                      |");
                System.out.println("|                       ");
            }
            else if(erros==3)
            {
                System.out.println("------------------------");
                System.out.println("|----------------------|");
                System.out.println("|                      O");
                System.out.println("|                      |\\");
                System.out.println("|                       ");
            }
            else if(erros==4)
            {
                System.out.println("------------------------");
                System.out.println("|----------------------|");
                System.out.println("|                      O");
                System.out.println("|                     /|\\");
                System.out.println("|                       ");
            }
            else if(erros==5)
            {
                System.out.println("------------------------");
                System.out.println("|----------------------|");
                System.out.println("|                      O");
                System.out.println("|                     /|\\");
                System.out.println("|                       \\ ");
            }
            else if(erros==6)
            {
                System.out.println("------------------------");
                System.out.println("|----------------------|");
                System.out.println("|                      O");
                System.out.println("|                     /|\\");
                System.out.println("|                     / \\");
            }
            System.out.println("Digite uma letra: ");
            letra = ler.next().toLowerCase().charAt(0);

            if(String.copyValueOf(charsAcertos).indexOf(letra) == -1)
            {
                for (int i=0; i<tamanho; i++)
                {
                    if(palavraDesconhecida.charAt(i)==letra)
                    {
                        charsAcertos[i]=letra;
                        achou = true;
                        acertos++;
                    }
                }
                if (!achou)
                {
                    erros++;
                }
            }
            System.out.println("Erros: "+erros);

            for(int i=0; i<tamanho; i++)
            {
                System.out.print(charsAcertos[i]+" ");
            }
            achou = false;
            System.out.println();
        }
        {
            System.out.println("Você foi enforcado!");
            System.out.println("A palavra era: " +palavraDesconhecida);
        }
     //   if(erros==6)
       // else
        {
            System.out.println("PARABÉNS, você acertou a palavra!");
        }
    }
    }


