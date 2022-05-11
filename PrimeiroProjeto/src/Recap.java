import java.util.Locale;
import java.util.Scanner;

public class Recap {
    public static void main(String[] args) {


        // inteiros
        int var1 = 10;
        //caractere unico
        char var2 = 'a';
        //texto
        String var3 = "abcdefghi fexiv";
        //valor logico
        boolean var4 = true;
        //decimais numeros quebrados
        double var5 = 5.6;


        //saida -  mensagens ao usuario
        System.out.println(); // exibe mensagem e quebra a linha
        System.out.print(""); // exibe mensagem sem quebrar a linha
        System.out.printf("%f %.2f, %s", 10, 4.6788, "texto"); // exine mensagem formatada sem quebra de linha

        //entrada - entrada de usuario pelo console
        Scanner in = new Scanner(System.in);
        in.next(); // espera o  usuario digitar
        in.nextInt(); // espera o usuario digitar, pega valores inteiros
        in.nextDouble(); //espera o usuario digitar, pega valores decimais

        //operações aritimeticas
        var1 = 10 + 10;//soma
        var1 = 10 - 10;//subtração
        var1 = 10 / 10;//divisão
        var1 = 10 * 10;//multiplicação
        var1 = 10 % 10;//resto de divisão

        //operadores relacionais - SEMPRE RETORNAM O VALOR BOOLEAM
        var4 = 10 > 10; //maior que
        var4 = 10 >= 10; //maior que ou igual
        var4 = 10 < 10;// menor que
        var4 = 10 <= 10;//menor que ou igual
        var4 = 10 == 10;// igualdade
        var4 = 10 != 10;// diferença

        //operações logicas =   COMPARAÇÃO ENTRE VALORES BOOLEANOS
        var4 = true && false; // true e false - só verdade quando ambas entradas forem verdade
        var4 = true || false; // true ou false - Só false quando ambas as entradas forem falsas
        var4 = !true; // Não false
        var4 = true ^ true;// XOR - só verdade quando ambas as entradas forem iguais

        //condicionais - estruturas de seleção
        //if -> Analisa uma condição de executar os determinados codigos
        if (true) {
            //se a condição for verdade executa esse trecho de codigo
        } else {
            // senão executa esse

        }
        if (var1 == 1) {
            //se a a primeira condição for verdade esse trexo executa

        } else if (var1 == 2) {

            //se não se a segunda condição for verdadeira executa esse trxo
        } else {
            //se não executa esse

        }
        //espera um valor e compara esse valor com cada caso informado
        switch (var1) {
            case 1:
                System.out.println("um");
                break;// se nao tiver break, o codigo continuara sendo executado linha por linha
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("quatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            // se o valor não for igual a nenhum caso, o padrão é executado
            default:
                System.out.println("não sei");
                break;


         }
            //repetição
            // irá repetir um trecho de codigo
         // enquanto a condição for verdade
            for (int i = 0; i <= 10; i++) {
            //codigo repetido a cada interação
            System.out.println(i);
            }


            //while - irá repetir um trecho de codigo por um numero de vezes desconhecidas
            // em quanto for verdade
            while (var1 != 0){

                System.out.println("teste");
                var1 = in.nextInt();
                //atualização da variavel utilizada na condição do while, caso esse valor não seja utilizado ira gerar um loop infinito
            }

            while (true){

            }
            //string
        //var3 = "did you know abouujhf";
        //System.out.println(var3.length()); // length() retorna a quantidade total de caracteres no texto
        //System.out.println(var3.charAt(0)); //charAt() retorna o caractere na posição x do texto
        //System.out.println(var3.equals("teste")); // equals() realiza comparação entre strings
        //System.out.println(var3.toLowerCase()); // toLoweCase() converte os caracteres da string pra minusculo
        //System.out.println(var3.toUpperCase()); // toUpperCase() converte todos os caracteres  da string para maiusculo
//        System.out.println(var3.contains("1")); //contains() checa se o texto informado contem string do parametro

        //System.out.println(var3.strip()); //  strip remove os espaços do começo e do fina do texto
        //String[] splitted = var3.split(" "); // split() ira quebrar o textro no delimitador informado e retornar uma lista das palavras

       // System.out.println(var3.substring(5, 8) ); // pega os numeros entre eles

        //concat

       // int[] numeros = {0,1,2,3,4,5,6,7,8,9} // iniciando uma lista de valores
        //int numeros2 = new int[10]; //iniciando lista vazia

        //System.out.println(numeros[6]);//recuperando um valor da lista
       // numeros2[4] = in.nextInt();//inserindo um valor no array
       // System.out.println(numeros.length);//pegando um valor no array
       // for (int i = 0; i < numeros.length; i++){
           // System.out.println(numeros[i]);

        }
            //matriz
       // int[][] numers3= {{0,1,2,3,4},{5,6,7,8,9,},};//iniciando uma matriz com valores
       // int [][] numero4 = new int[2][5]; //iniciando matriz sem valor
       // numero4 [1] = new int[]{7 , 8, 9, 0};
       // numero4[0][0] = 9; //inserindo dados em uma posição da matriz

       // System.out.println(numers3.length); //numero de linhas da matriz
      //  System.out.println(numers3[0].length);//quantidade de itens na linha da matriz

       // for (int i = 0; i<numers3.length; i++){

        //    for(int j = 0; j < numers3[i].length; j++){
         //       System.out.println(numers3 [i][j]);

       //     }
      // }
    }

