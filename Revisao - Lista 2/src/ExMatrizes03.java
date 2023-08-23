import java.util.Scanner;

public class ExMatrizes03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o número de colunas e linhas da matriz quadrada: ");
        int val = in.nextInt();

        int matriz[][] = new int[val][val];

        boolean transposta = true;

        for (int i=0; i< val; i++) {
            for (int j = 0; j < val; j++) {
                System.out.println("Informe o valor para a posição na linha " + (i + 1) + " na coluna " + (j + 1) + " para a matriz: ");
                matriz[i][j] = in.nextInt();
            }
        }

        for (int i=0; i< val; i++) {
            for (int j = 0; j < val; j++) {
                if(matriz[i][j] != matriz[j][i]){
                    transposta = false;
                }
            }
        }

        if (transposta){
            System.out.println("Essa matriz é simétrica");
        } else {
            System.out.println("Essa matriz não é simétrica");
        }

        in.close();

    }
}
