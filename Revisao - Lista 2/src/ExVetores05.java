import java.util.Scanner;

public class ExVetores05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;

        System.out.println("Informe o número de elementos do vetor: ");
        int val = in.nextInt();

        int vetor[]= new int[val];

        for (int i=0; i < val; i++) {
            System.out.println("Informe um valor para a " + (i + 1) + "° posição do vetor");
            vetor[i] = in.nextInt();
        }

        System.out.println("Informe o valor que deseja saber quantas vezes está no vetor: ");
        int valor = in.nextInt();

        for (int i=0; i < val; i++) {
            if(vetor[i] == valor){
                count++;
            }
        }

        System.out.println("O valor "+valor+" aparece "+count+" vezes no vetor");
        in.close();
    }
}
