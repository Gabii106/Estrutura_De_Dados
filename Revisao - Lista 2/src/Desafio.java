import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] padrao = new int[3][3];
        Random gerador = new Random();
        int vezes = 0;

        System.out.print("Digite o número de linhas da imagem: ");
        int numL = in.nextInt();
        System.out.print("Digite o número de colunas da imagem: ");
        int numC = in.nextInt();

        int imagem[][] = new int[numL][numC];

        System.out.println("Imagem: ");
        for( int i = 0;  i<numL;i++) {
            for (int j = 0; j < numC; j++) {
                imagem[i][j] = gerador.nextInt(2);
                 if (j == numC - 1) {
                    System.out.print(imagem[i][j] + "\n");
                } else {
                    System.out.print(imagem[i][j] + " ");
                }
            }
        }


        for(int i = 0; i< 3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Informe o valor para a posição na linha " + (i + 1) + " na coluna " + (j + 1) + " para a matriz padrão: ");
                padrao[i][j] = in.nextInt();
            }
        }


        for(int i = 0; i <=numL -3;i++) {
            for (int j = 0; j <= numC - 3; j++) {
                if (comparar(imagem, i, j, padrao)) {
                    vezes++;
                }
            }
        }

        System.out.println("O padrão aparece "+vezes+" vezes na imagem");


        in.close();

}

    private static boolean comparar(int[][] imagem, int a, int b, int[][] padrao) {
        for (int c = 0; c < 3; c++) {
            for (int d = 0; d < 3; d++) {
                if (imagem[a + c][b + d] != padrao[c][d]) {
                    return false;
                }
            }
        }
        return true;
    }

}
