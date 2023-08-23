import java.util.Scanner;

public class ExMatrizes02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int diagonal =1;
        String valores ="";

        System.out.println("Informe o número de colunas e linhas da matriz quadrada: ");
        int val = in.nextInt();

        int matriz[][] = new int[val][val];

        for (int i=0; i< val; i++) {
            for (int j = 0; j < val; j++) {
                System.out.println("Informe o valor para a posição na linha " + (i + 1) + " na coluna " + (j + 1) + " para a matriz: ");
                matriz[i][j] = in.nextInt();

                if(j == i){
                    diagonal = diagonal * matriz[i][j];

                    if (i == (val-1) && j == (val-1)){
                        valores += matriz[i][j] + " ";
                    } else {
                        valores += matriz[i][j] + ", ";
                    }
                }
            }
        }

        System.out.println("Os elementos da diagonal principal são: "+valores);
        System.out.println("E sua multiplicação é: "+diagonal);

        in.close();

    }
}
