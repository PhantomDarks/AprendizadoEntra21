import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Pitaco {
    public static Random rdn = new Random();
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//QUE LEIA UM NUMERO DE ALUNOS DE UMA SALA E A NOTA DELE, INFORMAR O GABARITO MULTIPLA ESCOLHA
// E A PROVA, E DEPOIS A NOTA DELE, E DEPOIS A NOTA DE CADA ALUNO

        System.out.print("Informe o numero de alunos na sala: ");
        int NumeroDeAlunos = in.nextInt();
        System.out.print("Informe o número de questões:  ");
        int NdeQuestoes = in.nextInt();
        String[] Gabarito = new String[NdeQuestoes];

        String RespostaGabarito;
        in.nextLine();

        //Lista gabarito
        for (int i = 0; i < NdeQuestoes; i++) {
            System.out.print("Informe a resposta correta da " + (i + 1) + "º questão, de A até E: ");
            RespostaGabarito = in.nextLine().toLowerCase();

            if (RespostaGabarito.equals("a") || RespostaGabarito.equals("b") || RespostaGabarito.equals("c") || RespostaGabarito.equals("d") || RespostaGabarito.equals("e")) {
                Gabarito[i] = RespostaGabarito;
            } else {
                System.out.println("Resposta invalida! ");
                i--;
            }
        }

        //Lista de Alunos
        String Resposta = null;
        String[] NomeAlunos = new String[NumeroDeAlunos];
        String[][] RespostaAluno = new String[NumeroDeAlunos][NdeQuestoes];
        for (int i = 0; i < NumeroDeAlunos; i++) {
            System.out.print("Informe o nome do " + (i + 1) + "º aluno(a): ");
            NomeAlunos[i] = in.nextLine();
            //Respostas dos alunos
            for (int j = 0; j < NdeQuestoes; j++) {
                System.out.print("Informe a resposta do aluno " + NomeAlunos[i] + " na questão " + (j + 1) + ": ");
                Resposta = in.nextLine().toLowerCase();
                if (Resposta.equals("a") || Resposta.equals("b") || Resposta.equals("c") || Resposta.equals("d") || Resposta.equals("e")) {
                    RespostaAluno[i][j] = Resposta;
                } else {
                    System.out.println("Resposta invalida! ");
                    j--;
                }
            }
        }

        double[] notas = new double[NumeroDeAlunos];
        for (int j = 0; j < NumeroDeAlunos; j++) {
            double peso = 10 / (double) NdeQuestoes;
            for (int i = 0; i < NdeQuestoes; i++) {
                if (Gabarito[i].equals(RespostaAluno[j][i])) {
                    notas[j] += peso;
                }
            }
        }
        for (int i = 0; i < NumeroDeAlunos; i++) {
            System.out.println("a NOTA DO ALUNO " + NomeAlunos[i] + " é " + notas[i]);

        }
        System.err.println("\n");
        System.err.println("█████████ ");
        System.err.println("█▄█████▄█");
        System.err.println("█▼▼▼▼▼" );
        System.err.println("█   " + "!!!Matou o YanDev!!!");
        System.err.println("█▲▲▲▲▲");
        System.err.println("█████████");
        System.err.println( "██ ██");
    }
}
