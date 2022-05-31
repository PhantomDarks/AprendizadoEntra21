public class VOO {
    public String[][] codificacaoAssentos;
    public boolean[][] ocupacaoAsentos;

    public VOO(int linhas, int colunas) {
        this.codificacaoAssentos = new String[linhas][colunas];
        this.ocupacaoAsentos = new boolean[linhas][colunas];
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                this.codificacaoAssentos[i][j] = String.valueOf(alfabeto.charAt(i)) + String.valueOf(j + 1) + " ";
            }
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(this.codificacaoAssentos[i][j]);
            }
            System.out.println();
        }
    }

    public boolean verificaOcupacao(String codigo) {
        for (int i = 0; i < this.codificacaoAssentos.length; i++) {
            for (int j = 0; this.codificacaoAssentos[i].length > j; j++) {
            if (this.codificacaoAssentos[i][j].equalsIgnoreCase(codigo)){
               return this.ocupacaoAsentos[i][j];
            }
                   }
        }
        return false;
    }

    public boolean ocupar(String codigo) {
        for (int i = 0; i < this.codificacaoAssentos.length; i++) {
            for (int j = 0; this.codificacaoAssentos[i].length > j; j++) {
                if (this.codificacaoAssentos[i][j].equalsIgnoreCase(codigo)){
                    return this.ocupacaoAsentos[i][j];
                }
            }
        }


        return false;
    }

    public int quantidadeLivre() {
       int quantidadeLivre = 0;
        for (int i = 0; i < this.codificacaoAssentos.length; i++) {
            for (int j = 0; j < this.codificacaoAssentos[i].length; j++)
                if (!this.ocupacaoAsentos[i][j]) {
                    quantidadeLivre++;
                }
        }
        return 0;
    }

    public void mostrarAssentos() {
        for (int i = 0; i < this.codificacaoAssentos.length; i++) {
            for (int j = 0; j < this.codificacaoAssentos[i].length; j++)
                if (this.ocupacaoAsentos[i][j]) {
                    System.out.println("-");
                } else {
                }
        }
    }
}
