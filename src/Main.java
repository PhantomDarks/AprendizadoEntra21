import java.util.Scanner;

public class Main {
    public static Estantes E = new Estantes(5);

    public static void main(String[] args) {
        boolean controle = true;
        Scanner in = new Scanner(System.in);
        while (controle == true) {

            System.err.println("----ESCOLHA----");
            System.out.println("(1) - Adicionar Item");
            System.out.println("(2) - Buscar e tratar retorno");
            System.out.println("(3) - Remover");
            System.out.println("(4) - Mostrar Itens Da Estante");
            System.out.println("(0) - Sair");
            System.out.println("----------------");
            int caso = in.nextInt();
            switch (caso) {
                case 0:
                    controle = false;
                    break;
                case 1:
                    adicionarAEstante();
                    break;
                case 2:
                    buscarETratarRetorno();
                    break;
                case 3:
                    removerItensDaEstante();
                    break;
                case 4:
                    mostrarItens();
                    break;
                default:
                    System.out.println("Informe algo valido por gentileza");

            }
        }
    }

    //(1) - ADICIONAR ITEM
    public static void adicionarAEstante() {


        if (E.estanteCheia()) {
            System.out.println("Estante Cheia");
        } else {


            Scanner in = new Scanner(System.in);
            Item it = null;
            int escolha = 0;

            while (escolha < 1 || escolha > 2) {
                System.out.println("informe se seria um (1)dvd ou (2)livro:");
                escolha = in.nextInt();

                if (escolha < 1 || escolha > 2) {
                    System.out.println("Selecione uma opção valida");
                }
            }

            for (int i = 1; i < 6; i++) {


                if (escolha == 1 || escolha == 2) {
                    System.out.println("quer continuar? 1- sim, 2- Não");
                    int c = in.nextInt();

                    if (c == 1) {
                        if (escolha == 1) {
                            DVD D = new DVD();
                            System.out.println("Informe o ano do lançamento: ");
                            D.setAnoLancamento(in.nextInt());
                            in.nextLine();
                            System.out.println("Informe Duração");
                            D.setDuracao(in.nextDouble());
                            in.nextLine();
                            System.out.println("Nome do diretor:");
                            D.setDiretor(in.nextLine());
                            System.out.println("Informe o genero");
                            D.setGenero(in.nextLine());
                            System.out.println("Nome do Dvd:");
                            D.setTitulo(in.nextLine());
                            System.out.println("Valor R$: ");
                            D.setValor(in.nextDouble());
                            E.adicionarItem(D);

                        } else if (escolha == 2) {
                            Livro L = new Livro();
                            System.out.println("Informe o ano do lançamento: ");
                            L.setAnoPublicacao(in.nextInt());
                            System.out.println("Informe o Titulo");
                            L.setTitulo(in.nextLine());
                            in.nextLine();
                            System.out.println("Informe a edição");
                            L.setEdicao(in.nextInt());
                            in.nextLine();
                            System.out.println("Informe o genero");
                            L.setGenero(in.nextLine());
                            System.out.println("Nome do Livro:");
                            L.setTitulo(in.nextLine());
                            System.out.println("Valor R$: ");
                            L.setValor(in.nextDouble());
                            E.adicionarItem(L);


                        }
                    } else if (c == 2) {
                        break;
                    }
                } else {
                    System.err.println("INFORME UM NUMERO VALIDO");
                    i--;


                }
            mostrarItens();


            }

        }
    }

    //(2) - Buscar e tratar retorno
    public static void buscarETratarRetorno() {



    }

    //(3) - Remover
    public static void removerItensDaEstante() {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual seria a posição do livro?");
       int numero = in.nextInt();
        E.removerItem(numero);


    }


    //(4) - Mostrar Itens Da Estante
    public static void mostrarItens() {



        for (Item j : E.getItens()) {
            if (j != null) {
                if (j instanceof Livro) {
                    System.out.println("        LIVRO");
                } else if (j instanceof DVD) {
                    System.out.println("          DVD");
                }

                System.out.println("Título: " + j.getTitulo());
                System.out.println("Valor R$: " + j.getValor());
                System.out.println("Genero: " + j.getGenero());
                if (j instanceof DVD) {
                    System.out.println("Ano de Lançamento: " + ((DVD) j).getAnoLancamento());
                    System.out.println("Duração do filme: " + ((DVD) j).getDuracao() + "minutos");
                    System.out.println("Diretor: " + ((DVD) j).getDiretor());



                } else if (j instanceof Livro) {
                    System.out.println("Publicação: " + ((Livro) j).getAnoPublicacao());
                    System.out.println("Autor: " + ((Livro) j).getAutor());
                    System.out.println("Edição: " + ((Livro) j).getEdicao());
                    System.out.println(" ");

                }


            }

        }

    }
}