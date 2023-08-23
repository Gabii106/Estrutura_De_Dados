import java.util.Scanner;

public class ExVetores01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double vetor[] = new double[5];
        double soma=0;

        for (int i=0; i<5;i++){
            System.out.println("Informe um valor para a "+(i+1)+"° posição do vetor");
            vetor[i] = in.nextInt();

            soma += vetor[i];
        }

        double media = soma/5;

        System.out.println("A média dos valores do vetor é "+media);
        in.close();
    }
}
