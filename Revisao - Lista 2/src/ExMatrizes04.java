import java.util.Scanner;

public class ExMatrizes04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o número de linhas da matriz: ");
        int valLinhas = in.nextInt();
        System.out.println("Informe o número de colunas da matriz: ");
        int valColunas = in.nextInt();

        int matriz[][] = new int[valLinhas][valColunas];


        for (int i=0; i< valLinhas; i++) {
            for (int j = 0; j < valColunas; j++) {
                System.out.println("Informe o valor para a posição na linha " + (i + 1) + " na coluna " + (j + 1) + " para a matriz: ");
                matriz[i][j] = in.nextInt();
            }
        }
        System.out.println("\n");
        System.out.println("Informe o número que deseja multiplicar a matriz: ");
        int num = in.nextInt();

        for (int i=0; i< valLinhas; i++) {
            for (int j = 0; j < valColunas; j++) {
                matriz[i][j] = num * matriz[i][j];
                if(j==2){
                    System.out.print(matriz[i][j]+" \n");
                }else {
                    System.out.print(matriz[i][j]+" ");
                }
            }
        }

        in.close();

    }
}
