import java.util.Scanner;

public class ExMatrizes01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matrizA[][] = new int[3][3];
        int matrizB[][] = new int[3][3];
        int matrizC[][] = new int[3][3];

        for (int i=0; i< 3; i++){
            for (int j=0; j<3;j++){
                System.out.println("Informe o valor para a posição na linha "+(i+1)+" na coluna "+(j+1)+" para a matriz A: ");
                matrizA[i][j] = in.nextInt();
            }
        }
        System.out.println("\n");

        for (int i=0; i< 3; i++){
            for (int j=0; j<3;j++){
                System.out.println("Informe o valor para a posição na linha "+(i+1)+" na coluna "+(j+1)+" para a matriz B: ");
                matrizB[i][j] = in.nextInt();
            }
        }
        System.out.println("Soma das matrizes: ");
        for (int i=0; i< 3; i++){
            for (int j=0; j<3;j++) {
                matrizC[i][j] = matrizB[i][j] + matrizA[i][j];

                if (j==2){
                    System.out.print(matrizC[i][j]+"\n");
                } else {
                    System.out.print(matrizC[i][j]+" ");
                }
            }
        }

        in.close();
    }
}
