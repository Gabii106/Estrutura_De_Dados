import java.util.Scanner;

public class ExMatrizes05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double matriz[][] = new double[3][3];
        double m1=0, m2=0, m3=0;

        for (int i=0; i< 3; i++){
            for (int j=0; j<3;j++){
                System.out.println("Informe o valor para a posição na linha "+(i+1)+" na coluna "+(j+1)+" para a matriz: ");
                matriz[i][j] = in.nextInt();

                if(j == 0){
                    m1 += matriz[i][j];
                } else if (j == 1){
                    m2 += matriz[i][j];
                } else{
                    m3 += matriz[i][j];
                }
            }
        }

        m1 = m1 / 3;
        m2 = m2 / 3;
        m3 = m3 / 3;

        System.out.println("Média da coluna 1: "+m1);
        System.out.println("Média da coluna 2: "+m2);
        System.out.println("Média da coluna 3: "+m3);

        in.close();

    }
}
