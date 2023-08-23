import java.util.Scanner;

public class ExVetores04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean possui=false;

        System.out.println("Informe o número de elementos do vetor: ");
        int val = in.nextInt();

        int vetor[]= new int[val];

        for (int i=0; i < val; i++) {
            System.out.println("Informe um valor para a " + (i + 1) + "° posição do vetor");
            vetor[i] = in.nextInt();
        }

        System.out.println("Informe o elemento que deseja saber se esta no vetor: ");
        int elemento = in.nextInt();

        for (int i=0; i < val; i++) {
            if (vetor[i] == elemento){
                possui = true;
            }
        }

        if (possui){
            System.out.println("O elemento "+elemento+" está presente no vetor");
        } else {
            System.out.println("O elemento "+elemento+" não está presente no vetor");
        }

        in.close();

    }
}
